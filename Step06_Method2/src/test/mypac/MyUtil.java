package test.mypac;
/*
 * [메소드를 만들때 고려해야할 사항]
 * 
 * 1. 접근 지정자
 * 2. static or non static
 * 3. return type
 * 4. 메소드명
 * 5. 메소드에 전달 받는 인자의 갯수와 데이터 type 
 */
public class MyUtil {
	// 날씨를 콘솔창에 출력하는 메소드
	public static void showWeather() {
		System.out.println("오늘은 첫눈이 와요!");
	}
	public void printWeather() {
		System.out.println("오늘은 쌀쌀해요!");
	}
	public String getWeather() {
		String msg="오늘은 흐려요";
		return msg;
	}
	//pen 객체를 리턴해주는 메소드
	public Pen getPen() {
		Pen p=new Pen();
		return p;
	}
	public MyUtil fire() {
		System.out.println("빵~");
		// this는 메소드를 감싸고 있는 클래스로 생성된 객체의 참조값을 가리킨다.
		return this;
	}
	//인자로 전달 받은 int type 을 콘솔에 출력하는 메소드
	public void showNum(int num) {
		System.out.println("num:"+num);
	}
	// int type 과 String type 을 전달 받는 메소드
	public void showInfo(int num, String name) {
		System.out.println("num:"+num+" name:"+name);
	}
	// pen type을 전달 받는 메소드
	public void usePen(Pen p) {
		p.write();
	}
}