package test.main;

import java.util.ArrayList;
import test.mypac.Pen;

public class MainClass03 {
	public static void main(String[] args) {
		// 1.Pen type 을 담을 수 있는 가변배열 객체를 생성해서 참조값을 
		//   pens 라는 지역 변수에 담기
		ArrayList<Pen> pens=new ArrayList<>();

		// 2.pens 배열에 Pen 객체를 각각 3개 생성해서 담아보세요.
		Pen p1=new Pen("Red");
		Pen p2=new Pen("Blue");
		Pen p3=new Pen("green");
		pens.add(p1);
		pens.add(p2);
		pens.add(p3);
		
//		pens.add(new Pen("Red"));
//		pens.add(new Pen("Blue"));
//		pens.add(new Pen("Green"));
		
		// 3.반복문을 이용해서 pens 배열에 저장된 Pen 객체의 참조값을 순서대로 이용해
		//   .write() 메소드를 호출해보세요.
		for(int i=0; i<pens.size(); i++) { 
			Pen tmp=pens.get(i); 
			tmp.write();
		}
}
}
