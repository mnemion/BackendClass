package io;

import java.io.*;

// Stream으로 파일로드 하는 방식 + 쓰기
public class file11 {

	public static void main(String[] args) {
		try {
			data8 d = new data8();
			d.abc();
		}
		catch(Exception e) {
			System.out.println("소스 코드 및 경로 실패!!");
		}
	}
}

class data8{
	public void abc() throws Exception {
		InputStream is = new FileInputStream("E:\\project\\web\\src\\main\\webapp\\datalist.txt");
		//System.out.println(is.available()); //available() : 파일 전체 크기 확인 방식
		//byte temp[] = new byte[is.available()]; //파일 전체를 모두 byte 배열로 적용 = 용량 제한 없음
		byte temp[] = new byte[1024*10]; // 10KB 1MB = 1024*1024*1 = 용량 제한
		//int ea = is.read(temp); //다른 방식이며 파일 용량 체크하는 것 = 파일 전체 크기 확인 방식
		//System.out.println(ea);
		
		is.read(temp); //read가 필요한 이유는 해당 파일 바이너리 형태로 읽기 때문에 read 메소드로 파일 전체를 읽어들인다.
		String data = new String(temp, "UTF-8");
		System.out.println(data);
		is.close();
		try {
			data9 z = new data9();
			z.zzz();
		}
		catch(Exception e) {
			System.out.println("데이터 쓰기 오류 발생!!");
		}
	}
}

class data9{
	public void zzz() throws Exception {
		String test = "\n연습입니다.";
		OutputStream os = new FileOutputStream("E:\\project\\web\\src\\main\\webapp\\datalist.txt", true);
		byte[] data = test.getBytes();	//문자열을 byte 단위로 변환(바이너리)
		os.write(data);
		os.flush();
		os.close();
	}
}