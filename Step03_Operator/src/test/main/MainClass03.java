package test.main;
/*
 * [연산자]
 * 
 * 3.비교 연산자
 * 
 * 종류: ==, !=, >, >=, <, <=
 * 
 * - 비교 연산의 결과는 boolean type으로 나타난다.
 */
public class MainClass03 {
	public static void main(String[] args) {
		
		boolean result1 = 10 == 10; //true
		
		boolean result2 = 10 != 10; //false
		
		boolean result3 = 10 > 100; //false
		
		boolean result4 = 10 >= 10; //true
		
		boolean result5 = 10 < 100; //true
		
		boolean result6 = 10 <= 10; //true
		
		String name=null;
		// oracle과 달리 java 에서는 null 값도 비교 가능하다.
		boolean result7 = name == null; //true
		boolean result8 = name != null; //false
	}
}























