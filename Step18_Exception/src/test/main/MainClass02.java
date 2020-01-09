package test.main;
/*
 * Excepion의 종류
 * 
 * 1. 실행시에 발생하는 Exception
 * 		- RuntimeException을 상속 받은 예외 type이다.
 * 		- try~catch 블럭을 작성해도 되고 안해도 된다.
 * 
 * 2. 컴파일시에 발생하는 Exception
 * 		- RuntimeException을 상속 받지 않은 예외 type 이다.
 * 		- 반드시 try~catch 블럭을 작성해야 한다.
 */
public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println("main 메소드가 종료 되었습니다.");
	}
}
