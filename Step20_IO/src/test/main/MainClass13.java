package test.main;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class MainClass13 {
	public static void main(String[] args) {
		FileInputStream fis=null;
		FileOutputStream fos=null;
		try {
			// 파일로부터 읽어들일 객체의 참조값
			fis=new FileInputStream("c:/myFolder/kim1.png");
			// 파일에 출력할 객체의 참조값
			fos=new FileOutputStream("c:/myFolder/kim11.png");
			while(true) {
				// 1byte를 읽어들이고 
				int data=fis.read();	
				if(data==-1)break; // 다 읽었으면 반복문 탈출.
				// 읽어들인 1byte 출력하기
				fos.write(data);
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
