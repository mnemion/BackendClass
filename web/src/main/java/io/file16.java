package io;

import java.io.*;
/*
 InputStream > InputStreamReader > BufferedReader(o)
 InputStream > BufferedInputStream (o)
 FileinputStream > BufferReader (x)
 FileWriter > FileOutputStream (x)
 */


//InputStreamReader, OutputStreamWriter, BuffredReader, BufferedWriter
public class file16 {

	public static void main(String[] args) {
		try {
			data13 d = new data13();
			d.abc();
			
		}
		catch(Exception e) {
			System.out.println("파일 장애!!");
		}
	}
}

class data13{
	//InputStreamReader => Stream => Reader 변환
	public void abc() throws Exception {
		String file = "E:\\project\\web\\src\\main\\webapp\\number.txt";
		InputStream is = new FileInputStream(file);
		InputStreamReader ir = new InputStreamReader(is); //아스키로 변환시키는 과정!
		BufferedReader br = new BufferedReader(ir);
		
		String line;
		while((line = br.readLine()) != null) {
			System.out.println(line);
		}
		br.close();
		ir.close();
		is.close();
	}
}
