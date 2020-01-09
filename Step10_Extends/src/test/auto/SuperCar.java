package test.auto;

public class SuperCar extends Car{
	
	// Engine 객체를 생성자의 인자로 전달 받는 생성자
	public SuperCar(Engine engine) {
		// 부모 생성자에 전달하기(딴짓하지 말고 '가장 첫줄'에 작성해야 한다.)
		super(engine); // super() 는 부모 생성자를 의미한다.
	}
	
	@Override
	public void drive() {
		if(this.engine==null) {
			System.out.println("Engine 객체가 없어서 달릴 수 없어요~");
		}else {
			System.out.println("겁나 빠르게 달려요!");
		}
		
	}
}
