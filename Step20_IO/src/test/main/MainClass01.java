package test.main;

import java.io.IOException;
import java.io.InputStream;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 *  1byte 처리 스트림이다. 
		 *  
		 *  만일 문자 데이터를  InputStream 객체로 입력받는다면 
		 *  영문자, 대소문자, 숫자, 특수문자 까지만 처리할수 있다. (한글불가)
		 */
		InputStream is=System.in;
		System.out.print("한글자 입력:");
		try {
			//입력한 문자의 code 값이 반환 된다. 
			int code=is.read();
			System.out.println("code:"+code);
			//code 값을 문자로 변환하기
			char ch=(char)code;
			System.out.println("ch:"+ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 종료 됩니다.");
	}
}











