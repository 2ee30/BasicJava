package test.mypac;
/*
 * 인터페이스는 implements (구현) 하는 것이다.
 */
public class TvRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("TV 볼륨을 올려요!");
	}
	@Override
	public void down() {
		System.out.println("TV 볼륨을 낮춰요!");
	}
}
