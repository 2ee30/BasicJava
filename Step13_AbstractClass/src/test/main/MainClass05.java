package test.main;

import test.mypac.Weapon;

public class MainClass05 {
	public static void main(String[] args) {
		// useWeapon 메소드를 호출해보세요.
		Weapon w1=new Weapon(){
			@Override
			public void attack() {
				System.out.println("공격하라");
			}
		};
		useWeapon(w1);
	}
	
	public static void useWeapon(Weapon w) {
		w.prepare();
		w.attack();
	}
}
