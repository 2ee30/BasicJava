package test.main;

public class MainClass08 {
	public static void main(String[] args) {
		int count=0;
		while(true) { // 무한 Loop
			System.out.println("반복 수행중 ...");
			count++;
			if(count==10) { // 무한 loop 탈출 조건
				break; // 반복문 탈출하는 예약어
			}
		}
	}
}
