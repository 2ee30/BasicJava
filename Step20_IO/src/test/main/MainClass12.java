package test.main;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class MainClass12 {
	public static void main(String[] args) {
		File f1=new File("c:/myFolder/memo.txt");
		
		try {
			//파일에서 문자열을 읽어들일 객체 생성
			FileReader fr=new FileReader(f1);
			BufferedReader br=new BufferedReader(fr);
			//반복문 돌면서 한글자씩 읽어내기
			while(true) {
				// 개행기호 빼고 한 줄의 문자열 읽어오기
				String line=br.readLine();
				if(line==null)break; // 다 읽어왔으면 반복문 탈출
				System.out.print(line);
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}catch(IOException ioe) {
			ioe.printStackTrace();
		}
	}
}











