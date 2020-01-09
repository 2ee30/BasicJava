package test.main;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class MainClass08 {
	public static void main(String[] args) {
		/*
		 * HashMap 객체에 담고 싶은
		 */
		Map<Integer, String> songs=new HashMap<>();
		songs.put(10, "노래1");
		songs.put(20, "노래2");
		songs.put(30, "노래3");
		songs.put(40, "노래4");
		songs.put(50, "노래5");
		
		Scanner scan=new Scanner(System.in);
		System.out.print("재생할 노래의 번호를 입력:");
		int num=scan.nextInt();
		String song=songs.get(num);
		System.out.println(song+" 을 재생합니다~");
	}
}
