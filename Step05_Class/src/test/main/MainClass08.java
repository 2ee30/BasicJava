package test.main;

import java.util.Random;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 *  1~45 사이의 랜덤한 정수를 5번 얻어내서 콘솔창에 출력하기
		 */
		
//		int result1=new Random().nextInt(45)+1;
//		int result2=new Random().nextInt(45)+1;
//		int result3=new Random().nextInt(45)+1;
//		int result4=new Random().nextInt(45)+1;
//		int result5=new Random().nextInt(45)+1;
//		System.out.println(result1);
//		System.out.println(result2);
//		System.out.println(result3);
//		System.out.println(result4);
//		System.out.println(result5);
		
		// 반복문을 활용한다면...
		Random ran=new Random();
		for(int i=0; i<5; i++) {
			int resulti=ran.nextInt(45)+1;
			System.out.println(resulti);
		}
	}
}
