package test.main;

import test.mypac.Apple;
import test.mypac.Banana;
import test.mypac.FruitBox;
import test.mypac.Orange;

public class MainClass01 {
	public static void main(String[] args) {
		// Generic 클래스를 Orange로 해서 FruitBox 객체 생성해서 참조값 얻어내기
		FruitBox<Orange> box1=new FruitBox<Orange>();
		// push() 메소드 사용해보기
		box1.push(new Orange());
		// pull() 메소드 사용해보기
		Orange a=box1.pull();
		/*
		 * Generic 클래스를 Apple로 지정해서 위와 동일한 코드를 작성해보세요
		 */
		FruitBox<Apple> box2=new FruitBox<Apple>();
		box2.push(new Apple());
		Apple b=box2.pull();
		/*
		 * Generic 클래스를 Banana로 지정해서 위와 동일한 코드를 작성해보세요
		 */
		FruitBox<Banana> box3=new FruitBox<>(); // java 8.0부터 <> 생략가능, 받을 때만 잘 받기
		box3.push(new Banana());
		Banana c=box3.pull();
	}
}
