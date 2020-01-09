package test.main;

import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass06 {
	public static void main(String[] args) {
		OutputStream os=System.out;
		OutputStreamWriter osw=new OutputStreamWriter(os);
		BufferedWriter bw=new BufferedWriter(osw);
		
		try {
			bw.write("하나");
			bw.newLine();//개행기호 출력
			bw.write("두울");
			bw.newLine();
			bw.write("세엣");
			bw.write("\r\n"); //개행 기호를 수동으로 출력 
			bw.write("네엣");
			bw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}









