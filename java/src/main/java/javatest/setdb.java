package javatest;

import java.sql.Connection;
import java.sql.DriverManager;

//java17에 활용

//DB활용 인터페이스 및 각종 문법
public interface setdb {
	//해당 필드에 사용되는 변수는 final형태로 상수화 되어버리는 상황입니다.
	
	public void dbconnect(String user, String passwd, String db) throws Exception;
	public void select(String table, String dataid);
	
	/*
	public void delete(int idx);
	public void update(String dataid, int idx);
	public void insert(String[] a);
	*/
	
	public static Connection info(String user, String passwd, String db) throws Exception {
		String db_driver = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3306/"+db;
		String db_user = user;
		String db_pass = passwd;
		Class.forName(db_driver);
		Connection con = DriverManager.getConnection(db_url, db_user, db_pass);
		
		return con;
	};
}

//다른 방식
//DB활용 인터페이스 및 각종 문법
/*
public interface setdb {
	public String user = "";	//db접속 아이디
	public String pass = "";	//db접속 패스워드
	public String db = "";		//database명
	public void dbconnect(String user, String passwd, String db) throws Exception;
	
	public static Connection info(String user, String pass, String db) throws Exception {
		String db_driver = "com.mysql.jdbc.Driver";
		String db_url = "jdbc:mysql://localhost:3306/"+db;
		
		Class.forName(db_driver);
		Connection con = DriverManager.getConnection(db_url, user, pass);
		
		return con;
	};
}
*/
