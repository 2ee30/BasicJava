package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		//국어 점수
		int kor=95;
		//영어 점수
		int eng=100;
		
		//국어 점수와 영어 점수의 평균을 구해서 콘솔창에 출력하고 싶다면?
		
		//두 점수의 합
		int sum=kor+eng;
		/*
		 *  정수와 정수를 연산하면 결과는 정수
		 *  정수와 실수를 연산하면 결과는 실수 가 나온다.
		 *  정확한 실수 값을 얻어내기 위해 
		 *  나누기 할때 두수중에 하나는 실수가 와야 정확한 실수 값이 나온다. 
		 */
		float ave=sum/2f;
		
		System.out.println(ave);
	}
}




