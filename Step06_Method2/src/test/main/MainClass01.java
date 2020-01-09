package test.main;

import test.mypac.MyUtil;
import test.mypac.Pen;

public class MainClass01 {
	public static void main(String[] args) {
		MyUtil.showWeather();
		
		new MyUtil().printWeather();
		
		String result=new MyUtil().getWeather();
		
	
	Pen p=new MyUtil().getPen();
	p.write();
	
	new MyUtil().getPen().write();
	}
}
