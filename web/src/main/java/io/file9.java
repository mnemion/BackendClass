package io;

import java.io.*;
import java.util.*;

//FileReader, FileWriter, CharArrayReader  : 파일 읽기, 쓰기(문서용) - 아스키 -> 문자
//Buffered, LineNumberReader : 메모리 영억

//Stream이란 : 문서용, 이미지, 동영상, 오디오(바이너리) -> 숫자
//FileinputStream, AudioInputStream, ObjectInputStream
//BufferedStrem

//InputStream, OutputStream : 대분류 파트
//FileinputStream, AudioInputStream, ObjectInputStream : 소분류 파트

public class file9 {

	public static void main(String[] args) {
		try {
			//InputStream is = System.in; //키보드에 대한 정보 받음
			//int code = is.read();	//해당 키를 입력 시 ASCII코드로 인식하여 int로 변환
			//System.out.println(code);
			String a = "123456789";
			//String a = "ABCDE";
			//String a = "홍길동";
			byte[] b = a.getBytes();	//getBytes("인어패킷") - 문자를 byte 단위로 변환
			System.out.println(Arrays.toString(b));
			OutputStream os = System.out;
			
			os.write(b, 0, b.length); //(객체, 배열시작번호 0, 배열 종료번호);
			//os.write(b);
			os.flush(); //휴지통
			//os.write(b, 0, 2);
			os.close();
		}
		catch(Exception e) {
			System.out.println("코드 오류 발생!!");
		}
	}
}
