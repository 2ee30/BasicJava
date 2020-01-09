package test.main;

import java.util.Random;

import test.mypac.Weapon;

public class MainClass04 {
	
	static Random ran=new Random();
	
	// Weapon type 의 static 필드
	static Weapon w2=new Weapon() {
		
		@Override
		public void attack() {
			System.out.println("아무데나 공격하기");
			
		}
	};
			
	public static void main(String[] args) {
		// Weapon 추상 클래스 type 의 참조값을 익명의 local inner class를
	    // 이용해서 얻어내기
		
		Weapon w1=new Weapon() {

			@Override
			public void attack() {
				System.out.println("내맘대로 공격해요");
			}
			
		};
		w1.prepare();
		w1.attack();
		
		MainClass04.w2.prepare();
		w2.attack();
	}
}
