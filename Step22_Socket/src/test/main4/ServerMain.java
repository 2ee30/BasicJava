package test.main4;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.ArrayList;
import java.util.List;

import org.json.JSONObject;

public class ServerMain {
	//클라이언트를 응대 하는 스레드 객체의 참조값을 담을 ArrayList
	static List<ServerThread> threadList=new ArrayList<>();
	
	public static void main(String[] args) {
		
		ServerSocket serverSocket=null;
		try {
			//5000번 port 를 사용할 준비를 한다. 
			serverSocket=new ServerSocket(5000);
			System.out.println("클라이언트의 연결 요청을 대기중 입니다...");
			while(true) {
				//5000 번 port의 연결 요청을 기다린다.
				Socket socket=serverSocket.accept();
				//새로운 스레드를 만들어서 시작 시킨다.
				ServerThread t=new ServerThread(socket);
				t.start();
				//스레드를 ArrayList 에 누적 시키기 
				threadList.add(t);
			}
			
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(serverSocket!=null)serverSocket.close();
			}catch(Exception e) {}
		}
		System.out.println("ServerMain main() 메소드가 종료 됩니다.");
	}//main()
	
	//inner  클래스로 스레드를 생성할  클래스 설계하기 
	static class ServerThread extends Thread{
		//필드
		private Socket socket;
		private BufferedWriter bw;
		private String chatName;
		
		//생성자 
		public ServerThread(Socket socket) {
			//생성자의 인자로 전달된 클라이언트와 연결된 Socket 객체의 참조값을
			//필드에 저장한다. 
			this.socket=socket;
		}
		//대화명을 리턴해주는 메소드 
		public String getChatName() {
			return chatName;
		}
		
		@Override
		public void run() {
			//클라이언트를 응대 하기 
			try {
				//클라이언트로 부터 입력받을 객체의 참조값 얻어오기 
				BufferedReader br=new BufferedReader
						(new InputStreamReader(socket.getInputStream()));
				this.bw=new BufferedWriter
						(new OutputStreamWriter(socket.getOutputStream()));
				while(true) {
					//반복문 돌면서 전송된 문자열이 있으면 읽어온다. 
					String json=br.readLine();
					System.out.println(json);
					//클라이언트가 전송한 json 문자열을 읽어온다.
					JSONObject jsonObj=new JSONObject(json);
					String type=jsonObj.getString("type");
					if(type.equals("enter")) {
						//대화명을 스레드의 필드에 저장하기
						String chatName=jsonObj.getString("chatName");
						this.chatName=chatName;
						//대화명 중개 하기 
						broadcastChatName();
					}
					//반복문 돌면서 모든 스레드의  
					for(ServerThread tmp:threadList) {
						//broadcast()  메소드를 호출하면서 문자열 전달 
						tmp.broadcast(json);
					}
				}
			}catch(Exception e) {
				e.printStackTrace();
			}//try
			//접속 종료된 스레드 제거하기
			threadList.remove(this);
			
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("type", "leave");
			jsonObj.put("chatName", chatName);
			
			try {
				for(ServerThread tmp:threadList) {
					tmp.broadcast(jsonObj.toString());
				}
				broadcastChatName();
			}catch(Exception e) {
				e.printStackTrace();
			}
			
		}// run()
		
		//전송된 문자열을 중개 하는 메소드 
		public void broadcast(String msg) throws IOException {
			bw.write(msg);
			bw.newLine();
			bw.flush();
		}
		
		//쳇팅방 참여자 목록을 중개 하는 메소드
		public void broadcastChatName() throws IOException {
			//쳇팅 참여자 목록을 얻어내서 
			List<String> names=new ArrayList<>();
			for(ServerThread tmp:threadList) {
				names.add(tmp.getChatName());
			}
			//json 문자열로 구성하고 
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("type", "update");
			jsonObj.put("names", names);
			//모든 클라이언트에게 중개하기 
			for(ServerThread tmp:threadList) {
				tmp.broadcast(jsonObj.toString());
			}
		}
		
	}//class ServerThread
}












