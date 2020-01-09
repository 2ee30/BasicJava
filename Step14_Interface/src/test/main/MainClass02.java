package test.main;

import test.mypac.Remocon;

public class MainClass02 {
	public static void main(String[] args) {
		class MyRemocon implements Remocon{

			@Override
			public void up() {
				System.out.println("무언가를 올려요");
			}

			@Override
			public void down() {
				System.out.println("무언가를 내려요");
			}
		}
		// MyRemocon 객체를 생성해서 Remocon 인터페이스 type 으로 받기
		Remocon r1=new MyRemocon();
		useRemocon(r1);
	}
	
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
