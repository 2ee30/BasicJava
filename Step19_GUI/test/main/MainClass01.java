package test.main;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MainClass01 {
	public static void main(String[] args) {
		JFrame frame=new JFrame("MyFrame");
		//닫기 버튼을 눌렀을때 process  가 종료 되도록 설정
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		//크기 
		frame.setSize(300, 300);
		//위치
		frame.setLocation(200, 200);
		//화면에 보이게 하기
		frame.setVisible(true);
		//기본 레이아웃으로 동작하게 하기 
		frame.setLayout(null);
		
		//버튼 객체 만들어서 
		JButton btn=new JButton("눌러보셈");
		btn.setSize(100, 40);
		btn.setLocation(10, 10);
		//프레임에 추가하기 
		frame.add(btn);
		
		new YourFrame("YourFrame");
	}
	
	static class YourFrame extends JFrame{
		//생성자
		public YourFrame(String title) {
			super(title);
			
			this.setDefaultCloseOperation(EXIT_ON_CLOSE);
			setSize(300, 300);
			setLocation(500, 200);
			setVisible(true);
			setLayout(null);
			
			JButton btn=new JButton("눌러보셈");
			btn.setSize(100, 40);
			btn.setLocation(10, 10);
			add(btn);
		}
	}
}








