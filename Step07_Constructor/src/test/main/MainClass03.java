package test.main;

import test.mypac.Computer;
import test.mypac.Cpu;
import test.mypac.HardDisk;
import test.mypac.Memory;
import test.mypac.NoteBook;

public class MainClass03 {
	public static void main(String[] args) {
		// 1. useComputer() 메소드를 호출해보세요.
		useComputer(new Computer(new Cpu()));
		// 2. useNoteBook() 메소드를 호출해보세요.
		useNoteBook(new NoteBook(new Cpu(), new Memory(), new HardDisk()));
		
	}
	
	public static void useComputer(Computer c) {
		System.out.println("useCoumputer() 호출됨");
	}
	public static void useNoteBook(NoteBook n) {
		System.out.println("useNoteBook() 호출됨");
	}
}
