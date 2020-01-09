package test.main;

import test.mypac.Animal;
import test.mypac.Animal.Monkey;
import test.mypac.Animal.Rabbit;

public class MainClass01 {
	public static void main(String[] args) {
		Animal ani=new Animal();
		// 메소드를 이용해서 Monkey 객체의 참조값 얻어오기
		Monkey m=ani.getMonkey();
		// 메소드를 이용해서 Rabbit 객체의 참조값 얻어오기
		Rabbit r=ani.getRabbit();
		// Monkey, Rabbit 객체의 메소드 호출하기
		m.say();
		r.say();
	}
}
