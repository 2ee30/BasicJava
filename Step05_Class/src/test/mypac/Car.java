package test.mypac;
/*
 * [클래스의 용도]
 * 
 * 1. static 필드나 메소드를 감싸는 역할
 * 2. 객체의 설계도 역할
 * 3. Data Type 역할
 */
public class Car {
	// 제조사
	public String brand=null;
	
	// 달리는 기능
	public void drive() {
		System.out.println("달려요~!");
	}
	public void showBrand() {
		System.out.println("제조사:"+this.brand);
	}
}
