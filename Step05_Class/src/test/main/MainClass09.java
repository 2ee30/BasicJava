package test.main;

import test.mypac.GuraUtil;

public class MainClass09 {
	public static void main(String[] args) {
		for(int i=0; i<5; i++) {
			int tmp=GuraUtil.ran.nextInt(45)+1;
			GuraUtil.out.println(tmp);
		}
	}
}
