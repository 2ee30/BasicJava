package test.main;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass11 {
	public static void main(String[] args) {
		File f1=new File("c:/myFolder/memo.txt");
		
		try {
			//파일에서 문자열을 읽어들일 객체 생성
			FileReader fr=new FileReader(f1);
			//반복문 돌면서 한글자씩 읽어내기
			while(true) {
				//FileReader 객체를 통해서 읽어들이고 
				int code=fr.read(); 
				if(code==-1) {//더이상 읽을게 없으면 
					break;//반복문 탈출
				}
				//code 값을 char type 으로 변환해서
				char ch=(char)code;
				//출력하기
				System.out.print(ch);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}











