package test.main;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class MainClass10 {
	public static void main(String[] args) {
		//이미 만들어진 memo.txt 파일에 Access 할수 있는 객체 생성 
		File f1=new File("c:/myFolder/memo.txt");
		
		try {
			// new FileWriter(File 객체, append 여부 )
			FileWriter fw=new FileWriter(f1, true);
			
//			fw.write("하나");
//			fw.write("\r\n"); //개행 기호 
//			fw.write("두울");
//			fw.write("\r\n");
			
			fw.append("하나");
			fw.append("\r\n");
			fw.append("두울");
			fw.append("\r\n");
			fw.flush();
			fw.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("main 메소드가 리턴됩니다.");
	}
}












