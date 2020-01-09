package test.main;

import java.io.File;

public class MainClass07 {
	public static void main(String[] args) {
		// c:/myFolder 를 Access 하고 싶다면?
		
		// new File(Access 하고 싶은 폴더나 파일의 경로)
		File f=new File("c:/myFolder");
		if(f.isDirectory()) {
			System.out.println("디렉토리 입니다.");
		}
		//디렉토리 안에 있는 파일명이나 디렉토리명을 String[] 로 얻어내기
		String[] list=f.list();
		
		//반복문 돌면서 파일명이나 디렉토리명을 출력해 보기
		for(String tmp:list) {
			System.out.println(tmp);
		}
	}
}







