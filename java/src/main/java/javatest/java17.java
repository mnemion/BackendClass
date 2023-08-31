package javatest;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

//Interface 활용
public class java17 {
	public static void main(String[] args) {
		try {
			//각각의 별도로 적용되는 인스턴스
			/*
			 new box7().dbconnect("hong", "a123456", "web");
		     new box7().select("shop", "caffrey");
			*/
			
			//하나의 객체를 이용하여 new 인스턴스 활용이 필요함
		    box7 bx = new box7();
		    bx.dbconnect("hong", "a123456", "web");
		    bx.select("shop", "caffrey");
		}
		catch(Exception e) {
		    System.out.println("DB 정보가 올바르지 않습니다.");
		}
	}
}

//Class일 때 new 인스턴스 활용, 단, interface일 때는 interface명으로 활용
class box7 implements setdb {
	Connection con = null;
	PreparedStatement ps = null;
	@Override
	public void select(String table, String dataid) {
		try {
			String sql = "select * from " + table + " where mid=?";
			this.ps = this.con.prepareStatement(sql);
			this.ps.setString(1, dataid);
			System.out.println(this.ps);
			
			ResultSet rs = this.ps.executeQuery();
			while(rs.next()) {
				System.out.println(rs.getString("mname"));
				System.out.println(rs.getString("mmobile"));
				System.out.println(rs.getString("mtel"));
				System.out.println(rs.getString("memail"));
			}
			this.ps.close();
			this.con.close();
		}
		catch(Exception e) {
			System.out.println("SQL 문법 및 컬럼 확인");
		}
	}
	@Override
	public void dbconnect(String user, String passwd, String db) throws Exception {
		this.con = setdb.info(user, passwd, db);
	}
}
