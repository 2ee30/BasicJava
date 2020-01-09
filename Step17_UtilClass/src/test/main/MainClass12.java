package test.main;

import java.util.ArrayList;
import test.dto.MemberDto;

public class MainClass12 {
	public static void main(String[] args) {
		System.out.println("main 메소드가 시작 되었습니다.");
		
		MemberDto dto1=new MemberDto(1, "김구라", "노량진");
		MemberDto dto2=new MemberDto(2, "해골", "행신동");
		MemberDto dto3=new MemberDto();
		dto3.setNum(3);
		dto3.setName("원숭이");
		dto3.setAddr("상도동");
		
		// MemberDto 객체를 ArrayList 객체에 순서대로 담아보세요.
		ArrayList<MemberDto> nnn =new ArrayList<>();
		nnn.add(dto1);
		nnn.add(dto2);
		nnn.add(dto3);
		
		// MemberDto 객체에 들어 있는 값 참조해보기
		int a=nnn.get(0).getNum(); // 1
		String b=nnn.get(1).getName(); // "해골"
		
		// List.MemberDto.data type
		ArrayList<MemberDto> c=nnn;
		MemberDto d=nnn.get(0);
		int e=nnn.get(0).getAddr().length();
	}
}
