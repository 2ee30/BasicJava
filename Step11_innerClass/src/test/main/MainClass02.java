package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		Pen p=new Pen();
		p.write();
	}
	// 내부 클래스에 한해서 필요하다면 static 예약어를 붙일 수 있다.
	public static class Pen{
		public void write() {
			System.out.println("필기를 해요!");
		}
	}
}
