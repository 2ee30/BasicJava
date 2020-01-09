package test.mypac;

public class Pen {
	// 필드
	private String color;
	// 생성자
	public Pen(String color) {
		this.color=color;
	}
	// 메소드
	public void write() {
		System.out.println(this.color+" 색으로 필기를 해요");
	}
}
