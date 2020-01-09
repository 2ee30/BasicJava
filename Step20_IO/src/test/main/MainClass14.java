package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass14 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			// 파일로부터 읽어들일 객체의 참조값
			fis=new FileInputStream("c:/myFolder/kim1.png");
			// 파일에 출력할 객체의 참조값
			fos=new FileOutputStream("c:/myFolder/kim22.png");
			// while 문에서 사용할 byte[] 객체 생성하기
			byte[] buffer=new byte[1024]; // 1번에 1kilo byte씩 읽을 수 있다.
			while(true) {
				/*
				 * .read() 메소드를 호출하면서 byte[] 객체를 전달하면
				 * 읽어들인 byte 알갱이가 byte[] 객체에 순서대로 담긴다.
				 * return 되는 정수는 몇개를 읽었는지 숫자가 리턴된다.
				 * 1024, 1024, 1024, ... 가 리턴되다가 마지막에는 
				 * 1024 보다 작은 숫자가 리턴 될 가능성이 크다.
				 */
				int readedByte=fis.read(buffer);
				if(readedByte==-1)break;
				// byte[] 배열에 있는 값을 0번 인덱스부터 읽은 만큼 출력한다.
				fos.write(buffer, 0, readedByte);
				fos.flush();
			}
			System.out.println("파일을 복사 했습니다.");
		}catch(Exception e) {
			e.printStackTrace();
		}finally {
			
			try {
				if(fis!=null)fis.close();
				if(fos!=null)fos.close();
			} catch (IOException ioe) {
				
				ioe.printStackTrace();
			}
		} //try
	} //main
} //class
