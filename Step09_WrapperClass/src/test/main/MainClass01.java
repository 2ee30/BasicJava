package test.main;
/*
 * [Wrapper Class]
 * 
 * - 기본 data type을 참조 데이터 type으로 포장하고 싶을 때 사용하는 클래스
 * - 기본 data type에 관련된 메소드도 내장되어 있다.
 * 
 * Byte, Short, Integer, Long
 * 
 * Float, Double
 * 
 * Character, Boolean
 */
public class MainClass01 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작되었습니다.");
		int num=10;
		// 정수 10을 객체형으로 받기
		Integer num2=10;
		
		// 기본 Data type과 참조 Data type의 산술 연산이 자유롭다.
		int reseult=num+num2;
		Integer result2=num*num2;
	}
}
