package test.main;

import test.mypac.MyPhone;
import test.mypac.SmartPhone;

public class MainClass06 {
	public static void main(String[] args) {
		MyPhone p1=new MyPhone();
		MainClass06.usePhone(p1);
	}
	
	public static void usePhone(SmartPhone p) {
		System.out.print("유석이에게");
		p.call();
		System.out.print("도원이의");
		p.takePicture();
		System.out.print("하루종일");
		p.doInternet();
	}
}
