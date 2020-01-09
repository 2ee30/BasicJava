package test.main4;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.Socket;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

import org.json.JSONArray;
import org.json.JSONObject;

public class ClientMain extends JFrame 
				implements ActionListener, KeyListener{
	//필드
	private Socket socket; //서버와 연결된 Socket 객체
	private BufferedWriter bw; //서버에 문자열을 출력할수 있는 객체 
	private BufferedReader br; //서버가 출력하는 문자열을 읽어들일수 있는 객체 
	private JTextField inputText;
	private JTextArea ta;
	private String chatName;//대화명
	private JList<String> jList;//참여자 목록 
	//생성자
	public ClientMain(String title) {
		super(title); //부모 생성자에 프레임의 제목 전달하기
		initUI(); //UI 준비하기 
		connect(); //Socket 서버에 접속하기 
	}
	//UI 를 준비하는 메소드
	public void initUI() {
		setLayout(new BorderLayout());
		setBounds(100, 100, 500, 500);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		//페널
		JPanel panelNorth=new JPanel();
		inputText=new JTextField(30);
		JButton sendBtn=new JButton("전송");
		//페널에 텍스트필드와 버튼을 추가하고 
		panelNorth.add(inputText);
		panelNorth.add(sendBtn);
		//페널을 프레임의 북쪽에 배치하기 
		add(panelNorth, BorderLayout.NORTH);
		//버튼 동작
		sendBtn.setActionCommand("send");
		sendBtn.addActionListener(this);
		//JTextArea
		ta=new JTextArea();
		
		//스크롤계층 (JScrollPane)
		JScrollPane scPane=new JScrollPane(ta,
				JScrollPane.VERTICAL_SCROLLBAR_ALWAYS,
				JScrollPane.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		//스크롤계층을 프레임에 추가 
		add(scPane, BorderLayout.CENTER);
		//키리스너 
		inputText.addKeyListener(this);
		
		//접속자 명단에 관련된 처리
		String[] names={"참여자 목록"};
		jList=new JList<>(names);
		jList.setBackground(Color.YELLOW);
		add(jList, BorderLayout.EAST);
		
		setVisible(true);
		
		//대화명을 입력받기(프롬프트 창 이용)
		String chatName=
				JOptionPane.showInputDialog(this, "대화명을 입력하셈");
		if(chatName == null || chatName.equals("")) {
			chatName="바보";
		}
		//지역변수에 있는 대화명을 필드에 저장하기 
		this.chatName=chatName;
		//JTextField 한글 깨지지 않게 폰트 설정 
		Font f=Font.decode("utf-8");
		//굵은 글씨 18 px
		ta.setFont(f.deriveFont(Font.BOLD, 18));
	}
	//Socket 서버에 접속하는 메소드
	public void connect() {
		try {
			//Socket 객체의 참조값을 필드에 저장하기 
			this.socket=new Socket("192.168.0.2", 5000);
			System.out.println("Socket 연결 성공");
			//서버에 출력할수 있는 객체의 참조값 얻어오기 
			OutputStream os=socket.getOutputStream();
			OutputStreamWriter osw=new OutputStreamWriter(os);
			this.bw=new BufferedWriter(osw);
			//쳇팅방에 입장했다는 의미에서 대화명을 서버에 보내기 
			//{"type":"enter", "chatName": chatName}
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("type", "enter");
			jsonObj.put("chatName", this.chatName);
			String json=jsonObj.toString();
			send(json);
			
			//서버로 부터 입력받을 객체
			InputStream is=socket.getInputStream();
			InputStreamReader isr=new InputStreamReader(is);
			this.br=new BufferedReader(isr);
			// BufferedReader 객체를 이용해서 서버에서 문자열이 
			// 도착하는지 지속적으로 대기하는 스레드 객체를 생성해서
			// 시작 시켜야 된다.
			ClientThread t=new ClientThread();
			t.start();
		}catch(Exception e) {
			e.printStackTrace();
		}
	}//connect()
	
	//메세지를 전송하는 메소드
	public void send(String json) {
		//인자로 전달되는 json 문자열을 서버에 출력하기 
		try {
			bw.write(json);
			bw.newLine();
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	//메인 메소드
	public static void main(String[] args) {
		new ClientMain("Socket Client");
	}
	//버튼을 누르면 호출되는 메소드 
	@Override
	public void actionPerformed(ActionEvent e) {
		String command=e.getActionCommand();
		if(command.equals("send")) {//만일 전송 버튼을 눌렀다면...
			String msg=inputText.getText();
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("type", "message");
			jsonObj.put("msg", msg);
			jsonObj.put("chatName", this.chatName);
			String json=jsonObj.toString();
			this.send(json);//메세지 전송하는 메소드 호출 
			inputText.setText("");
			inputText.requestFocus();
		}
	}
	//서버에서 문자열이 전송되는지 지속적으로 감시할 스레드 객체를 생성할 클래스 
	class ClientThread extends Thread{
		@Override
		public void run() {
			while(true) {
				try {
					//서버로 부터 문자열이 도착하면 readLine() 메소드가 호출된다.
					String json=br.readLine();
					//도착한 json 문자열을 이용해서 JSONObject 를 만든다.
					JSONObject jsonObj=new JSONObject(json);
					//어떤 type 의 문자열인지 얻어낸다.
					String type=jsonObj.getString("type");
					if(type.equals("enter")) {//누군가 입장했을때 
						String chatName=jsonObj.getString("chatName");
						String msg=chatName+" 님이 입장했습니다.";
						ta.append(msg);
						ta.append("\r\n");
					}else if(type.equals("message")) {//대화 메세지
						String chatName=jsonObj.getString("chatName");
						String message=jsonObj.getString("msg");
						String msg=chatName+":"+message;
						ta.append(msg);
						ta.append("\r\n");
					}else if(type.equals("update")) {
						
						JSONArray arr=jsonObj.getJSONArray("names");
						//String[] names=new String[arr.length()];
						Vector<String> names=new Vector<>();
						names.add("참여자 목록");
						for(int i=0; i<arr.length(); i++) {
							String name=arr.getString(i);
							//names[i]=name;
							names.add(name);
						}
						jList.setListData(names);
					}else if(type.equals("leave")) {
						String chatName=jsonObj.getString("chatName");
						String msg=chatName+" 님이 나갔습니다.";
						ta.append(msg);
						ta.append("\r\n");
					}
					
					//가장 아래쪽으로 스크롤 시키기
					int height=ta.getDocument().getLength();
					ta.setCaretPosition(height);
				} catch (IOException e) {
					e.printStackTrace();
				}catch(Exception e) {
					e.printStackTrace();
				}
			}//while()
		}//run()
	}//class ClientThread
	@Override
	public void keyPressed(KeyEvent e) {
		//키를 눌렀을때 호출되는 메소드 
		int code=e.getKeyCode(); //눌러진 키의 코드값 읽어오기
		if(code == KeyEvent.VK_ENTER) {
			String msg=inputText.getText();
			JSONObject jsonObj=new JSONObject();
			jsonObj.put("type", "message");
			jsonObj.put("msg", msg);
			jsonObj.put("chatName", this.chatName);
			String json=jsonObj.toString();
			this.send(json);//메세지 전송하는 메소드 호출 
			inputText.setText("");
			inputText.requestFocus();
		}
	}
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}//class








