package javatest;

import java.util.Scanner;

public class testdb {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("문의 제목을 입력하세요:");
		String suject = sc.nextLine();
		System.out.println("고객명을 입력하세요:");
		String person = sc.nextLine();
		//재귀함수로 핸들링
		//String result = new testdb().passwordck();
		
		//무한 loop로 사용법
		for(;;) {
			System.out.println("패스워드를 입력하세요:");
			String pw = sc.nextLine();
			if(pw.length() < 6) {
				System.out.println("제발 좀 6자리 입력해주세요!!");
			}
			else {
				break;
			}
		}
		
		System.out.println("문의 내용을 입력하세요:");
		String texts = sc.nextLine();
		sc.close();

	}
	public String passwordck() {
		Scanner sc = new Scanner(System.in);
		System.out.println("패스워드를 입력하세요:");
		String pw = sc.nextLine();
		
		if(pw.length() < 6) {
			System.out.println("제발 좀 6자리 입력해주세요!!");
			new testdb().passwordck();
		}
		return pw;
	}
}
