package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * SmartPhone 객체의 참조값을 다양한 type 으로 받아보기
		 * 다형성(Polymorphism) 테스트
		 */
		
		// p1에 있는 값으로는 모든 기능 사용 가능
		SmartPhone p1=new SmartPhone();
		// p2에 있는 값으로는 HandPhone, Phone, Object 의 기능을 사용가능
		HandPhone p2=new SmartPhone();
		// p3에 있는 값으로는 Phone, Object의 기능 사용가능
		Phone p3=new SmartPhone();
		// p4에 있는 값으로는 Object 의 기능 사용 가능
		Object p4=new SmartPhone();
	}
}
