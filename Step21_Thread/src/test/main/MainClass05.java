package test.main;

public class MainClass05 {
	public static void main(String[] args) {
		//Runnable type을 람다식으로 표현하기
		new Thread(()->{
			//여기는 새로운 스레드가 시작되는 run() 메소드 입니다.
			System.out.println("새로운 스레드가 시작 되었습니다.");
		}).start();
	}
}
