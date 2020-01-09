package test.frame6;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	
	//생성자
	public MyFrame(String title) {//생성자의 인자로 프레임의 제목을 전달받아서
		super(title);//부모 생성자에 전달한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// x, y, width, height 를 한번에 지정하기 
		setBounds(200, 200, 500, 500);
		//레이아웃 설정하기 
		setLayout(new BorderLayout());
		//화면에 보이게 하기
		setVisible(true);
		//페널 객체를 만들어서
		JPanel p1=new JPanel();
		//버튼을 만든 다음
		JButton btn1=new JButton("버튼1");
		JButton btn2=new JButton("버튼2");
		JButton btn3=new JButton("버튼3");
		//페널에 버튼을 추가 하고
		p1.add(btn1);
		p1.add(btn2);
		p1.add(btn3);
		//페널을 프레임의 남쪽에 배치하기
		add(p1, BorderLayout.SOUTH);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}