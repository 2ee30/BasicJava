package test.frame;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.ListSelectionModel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;

import test.member.dao.MemberDao;
import test.member.dto.MemberDto;

public class MemberFrame2 extends JFrame 
				implements ActionListener, ListSelectionListener{
	//필드 
	JTextField inputNum, inputName, inputAddr;
	JTable table;
	DefaultTableModel model;
	boolean isEditing=false; //수정하고 있는 상태인지 여부 
	JButton saveBtn, updateBtn, deleteBtn, cancelBtn;
	
	//생성자 
	public MemberFrame2(String title) {
		super(title);
		initUI(); // UI 초기화 
		printMember(); //회원 정보 출력하기 
	}
	//UI 초기화 하는 메소드 
	public void initUI() {
		setBounds(100, 100, 800, 500);//위치와 크기 설정
		setLayout(new BorderLayout());//레이아웃 법칙 설정
		setDefaultCloseOperation(EXIT_ON_CLOSE); //닫았을때 process  종료
		
		//테이블
		table=new JTable();
		//칼럼명을 배열에 미리 준비하기
		String[] colNames= {"번호", "이름", "주소"};
		//모델
		model=new DefaultTableModel(colNames, 0) {
			@Override
			public boolean isCellEditable(int row, int column) {
				// TODO Auto-generated method stub
				return false;
			}
		};
		//모델을 테이블에 연결하기
		table.setModel(model);
		//테이블을 감싸는 스크롤 계층을 만들고 
		JScrollPane scPane=new JScrollPane(table);
		//스크롤 계층을 프레임의 가운데에 붙이기
		add(scPane, BorderLayout.CENTER);
	
		ListSelectionModel selectionModel=table.getSelectionModel();
		selectionModel.addListSelectionListener(this);
		
		//회원 정보 입력 UI 만들기
		JLabel label1=new JLabel("번호");
		JLabel label2=new JLabel("이름");
		JLabel label3=new JLabel("주소");
		
		inputNum=new JTextField(10);
		inputName=new JTextField(10);
		inputAddr=new JTextField(10);
		//버튼의 참조값도 필드에 저장하기 
		saveBtn=new JButton("저장");
		updateBtn=new JButton("수정");
		deleteBtn=new JButton("삭제");
		cancelBtn=new JButton("취소");
		
		//페널을 만들고
		JPanel panelTop=new JPanel();
		//페널에 UI 나열하고
		panelTop.add(label1);
		panelTop.add(inputNum);
		panelTop.add(label2);
		panelTop.add(inputName);
		panelTop.add(label3);
		panelTop.add(inputAddr);
		panelTop.add(saveBtn);
		panelTop.add(updateBtn);
		panelTop.add(deleteBtn);
		panelTop.add(cancelBtn);
		//페널을 프레임의 상단에 배치
		add(panelTop, BorderLayout.NORTH);
		
		//버튼에 액션 리스너 등록
		saveBtn.addActionListener(this);
		updateBtn.addActionListener(this);
		deleteBtn.addActionListener(this);
		cancelBtn.addActionListener(this);
		//버튼 액션 command 설정
		saveBtn.setActionCommand("save");
		updateBtn.setActionCommand("update");
		deleteBtn.setActionCommand("delete");
		cancelBtn.setActionCommand("cancel");
		setVisible(true);//프레임이 화면에 보이게 설정
		
		//번호는 입력이나 수정 불가 하도록 
		inputNum.setEditable(false);
		//처음 프레임을 시작했을때는 수정, 삭제 버튼은 비활성화 시키기
		updateBtn.setEnabled(false);
		deleteBtn.setEnabled(false);
	}
	//회원 정보를 출력하는 메소드
	public void printMember() {
		//DefaultTableModel 객체의 메소드를 이용해서 Table 에 출력된
		//데이터를 일단 모두 삭제한다.
		model.setRowCount(0);
		//회원 목록 출력하기
		MemberDao dao=new MemberDao();
		List<MemberDto> list=dao.getList();
		for(MemberDto tmp:list) {
			//MemberDto 에 들어있는 정보를 Vector<Object>  객체에 담는다.
			Vector<Object> v=new Vector<>();
			v.add(tmp.getNum());
			v.add(tmp.getName());
			v.add(tmp.getAddr());
			//Vector  객체를 DefaultTableModel 객체에 전달해서 row 를 추가
			model.addRow(v);
		}
	}
	
	//app 을 처음 launching(실행) 할때 호출되는 메소드 
	public static void main(String[] args) {
		new MemberFrame2("회원정보");
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		//눌러진 버튼의 command 문자열을 읽어와서 
		String command=e.getActionCommand();
		if(command.equals("save")) {//저장 버튼을 눌렀다면
			//입력한 이름 주소 읽어오기
			String name=inputName.getText();
			String addr=inputAddr.getText();
			//MemberDto 객체에 담고
			MemberDto dto=new MemberDto(0, name, addr);
			//MemberDao 객체를 이용해서 DB 에 저장하기
			MemberDao dao=new MemberDao();
			//작업 성공 여부가 리턴된다. 
			boolean isSuccess=dao.insert(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "저장했습니다.");
				printMember();//목록 다시 출력하기 
			}else {
				JOptionPane.showMessageDialog(this, "저장 실패!");
			}
		}else if(command.equals("update")) {
			//입력한 번호 이름 주소 읽어오기
			int num=Integer.parseInt(inputNum.getText());
			String name=inputName.getText();
			String addr=inputAddr.getText();
			//MemberDto 객체에 담고
			MemberDto dto=new MemberDto(num, name, addr);
			//DB 에 수정 반영하기
			boolean isSuccess=new MemberDao().update(dto);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "수정했습니다.");
				printMember();//목록 다시 출력하기 
			}else {
				JOptionPane.showMessageDialog(this, "수정 실패!");
			}
		}else if(command.equals("delete")) {
			//삭제할 번호를 읽어온다.
			int num=Integer.parseInt(inputNum.getText());
			//MemberDao 객체를 이용해서 삭제하기
			boolean isSuccess=new MemberDao().delete(num);
			if(isSuccess) {
				JOptionPane.showMessageDialog(this, "삭제했습니다.");
				//입력창 삭제 
				inputNum.setText("");
				inputName.setText("");
				inputAddr.setText("");
				//수정상태 취소 
				isEditing=false;
				//버튼은 저장 버튼만 동작 하도록 
				saveBtn.setEnabled(true);
				updateBtn.setEnabled(false);
				deleteBtn.setEnabled(false);
				printMember();//목록 다시 출력하기 
			}else {
				JOptionPane.showMessageDialog(this, "삭제 실패!");
			}
		}else if(command.equals("cancel")) {
			//입력창 삭제 
			inputNum.setText("");
			inputName.setText("");
			inputAddr.setText("");
			//수정상태 취소 
			isEditing=false;
			//버튼은 저장 버튼만 동작 하도록 
			saveBtn.setEnabled(true);
			updateBtn.setEnabled(false);
			deleteBtn.setEnabled(false);
			//선택 해제 
			table.clearSelection();
		}
	}
	//테이블 row 가 선택되면 호출되는 메소드 
	@Override
	public void valueChanged(ListSelectionEvent e) {
		
		//선택된 row 의 인덱스 값 읽어오기 
		int selectedRow=table.getSelectedRow();
		if(selectedRow == -1) {
			return;
		}
		//선택된 row 의 칼럼 데이터 읽어오기 
		int num=(int)table.getValueAt(selectedRow, 0);
		String name=(String)table.getValueAt(selectedRow, 1);
		String addr=(String)table.getValueAt(selectedRow, 2);
		//JTextField 에 출력하기 
		inputNum.setText(Integer.toString(num));
		inputName.setText(name);
		inputAddr.setText(addr);
		//수정하고 있는 상태로 바꾸기
		if(!isEditing) {
			isEditing=true;
			saveBtn.setEnabled(false);
			updateBtn.setEnabled(true);
			deleteBtn.setEnabled(true);
		}
	}
}