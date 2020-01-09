package test.main;

import test.auto.Engine;
import test.auto.SuperCar;

public class mainClass07 {
	public static void main(String[] args) {
		SuperCar car1=new SuperCar(new Engine());
		car1.drive();
		
		SuperCar car2=new SuperCar(null);
		car2.drive();
	}
}
