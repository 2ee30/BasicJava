package test.main;

import java.net.Socket;

public class ClientMain {
	public static void main(String[] args) {
		Socket socket=null;
		try {
			// new Socket(접속할 ip 주소, port 번호)
			socket=new Socket("192.168.0.2", 5000);
			System.out.println("Socket 연결 성공");
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
