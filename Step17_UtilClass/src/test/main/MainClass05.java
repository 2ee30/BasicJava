package test.main;

import java.util.HashMap;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 *  회원 한명의 번호(int), 이름(String), 주소(String)를 하나의 객체로 관리 하고 싶다면?
		 */
		HashMap<String, Object> mem=new HashMap<>();
		// key, value 의 쌍으로 데이터를 저장하고
		mem.put("num", 1);
		mem.put("name", "김구라");
		mem.put("addr", "노량진");
		// 불러올떄는 Object type으로 리턴되니 원래 type 으로 casting한다.
		int num1=(int)mem.get("num");
		String name1=(String)mem.get("name");
		String addr1=(String)mem.get("addr");
		
		// 특정 key 값으로 저장된 데이터 삭제
		mem.remove("addr");
	}
}
