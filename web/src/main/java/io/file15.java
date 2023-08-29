package io;

import java.io.*;

//BufferedInputStream, BufferedOutputStream
public class file15 {

	public static void main(String[] args) {
		try {
			data12 d = new data12();
			d.abc();
		}
		catch(Exception e) {
			System.out.println("파일 저장 코드 오류!!");
		}
	}
}

class data12{
	public void abc() throws Exception {
		String file = "E:\\project\\web\\src\\main\\webapp\\dog.jpg";
		//InputStream is = new FileInputStream(file); // 둘 다 같은 코드
		//FileInputStream fs = new FileInputStream(file);
		BufferedInputStream bi = new BufferedInputStream(new FileInputStream(file));
		byte filesize[] = new byte[bi.available()];
		int total = bi.read(filesize);
		
		if(total > 50000) {
			System.out.println("이미지 제한 용량을 초과합니다.");
		}
		else {
			System.out.println("이미지 제한 용량 확인");
			OutputStream os = new FileOutputStream("dog2.jpg");
			os.write(filesize);
			os.flush();
			os.close();
			bi.close();
		}
		//System.out.println(Arrays.toString(filesize));
	}
}