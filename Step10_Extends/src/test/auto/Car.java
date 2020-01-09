package test.auto;
/*
 * [접근 지정자에 대한 정리]
 * 
 * class 접근 지정자 : public, default
 * 생성자, field, method, 접근지정자: public, protected, default, private
 * 
 * public => 어디서든 접근 가능
 * protected => 같은 클래스, 같은 개체, 같은 패키지
 * 				다른 패키지이지만 상속 관계면 접근 가능
 * default => 같은 클래스, 같은 객체, 같은 패키지
 * private => 같은 클래스, 같은 객체
 */
public class Car {
	// 필드
	// protected => 상속관계의  자식에서도 접근 가능
	protected Engine engine;
	// 생성자
	public Car(Engine engine) {
		this.engine=engine;
	}
	// 메소드
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 객체가 없어서 못달려요");
		}else {
			System.out.println("달려요!");
		}
	}
}
