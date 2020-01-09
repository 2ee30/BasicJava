package test.main;

import test.mypac.HandPhone;
import test.mypac.Phone;
import test.mypac.SmartPhone;

public class MainClass01 {
	public static void main(String[] args) {
		// Phone 객체의 기능 사용해 보기
		Phone p1=new Phone();
		p1.call();
		System.out.println("-----");
		// HandPhone 객체의 기능 사용해보기
		HandPhone p2=new HandPhone();
		p2.call();
		p2.mobileCall();
		p2.takePicture();
		System.out.println("-----");
		// SmartPhone 객체의 기능 사용해보기
		SmartPhone p3=new SmartPhone();
		p3.mobileCall();
		p3.takePicture();
		p3.doInternet();
	}
}
