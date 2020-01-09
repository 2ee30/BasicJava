package test.mypac;

public class MyPhone extends SmartPhone{
	
	// phone 클래스에 정의된 call 메소드 재정의 하기
	@Override
	public void call() {
		System.out.println("전화를 걸려다가 꿀밤을 한대 때려요!");
	}
	
	@Override
	public void takePicture() {
		System.out.println("멋진 사진을 찍어서 공유해요");
	}
}
