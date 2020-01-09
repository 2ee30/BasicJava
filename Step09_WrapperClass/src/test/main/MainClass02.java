package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		String strNum="999";
		String strNum2="10.1";
		// Integer 클래스의 static 메소드를 이용해서
		// 숫자 형태의 문자열을 실제 정수로 바꾸기
		int num1=Integer.parseInt(strNum);
		int result=Integer.parseInt(strNum)+10;
		
		// Double 클래스의 static 메소드를 이용해서
		// 숫자 형태의 문자열을 실제 실수로 바꾸기~
		double num2=Double.parseDouble(strNum2);
		double result2=Double.parseDouble(strNum2)+10.2;
		
		// 정수를 문자열로 만들기
		String a=Integer.toString(10); // "10"
		// 실수를 문자열로 만들기
		String b=Double.toString(10.1); // "10.1"
	}
}
