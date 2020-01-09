package test.mypac;

public class SmartPhone extends HandPhone{

	public void doInternet(){
		System.out.println("인터넷을 해요");
	}
	
	// 부모 클래스 (HandPhone) 클래스에 정의된 메소드 재정의(Override) 하기
	@Override
	public void takePicture() {
		System.out.println("1000만 화소의 사진을 찍어요");
	}
}
