package test.main;

import test.mypac.Pen;

public class MainClass04 {
	public static void main(String[] args) {
		// 1. Pen 객체를 3개 생성해서 참조값을 pen1, pen2, pen3 라는 지역 변수에 담아보세요.
		Pen pen1=new Pen("Red");
		Pen pen2=new Pen("Blue");
		Pen pen3=new Pen("Green");
		// 2. Pen 3개 짜리 빈 배열 객체를 생성해서 참조값을 pens 라는 지역 변수에 담아보세요.
		Pen[] pens=new Pen[3];
		// 3. 생성한 배열에 pen1, pen2, pen3 에 저장된 참조값을 배열의 0,1,2 번방에 순서대로 담아보세요
		pens[0]=pen1;
		pens[1]=pen2;
		pens[2]=pen3;
		// 4. """"""배열""""""" 안에 들어있는 Pen 객체의 참조값을 이용해서 write() 메소드를 호출해보세요
		pens[0].write();
		pens[1].write();
		pens[2].write();
		// 5. 4번에서 했던 작업을 for문을 활용해서 해보세요.
		for(int i=0; i<pens.length; i++) {
			pens[i].write();
		}

	}
}
