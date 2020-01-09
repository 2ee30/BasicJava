package test.frame4;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	JTextField inputText;
	//생성자
	public MyFrame(String title) {//생성자의 인자로 프레임의 제목을 전달받아서
		super(title);//부모 생성자에 전달한다.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// x, y, width, height 를 한번에 지정하기 
		setBounds(200, 200, 300, 300);
		//기본 레이아웃으로 동작하게 하기 
		setLayout(null);
		//화면에 보이게 하기
		setVisible(true);
		
		//JTextField 객체의 참조값을 필드에 저장 
		inputText=new JTextField(10);
		inputText.setBounds(10, 10, 200, 20);
		add(inputText);
		
		JButton sendBtn=new JButton("Send");
		sendBtn.setBounds(210, 10, 80, 20);
		add(sendBtn);
		//버튼에 ActionListener 등록하기 
		sendBtn.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//입력한 문자열 읽어오기
		String msg=inputText.getText();
		//알림에 띄우기
		JOptionPane.showMessageDialog(this, msg);
		//입력한 문자열 삭제하기 
		inputText.setText("");
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}











