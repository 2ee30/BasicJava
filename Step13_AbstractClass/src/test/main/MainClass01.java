package test.main;

import test.mypac.MyWeapon;
import test.mypac.Weapon;

public class MainClass01 {
	public static void main(String[] args) {
		// MyWeapon 객체를 생성해서 MyWeapon type 지역 변수에 담기
		MyWeapon w1=new MyWeapon();
		// MyWeapon 객체를 생성해서 Weapon type 지역 변수에 담기
		Weapon w2=new MyWeapon();
		w1.prepare();
		w1.attack();
		System.out.println("-----");
		w2.prepare();
		w2.attack();
	}
}
