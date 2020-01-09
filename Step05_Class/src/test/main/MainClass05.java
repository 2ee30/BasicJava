package test.main;

import test.mypac.MacBook;

public class MainClass05 {
	public static void main(String[] args) {
		/*
		 * - 코딩을 1번하고 디자인을 2번하고 유투브를 1번 시청해 보세요
		 */
		
		// 객체를 생성해서 단 한번씩 이용한다.(일회용)
//		new MacBook().coding();
//		new MacBook().design();
//		new MacBook().design();
//		new MacBook().watchYoutube();
		
		// 객체를 생성해서 여러번 이용한다. (효율적) | 동작>효율성
		MacBook m=new MacBook();
		m.coding();
		m.design();
		m.design();
		m.watchYoutube();
	}
}
