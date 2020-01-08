package test.main;
/*
 *  [ Java 기본 데이터 type ]
 *  
 *  1. 숫자형
 *  
 *  정수형 : byte, short, int, long
 *  
 *  - byte 변수명;  // -128 ~ 127
 *  - short 변수명;  // -32768 ~ 32767
 *  - int  변수명; // -2,147,483,648 ~ 2,147,483,647
 *  - long 변수명; // -9223372036854775808 ~ 9,223,372,036,854,775,807
 *  
 *  실수형 : float, double
 *  
 *  - float 변수명; // 1.40129846432481707e-45 ~ 3.40282346638528860e+38
 *  - double 변수명; //4.94065645841246544e-324d ~ 1.79769313486231570e+308d
 */
public class MainClass01 {
	
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		//정수형 변수 종류별로 선언하고 값 대입하기
		byte iByte=127;
		short iShort=10;
		int iInt=10;
		long iLong=10;
		
		/*
		 *  int type 변수에 byte type 변수에 있는 값을 대입하는 것은
		 *  범위가 상대적으로 좁은 범위의 데이터를 넓은 범위의 변수에 대입하는 것이기 
		 *  때문에 오류가 발생하지 않는다. 
		 */
		int tmp=iByte;
		
		// casting 연산자를 이용해서 type 을 byte type 으로 인식시킨다(바꾼다)
		
		byte tmp2 = (byte) iInt;
		
		//실수형 변수 종류별로 선언하고 값 대입하기
		float num1=10.1f;
		double num2=10.2d;
		double num3=10.3; // d는 생략 가능하다 
		
		// float type 을 double type 에 대입하는것은 문제가 없다.
		double tmp3=num1;
		// double type 을 float type  으로 casting 해서 대입하기 
		float tmp4=(float)num2;
	}
	
}






