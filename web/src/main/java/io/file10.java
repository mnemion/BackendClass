package io;

import java.io.*;
import java.util.Arrays;

//inputStream + OutputStream + flush 사용법 (메모리)
//inputStream 2개를 활성화 시 메모리 구조상 신규 인스턴스를 생성하지 않을 경우
//연속으로 Stream을 사용하지 못한다.
public class file10 {

	public static void main(String[] args) throws Exception {
		/*
		InputStream in = System.in; //값을 적용
		OutputStream os = System.out; //출력
		
		int a = in.read();	//입력된 사항을 읽어들임
		os.write(a);	//쓰기
		os.flush();
		os.close();	//OutputStream 닫기
		in.close();	//inputStream 닫기
		*/
		
		/*
		InputStream in2 = System.in;
		OutputStream os2 = System.out;
		int a2 = in.read();
		os2.write(a2);
		os2.flush();
		os2.close();
		in2.close();
		*/
		
		data7 aa = new data7();
		aa.abc();
	}
}

class data7{
	public void abc() {
		String data = "abcd";
		byte[] b = data.getBytes();
		System.out.println(Arrays.toString(b));
		OutputStream os = System.out;
		try {
			os.write(b, 0, b.length);
			os.flush(); //OutputStream은 꼭 비우자.
			os.close();
		}
		catch(Exception e) {
			
		}
	}
}
