package test.main;

import test.mypac.Weapon;

public class MainClass03 {
	// Weapon 추상 클래스를 상속 받은 inner class
	class AWeapon extends Weapon{
		@Override
		public void attack() {
			System.out.println("A형태로 공격을 해요");
			System.out.println("-----");
		}
	}
	public static void main(String[] args) {
		// Weapon 추상 클래스를 상속받은 local inner class
		class BWeapon extends Weapon{
			@Override
			public void attack() {
				System.out.println("B형태로 공격해요");
			}
		}
		
		// non static inner class 를 이용해서 객체 생성
		Weapon w1=new MainClass03().new AWeapon(); // static 이면 MC 제외 가능
		w1.prepare();
		w1.attack();
		
		// local inner class 를 이용해서 객체 생성
		Weapon w2=new BWeapon();
		w2.prepare();
		w2.attack();
	}
}
