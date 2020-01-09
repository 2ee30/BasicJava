package test.main;

import java.util.List;

import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MainClass09 {
	public static void main(String[] args) {
		MemberDao dao=new MemberDao();
		//회원 한명을 추가하려면
		MemberDto dto=new MemberDto(7, "개다리", "용인");
		dao.insert(dto);
		
		//회원 한명의 정보를 수정하려면?
		MemberDto dto2=new MemberDto(7, "김승호", "용인");
		dao.update(dto2);
		
		//회원 한명의 정보를 삭제 하려면? (7번 회원의 정보)
		dao.delete(7);
		
		//회원 한명의 정보를 얻어오려면? (1번 회원의 정보)
		dao.getData(1);
		
		//회원 전체의 목록을 얻어오려면?
		List<MemberDto>list=dao.getList();
	}
}
