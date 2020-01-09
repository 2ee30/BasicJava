package test.main2;

import java.io.BufferedWriter;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Scanner;

public class ClientMain {
	public static void main(String[] args) {
		System.out.print("서버에 전송할 문자열:");
		Scanner scan=new Scanner(System.in);
		String msg=scan.nextLine();
		
		Socket socket=null;
		try {
			// new Socket(접속할 ip 주소, port 번호)
			socket=new Socket("192.168.0.2", 5000);
			System.out.println("Socket 연결 성공");
			//서버에 출력할수 있는 객체의 참조값 얻어오기 
			OutputStream os=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			BufferedWriter bw=new BufferedWriter(osw);
			bw.write(msg);//문자열을 서버에 출력하기
			bw.newLine();//개행기호 출력
			bw.flush();//밀어내기 
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			try {
				if(socket!=null)socket.close();
			}catch(Exception e) {}
		}
		System.out.println("ClientMain main() 메소드가 종료 됩니다.");
	}
}
