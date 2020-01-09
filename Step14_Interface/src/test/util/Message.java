package test.util;

public class Message {
	private String target; // 누가 받을 것인지
	private String content; // 어떤 내용인지
	
	// setter 메소드  
	public void setContent(String content) {
		this.content = content;
	}
	public void setTarget(String target) {
		this.target = target;
	}
	public String getContent() {
		return content;
	}
	public String getTarget() {
		return target;
	}
	
}
