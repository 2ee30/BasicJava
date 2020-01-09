package test.mypac;
/*
 *  [interface]
 *  
 *  - 생성자가 없다 (단독 객체 생성 불가)
 *  - 구현된 메소드는 가질 수 없다 (추상 메소드만 가질 수 있다.)
 *  - 필드는 static final 필드만 가질 수 있다.
 *  - data type 의 역할을 할 수 있다.
 *  - 인터페이스 type의 참조값이 필요하다면 해당 인터페이스를 implements한
 *    클래스를 이용해서 객체를 생성해서 얻어낸다.
 *  - 인터페이스는 다중 implements 가 가능하다. (클래스는 단일 extends 가능)
 */
public interface Remocon {
	// static final 상수
	public static final String COLOR="#000000"; // final 이니 대문자 작성
	// 추상 메소드
	public void up();
	public void down();
}

