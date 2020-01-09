package test.mypac;

public class Dragon {
	// 체력
	public int enegy=200;
	// 공격력
	public static int attDemage=20;
	
	// 공격하는 메소드
	public void attack() {
		System.out.println(Dragon.attDemage+" 의 데미지의 공격을 해요");
	}
	// 움직이는 메소드
	public void move() {
		System.out.println("움직여요");
	}
	// 데미지를 입는 메소드 (에너지를 줄이는)
	public void demage() {
		this.enegy -=10;
	}
}
