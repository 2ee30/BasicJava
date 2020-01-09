package test.main;

//다른 package 에 있는 클래스를 사용하려면 import 를 해야한다.
import test.mypac.YourUtil;

public class MainClass06 {
	// run 했을 때 실행순서가 시작되는 특별한 main() 메소드
	public static void main(String[] args) {
		/*
		 *  프로그래밍의 목적
		 *  1. 파일을 업로드
		 *  2. 파일을 다운로드
		 */
		YourUtil.fileUP();
		YourUtil.fileDown();
	}
}
