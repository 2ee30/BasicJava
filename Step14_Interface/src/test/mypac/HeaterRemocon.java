package test.mypac;

public class HeaterRemocon implements Remocon{

	@Override
	public void up() {
		System.out.println("온도를 올려요!");
	}
	@Override
	public void down() {
		System.out.println("온도를 낮춰요!");
	}
}
