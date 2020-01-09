package test.main;

import java.util.ArrayList;

public class MainClass01 {
	public static void main(String[] args) {
		// String type을 담을 수 있는 가변 배열 객체 생성해서 참조값을 변수에 담기
		ArrayList<String> names=new ArrayList<>();
		names.add("김구라");
		names.add("해골");
		names.add("원숭이");
		
		// 배열의 방의 크기 참조
		int size=names.size();
		
		// 0번방에 저장된 참조값 얻어오기
		String name0=names.get(0);
		
		// 1번방 삭제하기
		names.remove(1);
		
		// 모든 방 삭제하기
		names.clear();
	}
}
