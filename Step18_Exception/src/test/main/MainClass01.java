package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MainClass01 {
	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		// Exception이 발생할 수 있는 code 블럭을 try{} 안에 위치 시킨다.
		try {
			System.out.print("나눌 수 입력(젯수):");
			int num1=scan.nextInt();
			
			System.out.print("나누어 지는 수 입력(피젯수):");
			int num2=scan.nextInt();
			
			int result=num2/num1;
			
			System.out.println(result);
		}catch(InputMismatchException ime) { // catch(예외 type 변수)
			System.out.println("숫자 형태로 입력해라~");
			ime.printStackTrace(); // stack에서 일어난 정보를 출력해라
		}catch(ArithmeticException ae) {
			System.out.println("0으로 나눌수는 없단다~");
			ae.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료됩니다.");
	}
}
