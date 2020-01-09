package test.main;

import java.io.File;
import java.io.IOException;

public class MainClass09 {
	public static void main(String[] args) {
		//1. c:/myFolder/memo.txt 파일을 만들고 싶다면?
		File f1=new File("c:/myFolder/memo.txt");
		//2. c:/myFoler/sub 폴더를 만들고 싶다면?
		File f2=new File("c:/myFolder/sub");
		try {
			//새로운 파일을 만들고 성공여부를 리턴 받는다. 
			boolean isSuccess=f1.createNewFile();
			if(isSuccess) {
				System.out.println("파일을 생성 했습니다.");
			}
			//새로운 폴더를 만들고 성공 여부를 리턴 받는다.
			isSuccess=f2.mkdir();
			if(isSuccess) {
				System.out.println("디렉토리를 생성했습니다.");
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}










