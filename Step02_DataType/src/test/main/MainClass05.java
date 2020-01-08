package test.main;
/*
 *  [ Java 참조 데이터 type ]
 *  
 *  String
 *  
 *  - 문자열을 다룰때 사용하는 데이터 type 이다.
 */
public class MainClass05 {
	public static void main(String[] args) {
		String name="김구라";
		String msg="안녕하세요!";
		String fortune="동쪽으로 가면 귀인을 만나요";
		String fortuneToday="행신동으로 가면 반장님을 만나요!";
		
		//name 안에 들어 있는 참조값을 tmp1 변수에 대입하기(참조값 복사)
		String tmp1=name;
		String tmp2=msg;
		
		//String type 객체의 메소드 호출하기 
		
		int a = tmp1.length();
	}
}








