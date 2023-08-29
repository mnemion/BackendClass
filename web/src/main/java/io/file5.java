package io;

import java.io.*;
import java.util.*;
//Scanner를 이용한 파일쓰기 기능 활성화

public class file5 {
	
	//static main에는 this를 사용하지 못함
	/*
	  Static 사용 시 new 인스턴스를 호출 시 새롭게 읽어들이므로 기존에 있는 코드를
	  인식하지 못하는 상황이 발생함
	*/
	public static void main(String[] args) {
		try {
			/*
			 객체 생성
			 */
			FileWriter fw = null;
			Scanner sc = null;
			/*
			 인스턴스 생성
			 */
			//file5 f = new file5(); //혹은 아래와 같이 사용
			fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\user.txt", true);
			sc = new Scanner(System.in);
			int f;
			for(f = 0; f < 3; f++) {
				System.out.println("사용자 이름을 입력해주세요?");
				String name = sc.nextLine().intern();
				if(name == "exit") {
					break;
				}else {
					fw.write(name + "\n");
				}
			}
			System.out.println("모든 데이터 내용이 저장되었습니다.");
			sc.close();
			fw.close();
		}
		catch(Exception e) {
			System.out.println(e);
			System.out.println("파일 오류 발생!!");
		}
	}
}
