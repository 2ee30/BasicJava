package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		// 메소드를 호출하면서, 참조값을 바로 즉석에서 만들어 전달하기
		MainClass02.showMsg("안녕하세요");
		MainClass02.showMsg("제 이름은 이상명입니다");
		
		String str="참 재미 있어요^0^";
		// 메소드 호출하면서 변수 안에 있는 참조값을 전달하기
		MainClass02.showMsg(str);
	}
	// 메소드의 인자로 String type을 전달 받는 Static 메소드 정의하기
	public static void showMsg(String msg) {
		// 전달 받은 내용을 가공해서 출력하기
		String result="["+msg+"]";
		System.out.println(result);
	}
	public void test() {
		String str="참 재미 있어요~";
		String msg=str;
	}
}
