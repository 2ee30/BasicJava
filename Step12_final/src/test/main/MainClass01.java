package test.main;

public class MainClass01 {
	public static void main(String[] args) {
		/*
		 * 변수나 필드를 선언할 때 final 예약어를 붙여주면 값을 변경할 수 없다.
		 * 즉, 상수가 된다.
		 * 관례상 final 변수나  필드의 이름은 모두 대문자로 표기한다.
		 */
		// 원주율
		final double PI=3.14159;
		// 원의 반지름
		double r=10;
		// 원의 넓이
		double area=PI*r*r;
		
		System.out.println("area:"+area);
	}
}
