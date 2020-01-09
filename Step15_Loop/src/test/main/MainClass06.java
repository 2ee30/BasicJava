package test.main;

public class MainClass06 {
	public static void main(String[] args) {
		String[] names= {"김구라", "해골", "원숭이", "주뎅이", "덩어리"};
		/*
		 * 배열의 마지막 번쨰 방에서부터 역으로 참조해서 작업을 하고 싶다면?
		 */
		for(int i=names.length-1; i>=0; i--) {
			String tmp=names[i];
			System.out.println(tmp);
		}
	}
}
