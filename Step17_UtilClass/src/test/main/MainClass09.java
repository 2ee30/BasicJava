package test.main;

import java.util.HashSet;
import java.util.Iterator;

public class MainClass09 {
	public static void main(String[] args) {
		/*
		 * HashSet
		 * 
		 * - 중복을 허용하지 않는다.
		 * - 인덱스 / 키값 / 순서 없다.
		 * - 어떤 데이터 중복을 허용하지 않는 묶음으로 관리하고 싶을 때 사용한다.
		 * 
		 */
		HashSet<String> lunch=new HashSet<>();
		lunch.add("짜장면");
		lunch.add("샌드위치");
		lunch.add("마라탕");
		lunch.add("갈비");
		lunch.add("김치찌개");
		lunch.add("마라탕");
		lunch.add("갈비");
		
		// 저장된 item 의 갯수
		int size=lunch.size();
		
		Iterator<String> it=lunch.iterator();
		// 다음 데이터가 있으면
		while(it.hasNext()) {
			// 커서를 이동해서 해당 커서에 위치한 데이터 얻어오기
			String tmp=it.next();
			System.out.println(tmp);
		}
	}
}
