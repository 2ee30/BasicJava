package test.main;

import java.io.IOException;
import java.io.OutputStream;

public class MainClass04 {
	public static void main(String[] args) {
		/*
		 *  1byte 처리 스트림이다. 
		 *  
		 *  만일 문자 데이터를  OutputStream 객체로 출력한다면 
		 *  영문자, 대소문자, 숫자, 특수문자 까지만 처리할수 있다. (한글불가)
		 */
		OutputStream os=System.out;
		
		try {
			os.write(97);
			os.write(98);
			os.write(99);
			os.write(100);
			//os.write(44032); //한글 처리 불가 
			byte[] buffer= {65, 66, 67, 68};
			/*
			 *  byte[] buffer=new byte[4];
			 *  buffer[0]=65;
			 *  buffer[1]=66;
			 *  buffer[2]=67;
			 *  buffer[3]=68;
			 */
			os.write(buffer);
			os.flush(); //방출(밀어내기)
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}














