package test.main;

import java.util.InputMismatchException;
import java.util.Scanner;

import test.mypac.Heater;

public class MainClass06 {
	public static void main(String[] args) {
		/*
		 * 날씨가 춥다. 어떻게 해야할까?
		 * 난방을 해야지~~
		 */
		Heater heater=null;
		try {
			heater=new Heater();
			heater.heat(); // 난방을 따닷하게 하고 일을 시작해요
			
			Scanner scan=new Scanner(System.in);
			System.out.print("정수 입력:");
			int num=scan.nextInt();
			System.out.println("입력한 정수:"+num);
			
		} catch (InterruptedException e) {
			
			e.printStackTrace();
		}catch(InputMismatchException ime) {
			ime.printStackTrace();
			heater.off();
		}finally { // Exception 발생과 상관 없이 실행이 보장되는 블럭
			// 무언가 마무리 작업은 여기서 하면 된다.
			heater.off(); // 작업을 다했으면 haeter를 꺼요
		}
	}
}
