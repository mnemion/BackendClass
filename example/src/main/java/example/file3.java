package example;

import java.io.*;
import java.util.*;

/*
 숙제 : user_tel.txt 파일을 로드 후 해당 사용자에 맞게 전화번호가 등록되도록
 배열화하여 콘솔로 출력되도록 합니다.
 단, cms_db.txt로 해당 내용이 저장되어야 합니다.
 
 결과: 홍길동(01011245564)
 	  김유신(01020041004)
 */
public class file3 {

	public static void main(String[] args) {
		try {
			usetel serU = new usetel();
			serU.abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 발생!!");
			e.printStackTrace();
		}
	}
}

class usetel{
	Scanner sc = null;
	FileReader fr = null;
	BufferedReader br = null;
	ArrayList<String> ar = null;
	
	public void abc() throws Exception {
		String url = "E:\\project\\example\\src\\main\\webapp\\user_tel.txt";
		this.fr = new FileReader(url);
		this.br = new BufferedReader(this.fr);
		this.ar = new ArrayList<String>();
		
		String data = null;
		
		while((data = this.br.readLine()) != null) {
			String[] temp = data.split("\\|");
			String name = temp[0];
			String tel = temp[1].replace("-", "");
			this.ar.add(name + "(" + tel + ")");
		}
		
		for(String s : this.ar) {
			System.out.println(s);
		}
		
		String url2 = "E:\\project\\example\\src\\main\\webapp\\cms_db.txt";
		BufferedWriter bw = new BufferedWriter(new FileWriter(url2));
		for(String s : this.ar) {
			bw.write(s);
			bw.newLine();
			bw.flush();
		}
		bw.close();
		this.br.close();
        this.fr.close();
	}
}