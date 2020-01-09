package test.mypac;
/*
 * 생성자(Constructor)
 * 
 * 1. 정의 하지 않아도 default 생성자는 있다고 간주된다.
 * 2. 생성자는 return type이 없고 이름은 클래스명과 동일하다.
 * 3. 객체를 생성(new)하는 시점에 호출된다.
 * 4. 초기화 작업을 할 게 있을 때 생성자 안에서 하면된다.
 * 5. 생성자는 다중정의(OverLoading) 할 수도 있다.
 * 6. 생성자를 하나라도 정의하면 default 생성자는 없어진다.
 * 7. 생성자도 메소드와 마찬가지로 인자를 전달 받을 수 있다.
 */
public class Student {
	// 필드
	private String name;
	// default 생성자
	public Student() {	
		System.out.println("Student() 생성자가 호출되었습니다.");
	}
	// String type을 인자로 전달받는 생성자
	public Student(String name) {
		// 생성자의 인자로 전달 받은 data 를 필드에 저장하기
		this.name=name;
		
	}
	// 메소드
	public void showInfo() {
		System.out.println("내이름은: "+this.name+" 입니다.");
	}
	
}
