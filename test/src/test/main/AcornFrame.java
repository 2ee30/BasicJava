package test.main;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class AcornFrame extends JFrame implements ActionListener{
	public AcornFrame(String title) {
		super(title);
		
		setBounds(100, 100, 500, 500);
		setLayout(new BorderLayout());
		
		JButton sendBtn=new JButton("전송");
		add(sendBtn, BorderLayout.NORTH);
		sendBtn.addActionListener(this);
		sendBtn.setActionCommand("send");
		
		setVisible(true);
	}
	public static void main(String[] args) {
		new AcornFrame("acorn");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.equals("send"));
		JOptionPane.showMessageDialog(this, "전송합니다.");
	}
}
