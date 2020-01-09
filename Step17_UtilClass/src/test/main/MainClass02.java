package test.main;

import java.util.ArrayList;

public class MainClass02 {
	public static void main(String[] args) {
		/*
		 * 기본 data type은 Generic class 로 지정할 수 없다.
		 * 따라서, 기본 데이터 type을 Generic으로 지정을 하려면
		 * 기본 data type 의 객체형을 사용해야 한다.
		 */
		ArrayList<Integer> nums=new ArrayList<>();
		nums.add(10);
		nums.add(20);
		nums.add(30);
		
		// 반복문 돌면서
		for(int i=0; i<nums.size(); i++) { // 방에 size() 참조하는 방법
			// i 번째 방에서 저장된 값 참조해서
			Integer tmp=nums.get(i); // 특정 참조값 가져오는 방법
			// 사용하기
			System.out.println(tmp);
		}
		// 확장 for문 반복문 활용하기
		System.out.println("확장 for 문을 활용하면");
		for(Integer tmp:nums) {
			System.out.println(tmp);
		}
	}
}
