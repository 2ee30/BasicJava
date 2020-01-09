package test.main;
/*
 * [연산자]
 * 
 * 6. 3항 연산자
 * 
 */
public class MainClass06 {
	public static void main(String[] args) {
		int point=70;
		
//		String msg=null;
//		
//		if(point >=60 ) {
//			msg="합격입니다";
//		}else {
//			msg="불합격입니다";
//		}
		
		String msg=point>=60? "합격입니다":"불합격입니다";
		
		int a=point >= 60? 100:0;
		
		System.out.println(msg);
	}
}











