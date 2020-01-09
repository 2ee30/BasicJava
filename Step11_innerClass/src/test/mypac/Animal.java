package test.mypac;

public class Animal {
	/*
	 * 클래스 안에 정의할 수 있는 목록
	 * - 생성자
	 * - 필드
	 * - 메소드
	 * - 클래스(innerclass)
	 * - 인터페이스
	 */
	// Monkey 객체를 생성해서 리턴해주는 메소드
	public Monkey getMonkey() {
		return new Monkey();
	}
	// Rabbit 객체를 생성해서 리턴해주는 메소드
	public Rabbit getRabbit() {
		return new Rabbit();
	}
	// 클래스 안에 정의된 클래스는 내부 클래스 (innerClass)이다.
	public class Monkey{
		public void say() {
			System.out.println("안녕! 나는 원숭이야!");
		}
	}
	public class Rabbit{
		public void say() {
			System.out.println("안녕! 나는 토끼야!");
		}
	}
	
}
