package test.main;

public class MoneyThread extends Thread{
	//필드
	private String name;
	//생성자
	public MoneyThread(String name) {
		this.name=name;
	}
	@Override
	public void run() {
		int total=0;
		while(true) {
			int money=MainClass07.getMoney();
			System.out.println(name+" 이"+money+" 원을 인출했습니다.");
			total += money;
			if(money==0) {
				break;
			}
		}
		System.out.println(name+" 이 총 인출한 돈:"+total+" 원");
	}

}
