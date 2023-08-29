package io;

import java.io.*;

//이미지 파일 처리 (Stream) = 바이너리
public class file13 {

	public static void main(String[] args) {
		try {
			data11 dt = new data11();
			dt.abc();
		}
		catch(Exception e) {
			System.out.println();
		}
	}
}

class data11{
	public void abc() throws Exception {
		InputStream is = new FileInputStream("E:\\project\\web\\src\\main\\webapp\\dog.jpg");
		//System.out.println(is.available());
		/*
		byte[] file = new byte[is.available()];
		int b = is.read(file);
		*/
		//System.out.println(b);
		OutputStream os = new FileOutputStream("dog2.jpg");
		//os.write(file);
		
		//%로 확인
		byte[] file = new byte[is.available()/100];	//한번에 읽어들일 수 있는 크기
		int img = 0;	//읽어들이는 바이트 수
		int check = 0;	//읽는 횟수
		/* 복사율을 표시하면서 progress-bar를 이용하여 보여줄 때 */
		while(true) {
			img = is.read(file);	//읽어들일 수 있는 용량 만큼 읽기
			if(img == -1) {	//더 이상 byte가 없을 경우 정지 조건
				break;
			}
			else {
				if(check <= 80) {	//80% 이하일 경우 지속적으로 복사
					os.write(file, 0, img);
				}
				else {	//80% 이상일 경우 정지
					break;
				}
			}
			check++;
			if(check % 2 == 0) {	//프로그래스 바 진행률을 표시
				System.out.println(check + "%");
			}
		}
		os.flush();
		os.close();
		is.close();
	}
}