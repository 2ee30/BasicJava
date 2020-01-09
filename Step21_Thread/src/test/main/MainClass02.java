package test.main;

import test.main.MainClass01.CounterThread;

public class MainClass02 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		// Thread 객체를 생성하면서 생성자의 인자로 Runnable 객체를 넣어주고
		Thread t=new Thread(new DanceThread());
		// 생성된 Thread 객체의 start() 메소드를 호출하면 새로운 스레드가 시작된다.
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
	/*
	 * - 새로운 작업단위(Thread) 만들기
	 * 1. Runnable 인터페이스를 구현한 클래스를 정의한다. 
	 * 2. run() 메소드를 오버라이드 한다.
	 * 3. Thread 클래스의 생성자로 Runnable 인터페이스를 구현한 클래스로
	 * 	    생성한 객체를 전달해서 Thread 객체를 생성한다.
	 * 4. 생성한 Thread 객체의 start() 메소드를 호출하면 새로운
	 * 	    스레드가 시작된다.
	 */
	static class DanceThread implements Runnable {

		@Override
		public void run() {
			System.out.println("새로운 스레드가 시작 되었습니다.");
			int count=0;
			while(true) {
				try {
				Thread.sleep(1000);
				}catch(InterruptedException e){
					e.printStackTrace();
				
				}
				count++;
				System.out.println(count+" 번째 춤을 춰요~");
				if(count==10)break;
			
			}//run
		}
	}//DanceThread
}//MainClass
