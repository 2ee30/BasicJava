package test.util;

public class GuraFrameWork {
	public static void main(String[] args) {
		System.out.println("started!");
		
		class MyMessenger implements Messenger{
			@Override
			public void send(Message m) {
				m.setTarget("oli999@naver.com");
				m.setTarget("살려주세요~");
				
			}
		}
		
		useMessenger(new MyMessenger());
		
	}
	public static void useMessenger(Messenger mess) {
		Message m=new Message();
		mess.send(m);
		String target=m.getTarget();
		String content=m.getContent();
		System.out.println(target +"에게"+ content + "를 전송했습니다.");
		
	}
}
