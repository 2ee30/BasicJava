package test.mypac;

public class Counter {
	
	// int type 을 저장할 public static field 정의하기(메소드 속 지역변수 선언하듯이, 메소드 안만 아니면 ok)
	public static int count=0;
	
	public static void addCount() {
		// 이 메소드가 몇번 호출되었는지 자체적으로 저장을 하고 싶다면?
		Counter.count++;
	}
}
