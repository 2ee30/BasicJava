package test.main;

import java.util.Random;

public class MainClass07 {
	public static void main(String[] args) {
		/*
		 *  Programming 의 목적?
		 *  - 0~100 사이의 랜덤한 정수를 1개를 얻어내서 콘솔창에 출력하기
		 */
		
		int result=new Random().nextInt(101);
		System.out.println(result);
		
		// Random 객체를 생성하고 참조값을 Random type 지역변수 ran에 담기
		Random ran=new Random();
		int result2=ran.nextInt(101);
		System.out.println(result2);
	}
}
