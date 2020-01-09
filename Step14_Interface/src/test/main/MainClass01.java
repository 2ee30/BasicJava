package test.main;

import test.mypac.HeaterRemocon;
import test.mypac.Remocon;
import test.mypac.TvRemocon;

public class MainClass01 {
	public static void main(String[] args) {
		// Remocon type 참조값이 필요하다면?
		Remocon r1=new TvRemocon();
		MainClass01.useRemocon(r1);
		System.out.println("-----");
		Remocon r2=new HeaterRemocon();
		MainClass01.useRemocon(r2);
	}
	public static void useRemocon(Remocon r) {
		r.up();
		r.down();
	}
}
