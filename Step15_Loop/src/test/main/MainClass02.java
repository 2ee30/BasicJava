package test.main;

public class MainClass02 {
	public static void main(String[] args) {
		String[] names= {"김구라", "해골", "원숭이", "주뎅이", "덩어리","추가","둘리"};
		for(int i=0; i<names.length; i++) {
			// i번째 String type 참조하기
			String tmp=names[i];
			System.out.println(tmp);
		}
		System.out.println("확장 for문을 활용하면 ....");
		for(String tmp:names) {
			System.out.println(tmp);
		}
	}
}
