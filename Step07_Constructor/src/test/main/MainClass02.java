package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.Memory;
import test.mypac.NoteBook;

public class MainClass02 {
	public static void main(String[] args) {
		// Computer 객체를 생성해서 참조값을 c1 이라는 이름의 지역변수에 담아보세요.
		Computer c1=new Computer(new Cpu());
		Computer c2=new Computer(null);
		// 지역 변수에 있는 값을 생성자의 인자로 전달해서 객체 생성하기
		Cpu a=new Cpu();
		Computer c3=new Computer(a);
		
		// NoteBook 객체를 생성해서 참조값 n1 이라는 이름의 지역변수에 담아보세요
		NoteBook n1=new NoteBook(new Cpu(), new Memory(), new HardDisk());
	}
}
