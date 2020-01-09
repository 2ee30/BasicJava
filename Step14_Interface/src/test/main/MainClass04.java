package test.main;

import test.mypac.Drill;

public class MainClass04 {
	public static void main(String[] args) {
		useDrill(new Drill() {

			@Override
			public void hole() {
				System.out.println("학원 천장에 구멍을 뚫어요!");
			}
		});
		// 람다식을 이용해서 인터페이스 type 의 참조값 전달하기
		useDrill(()->{
			System.out.println("학원 바닥에 구멍을 뚫어요!");
		});
		
		useDrill(()->{
			System.out.println("학원 벽에 구멍을 뚫어요!");
		});
		
		Drill d1=()->{
			System.out.println("원장실에 구멍을 뚫어요!");
		};
		useDrill(d1);
	}
	
	public static void useDrill(Drill d) {
		d.hole();
		System.out.println("- Drill 객체 사용 완료 -");
	}
}
