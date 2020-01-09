package test.main;

public class MainClass07 {
	
	static int totalMoney=100000;
	
	public static void main(String[] args) {
		new MoneyThread("김구라").start();
		new MoneyThread("해골").start();
	}
	/*
	 *  여러개의 스레드가 경쟁적으로 호출하는 메소드에 synchronized 예약어
	 *  붙이면 하나의 스레드가 작업을 끝낼때까지 다른 스레드는 기다리게 함으로써
	 *  문제가 발생할 가능성을 없애준다.
	 */
	//호출 될 때마다 1원씩 리턴해주는 메소드 
	public synchronized static int getMoney() {
		if(totalMoney == 0) {
			System.out.println("잔고가 없어요");
			return 0;
			
		}
		totalMoney--;
		return 1;
	}
}
