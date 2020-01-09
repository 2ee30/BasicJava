package test.main;

import java.util.HashSet;
import java.util.Set;

public class MainClass10 {
	public static void main(String[] args) {
		HashSet<Integer> set1=new HashSet<>();
		set1.add(10);
		set1.add(20);
		set1.add(30);
		set1.add(40);
		HashSet<Integer> set2=new HashSet<>();
		set2.add(30);
		set2.add(40);
		set2.add(50);
		set2.add(60);
		// set1에 set2를 합치기 (set1을 set1과 set2의 합집합으로 만들기)
		// set1.addAll(set2);
		
		// set1을 set1과 set2의 교집합으로 만들기
		// set1.retainAll(set2);
		
		// set1을 set1에서 set2를 뺀 차집합으로 만들기
		set1.removeAll(set2);
		
		// set2가 set1의 부분집합인지 여부
		boolean result=set1.containsAll(set2); // false
	}
}
