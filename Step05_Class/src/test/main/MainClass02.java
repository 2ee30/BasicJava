package test.main;

import test.mypac.Car;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 *  달려야 한다면?
		 */
		Car c1=new Car();
		c1.drive();
		// Car type 객체의 field 에 String type 참조값 대입하기
		c1.brand="테슬라";
		c1.showBrand();
	}
}