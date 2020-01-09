package test.main;

import test.mypac.Weapon;
import test.mypac.YourWeapon;

public class MainClass02 {
	public static void main(String[] args) {
		// 다른 공격을 하는 Weapon type 의 참조값을 얻어내서
		// .prepare() .attack() 메소드를 호출해보세요.
		Weapon w1=new YourWeapon();
		w1.prepare();
		w1.attack();
	}
}
