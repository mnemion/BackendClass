package example;

import java.io.*;
import java.util.*;
import java.util.stream.Stream;

/*
 응용문제2
 해당 buffer.txt의 파일을 읽어들인 후 배열로 내용을 저장 후
 짝수 배열값만 출력시키는 프로세서를 제작하시오.
 
 결과)
 출력확인 하는 중입니다...
 JAVA BufferReader 힘듬..
 */
public class file2 {

	public static void main(String[] args) {
		try {
			buffers bf = new buffers();
			bf.abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 발생!!");
			e.printStackTrace();
		}
	}
}

class buffers{
	Scanner sc = null;
	FileReader fr = null;
	BufferedReader br = null;
	ArrayList<String> ar = null;
	
	public void abc() throws Exception {
		/*
		String url = "E:\\project\\example\\src\\main\\webapp\\buffer.txt";
		InputStream is = new FileInputStream(url);
		sc = new Scanner(System.in);
		ArrayList<String> al = new ArrayList<String>();
		BufferedReader br = new BufferedReader(new InputStreamReader(is));
		
		String list;
		while((list = br.readLine()) != null) {
			al.add(list);
		}
		
		for(int i=1; i<al.size(); i+=2) {
			System.out.println(al.get(i));
		}
		
		br.close();
		*/
		
		//다른 방식으로도 풀어보자
		String url = "E:\\project\\example\\src\\main\\webapp\\buffer.txt";
		this.fr = new FileReader(url);
		this.br = new BufferedReader(this.fr);
		this.ar = new ArrayList<String>();
		String data = null;
		
		int count = 1;
		while((data = this.br.readLine()) != null) {
			if(count % 2 == 0) {
				this.ar.add(data);
			}
			count++;
		}
		System.out.println(this.ar);
		this.br.close();
		this.fr.close();
	}
}