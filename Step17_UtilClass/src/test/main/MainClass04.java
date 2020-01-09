package test.main;

import java.util.ArrayList;
import test.auto.Car;
import test.auto.Engine;


public class MainClass04 {
	public static void main(String[] args) {
		// 1.Car type 을 담을 수 있는 가변배열 객체를 생성해서 참조값을 
		//   cars 라는 지역 변수에 담기
		ArrayList<Car> cars=new ArrayList<>();
		// 2.cars 배열에 Car 객체를 각각 3개 생성해서 담아보세요.
		Car p1=new Car(new Engine());
		Car p2=new Car(null);
		Car p3=new Car(null);
		cars.add(p1);
		cars.add(p2);
		cars.add(p3);
		
		// 3.반복문을 이용해서 cars 배열에 저장된 Car 객체의 참조값을 순서대로 이용해
		//   .drive() 메소드를 호출해보세요.
		for(int i=0; i<cars.size(); i++) {
			Car tmp=cars.get(i);
			tmp.drive();
			
		// 확장 for문 활용
//		for(Car tmp:cars) {
//			tmp.drive();
//		}
		}
	}
}
