package test.main;

import java.util.HashMap;
import java.util.Map;

import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MainClass08 {
	public static void main(String[] args) {
		//새로 추가할 회원의 정보이다.
		int num=6;
		String name="돼지";
		String addr="독산동";
		//3개의 정보를 HashMap 객체에 담기?
		Map<String, Object> map=new HashMap<>();
		map.put("번호", num);
		map.put("이름", name);
		map.put("주소", addr);
		
		//저장할 회원의 정보를  MemberDto 객체에 담기
		MemberDto dto=new MemberDto(num, name, addr);
		
		MemberDao dao=new MemberDao();
		//dao.insert(num, name, addr);
		//dao.insert(map);
		//dao.insert(dto);
		
		//insert() 메소드를 이용해서 회원정보를 추가하고 성공여부를 리턴 받는다.
		boolean isSuccess=dao.insert(dto);
		
		if(isSuccess) {
			System.out.println("회원 정보 추가 성공.");
		}else {
			System.out.println("회원 정보 추가 실패.");
		}
		
	}
}
