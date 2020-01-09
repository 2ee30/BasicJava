package test.frame5;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
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
		
		JButton btn1=new JButton("NORTH");
		JButton btn2=new JButton("EAST");
		JButton btn3=new JButton("SOUTH");
		JButton btn4=new JButton("WEST");
		JButton btn5=new JButton("CENTER");
		add(btn1, BorderLayout.NORTH);
		add(btn2, BorderLayout.EAST);
		add(btn3, BorderLayout.SOUTH);
		add(btn4, BorderLayout.WEST);
		add(btn5, BorderLayout.CENTER);
		
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}











