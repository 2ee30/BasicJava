package test.main;

public class MainClass04 {
	public static void main(String[] args) {
		MainClass04.showSum(10, 20, 30);
		int a=1;
		int b=2;
		int c=3;
		MainClass04.showSum(a, b, c);
	}
	
	// 인자로 전달된 세개의 점수를 더해서 콘솔창에 입력
	public static void showSum(int num1, int num2, int num3) {
		int sum=num1+num2+num3;
		System.out.println("전달된 세수의 합:"+sum);
	}
}
