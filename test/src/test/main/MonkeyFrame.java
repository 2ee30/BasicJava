package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class MonkeyFrame extends JFrame implements ActionListener{
	//생성자
	public MonkeyFrame(String title) {
		super(title);
		//프레임의 x, y, width, height 
		setBounds(200, 200, 300, 300);
		//프레임을 닫았을 때 프로세스 종료 되도록
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//레이아웃 법칙 지정하기
		setLayout(new BorderLayout());
		//버튼 생성
		JButton delbtn=new JButton("삭제");
		JButton upbtn=new JButton("수정");
		//버튼을 레이아웃에 추가하고 동쪽에 위치
		add(delbtn, BorderLayout.EAST);
		add(upbtn, BorderLayout.WEST);
		//버튼에 액션 리스너 등록하기
		delbtn.addActionListener(this);
		upbtn.addActionListener(this);
		//버튼에 ActionCommand 등록
		delbtn.setActionCommand("delete");
		upbtn.setActionCommand("update");
		//프레임이 화면에 보이도록 활성화
		setVisible(true);
	}
	public static void main(String[] args) {
		new MonkeyFrame("원숭이");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.equals("delete")) {
		}else if(command.equals("update")) {	
		}
	}
}