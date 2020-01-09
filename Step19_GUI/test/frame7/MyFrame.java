package test.frame7;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Container;
import java.awt.Frame;
import java.awt.Window;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class MyFrame extends JFrame implements ActionListener{
	//메소드에서 사용할 필드 선언
	JTextField inputNum1, inputNum2;
	JLabel label_result;
	
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
		// 메소드에서 참조값을 사용할수 있도록 참조값을 필드에 저장한다.
		this.inputNum1=new JTextField(10);
		inputNum2=new JTextField(10);
		
		JButton plusBtn=new JButton("+");
		JButton minusBtn=new JButton("-");
		JLabel label_equal=new JLabel("=");
		// 메소드에서 참조값을 사용할수 있도록 참조값을 필드에 저장한다.
		label_result=new JLabel("0");
		p1.add(inputNum1);
		p1.add(plusBtn);
		p1.add(minusBtn);
		p1.add(inputNum2);
		p1.add(label_equal);
		p1.add(label_result);
		add(p1, BorderLayout.NORTH);
		
		//1. 버튼이 동작하게 한다.
		plusBtn.addActionListener(this);
		minusBtn.addActionListener(this);
		//두버튼을 눌렀을때 각각 다른 동작을 해야하기 때문에 액션command 를 설정한다.
		plusBtn.setActionCommand("plus");
		minusBtn.setActionCommand("minus");
	}
	//버튼을 누르면 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 액션command  읽어오기
		String command=e.getActionCommand();
		if(command.equals("plus")) {
			try {
				//2. 입력한 숫자를 읽어와서
				String strNum1=inputNum1.getText();
				String strNum2=inputNum2.getText();
				//3. 숫자를 연산(더하기)해서 결과값을 얻어낸다.
				double result=Double.parseDouble(strNum1) + 
						         Double.parseDouble(strNum2);
				//4. label_result 에 출력하기
				label_result.setText(Double.toString(result));
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(this, "숫자 형태로 입력해라!");
			}
		}else if(command.equals("minus")) {
			try {
				//2. 입력한 숫자를 읽어와서
				String strNum1=inputNum1.getText();
				String strNum2=inputNum2.getText();
				//3. 숫자를 연산(더하기)해서 결과값을 얻어낸다.
				double result=Double.parseDouble(strNum1) + 
						         Double.parseDouble(strNum2);
				//4. label_result 에 출력하기
				label_result.setText(Double.toString(result));
			}catch(NumberFormatException nfe) {
				JOptionPane.showMessageDialog(this, "숫자 형태로 입력해라!");
			}
		}
	}
	
	public static void main(String[] args) {
		new MyFrame("나의 프레임");
	}
}











