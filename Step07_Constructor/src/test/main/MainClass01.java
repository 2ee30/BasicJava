package test.main;

import test.mypac.Student;

public class MainClass01 {
	public static void main(String[] args) {
		Student s1=new Student();
		Student s2=new Student("김구라");
		Student s3=new Student("해골");
		String yourName="원숭이";
		Student s4=new Student(yourName);
		
		s1.showInfo();
		s2.showInfo();
		s3.showInfo();
		s4.showInfo();
		
	}
}
