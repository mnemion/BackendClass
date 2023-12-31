package javatest;

import java.sql.*;
import java.util.Scanner;

/*
 응용편 Java + Database
 Libery 추가 필요 : MysqlConnectJ (https://mvnrepository.com/) -> MYSQL 검색
*/
public class db_test1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		try {
			dbconfig2 db = new dbconfig2();
			ct = db.info();
			//System.out.println(ct.toString());// DB 접속 확인
			
			System.out.println("제목을 입력하세요:");
			String subject = sc.nextLine();		//Scanner에 입력된 내용값
			
			//DB문법
			String insert = "insert into mail values ('0', '이종혁', 'jh@nate.com', '"+subject+"', '에이핑크~~! 화이팅!!', now())";
			PreparedStatement ps = ct.prepareStatement(insert);	//SQL문법을 작업 준비과정
			// execute() : select 문법에만 사용
			// executeUpdate() : insert, date, delete, alter, create
			int oksign = ps.executeUpdate();	//SQL에 Query에 대한 값은 숫자로 처리
			
			if(oksign == 1) {	// 정상적으로 저장
				System.out.println("저장이 잘 되었습니다.");
				ps.close();
				ct.close();
				sc.close();
			}
			else {	// 저장오류, SQL문법 오류, DB접속 오류, 컬럼에 대한 범위 오류
				System.out.println("SQL 문법 오류로 인하여 저장되지 않았습니다.");
			}
		} catch(Exception e) {
			System.out.println("DB 정보가 올바르지 않습니다.");
		}
		/*
		String times = new timezone().new_time(3);
		System.out.println(times);
		*/
		
		/*
		Date today = new Date();	
		SimpleDateFormat data = new SimpleDateFormat("YYYY-MM-dd");
		SimpleDateFormat time = new SimpleDateFormat("HH:mm:ss");
		SimpleDateFormat datatime = new SimpleDateFormat("YYYY-MM-dd HH:mm:ss");
		System.out.println(datatime.format(today));
		*/
	}
}

class dbconfig2{	//Database 접속 환경 설정 class
	//Connection : Interface 사용
	public static Connection info() throws Exception {
		String db_drive = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3306/web";
		String db_user = "hong";
		String db_pass = "a123456";
		
		Class.forName(db_drive);
		Connection con = DriverManager.getConnection(db_url, db_user, db_pass);
		
		return con;
	}
}