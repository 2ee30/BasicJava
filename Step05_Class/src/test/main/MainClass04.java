package test.main;

import test.mypac.Car;

public class MainClass04 {
	public static void main(String[] args) {
		// Car type의 참조값을 담을 수 잇는 car1이라는 이름의 빈 지역변수 만들기
		Car car1=null;
		// car1에 Car 객체의 참조값을 담아보세요.
		car1=new Car();
		
		Car car2=null;
		// car2에 참조값이 없기 때문에 실행하면 에러 발생
		car2.drive();
	}
}
