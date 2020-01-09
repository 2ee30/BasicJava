package test.mypac;

public class MyWeapon extends Weapon{

	// 추상 메소드 Overrider가 강제되어 있다.
	@Override
	public void attack() {
		System.out.println("반장님을 공격해요-!");
	}

}
