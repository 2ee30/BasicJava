package test.dto;
/*
 *  Data Transfer Object 클래스 정의하기
 */
public class MemberDto {
	// 1. private 접근 지정자로 필드를 정의한다.
	private int num;
	private String name;
	private String addr;
	
	// 2. default 생성자를 정의한다.
	public MemberDto() {}
	// 3. 생성자의 인자로 모든 필드의 값을 전달받는 생성자를 만든다.
	public MemberDto(int num, String name, String addr) {
		super();
		this.num = num;
		this.name = name;
		this.addr = addr;
	}
	// 4. 필드의 접근 메소드를 만든다(setter, getter 메소드)
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddr() {
		return addr;
	}
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
}
