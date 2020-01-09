package test.main;

import test.main.MainClass01.CounterThread;

public class MainClass04 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		Thread t=new Thread(new Runnable() {

			@Override
			public void run() {
				System.out.println("새로운 스레드가 시작 되었습니다.");
				try {	
					Thread.sleep(10000);
			}catch (InterruptedException e) {
				e.printStackTrace();
			}
				System.out.println("새로운 스레드가 종료 됩니다.");
			}
		});
		t.start();
		
		draw();
		System.out.println("main 메소드가 종료됩니다.");
	}
	public static void draw() {
		System.out.println("5초 동안 그림을 그려요");
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}//MainClass
