package javatest;

import java.util.Scanner;

public interface inter1 {
	String name = "홍길동";	//필드에 적용된 전역 변수
	String userid = "hong";
	Scanner sc = new Scanner(System.in);	//처음부터 객체와 인스턴스를 활용하여 API Class를 생성시킴
	
	public void a1();	//일반 메소드
	
	default void aa1() {	//Override 필수로 하지 않고 필요할 때만 로드하여 사용할 때 default를 이용함
		System.out.println(this.userid);
	}
	
	class zzz {	// Interface 안에 자식 클래스를 사용
		public void zzjj() {	//자식 클래스 메소드
			System.out.println("Interface 안에 외부 클래스 활용");
		}
	}
}
