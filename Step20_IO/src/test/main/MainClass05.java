package test.main;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

public class MainClass05 {
	public static void main(String[] args) {
		OutputStream os=System.out;
		//2 byte 처리 스트림 (한글 처리 가능)
		OutputStreamWriter osw=new OutputStreamWriter(os);
		
		try {
			osw.write(97);
			osw.write(98);
			osw.write(99);
			osw.write(44032);
			osw.write(44033);
			osw.write(44034);
			osw.write(44035);
			osw.write(44037);
			osw.write("안녕");
			osw.flush();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}










