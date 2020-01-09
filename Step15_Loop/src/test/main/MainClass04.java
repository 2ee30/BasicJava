package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		int[] nums= {10, 11, 12, 13, 14, 15, 16, 17, 18, 19};
		/*
		 * 반복문을 이용해서 배열에 저장된 값을 순서대로 참조해서 
		 * 가장 첫번째로 3의 배수가 나오면 해당 숫자를 출력하고
		 * 반복문을 탈출하고 싶다.
		 */
		for(int tmp:nums) {
			int result=tmp%3;
			if(result==0) {
				System.out.println("3의 배수:"+tmp);
				break; //
			}
		}
	}
}
