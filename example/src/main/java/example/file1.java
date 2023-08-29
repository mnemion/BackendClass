package example;

import java.io.*;
import java.util.*;

public class file1 {

	public static void main(String[] args) {
		try {
			box_office bo = new box_office();
			bo.abc();
		}
		catch(Exception e) {
			System.out.println("해당 메소드 오류!!");
		}
	}
}

/*
Scanner를 이용하여 다음과 같이 실행되도록 한다.
1. 개봉작 리스트 출력, 2. 프로그램 종료 :

1번 입력 후 엔터 실행 시 영화 리스트가 출력되어야 하며,
2번 입력 시 프로그램을 강제 종료한다.
*/

class box_office{
	Scanner sc = null;
	public void abc() throws Exception {
		String url = "E:\\project\\example\\src\\main\\webapp\\movie_db.txt";
		InputStream is = new FileInputStream(url);
		this.sc = new Scanner(System.in);
		System.out.println("1. 개봉영화 리스트 출력 || 2. 종료 ?");
		int no = sc.nextInt();
		if(no == 1) {
			//System.out.println(is.available());
			//System.out.println(is);
			//해당 모든 파일의 용량을 byte 배열로 변환
			byte temp[] = new byte[is.available()];
			int ea = is.read(temp);
			//is.read(temp);
			is.read();	//변환된 배열값을 모두 읽어들임
			//System.out.println(ea);
			String data = new String(temp);	//해당 배열을 문자화 하여 적용
			System.out.println(data);
		}
		else if(no == 2){
			System.out.println("프로그램이 종료되었습니다.");
			System.exit(0);
		}
		else {
			System.out.println("잘못된 값을 입력하셨습니다.");
		}
		is.close();
		this.sc.close();
	}
}
