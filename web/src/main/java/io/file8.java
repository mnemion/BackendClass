package io;
//FileReader + Buffered 응용편 (datalist.txt)
/*
 응용문제2
 datalist.txt에 숫자가 있다.
 해당 파일을 읽어들여서 해당 숫자 중
 짝수값만 모두 출력되도록 하시오. 
*/
import java.io.*;
import java.util.*;

public class file8 {

	public static void main(String[] args) {
		try {
			data6 d = new data6();
			d.abc();
		}
		catch(Exception e) {
			System.out.println("파일 오류 발생!!");
		}
	}
}

class data6{
	FileReader fr = null;
	
	public void abc() throws Exception {
		this.fr = new FileReader("E:\\project\\web\\src\\main\\webapp\\datalist.txt");
		BufferedReader bf = new BufferedReader(this.fr); // 메모리에 해당 값을 모두 등록
		
		ArrayList<Integer> al = new ArrayList<Integer>();
		String line = "";
		while((line = bf.readLine())!=null) {
			int num = Integer.parseInt(line);
			if (num % 2 == 0) { // 짝수 조건일 경우
				al.add(num);
			}
		}
		
		System.out.println(al);
		
		bf.close();
		this.fr.close();
	}
}
