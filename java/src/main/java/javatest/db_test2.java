package javatest;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

/*
 Java + Database 응용편1
 게시판을 작성하는 프로세서를 제작합니다.
 문의제목, 고객명, 패스워드는 6자리 이상, 문의내용
 단, 패스워드는 암호화하지 않고 제작합니다.
 패스워드 6자리 이하 입력 시 DB에 저장 안 됩니다.
 
*/
public class db_test2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Connection ct = null;
		try {
			formconfig db = new formconfig();
			ct = db.info();
			
			System.out.println("문의 제목을 입력하세요:");
			String subject = sc.nextLine();
			
			System.out.println("고객명을 입력하세요:");
			String name = sc.nextLine();
			
			String password;
            do {
            	System.out.println("패스워드를 입력하세요 (6자리 이상):");
                password = sc.nextLine();
                if (password.length() < 6) {
                    System.out.println("패스워드가 너무 짧습니다. 다시 입력하세요.");
                }
            } while (password.length() < 6);
			
			System.out.println("문의 내용을 입력하세요:");
			String centent_data = sc.nextLine();
			
			String insert = "INSERT INTO form (mtitle, mname, mpass, mcontent, mdate) VALUES (?, ?, PASSWORD(?), ?, NOW())";
			PreparedStatement ps = ct.prepareStatement(insert);
			ps.setString(1, subject);
			ps.setString(2, name);
			ps.setString(3, password);
			ps.setString(4, centent_data);
			
            int oksign = ps.executeUpdate();
            if (oksign == 1) {
                System.out.println("저장이 잘 되었습니다.");
                ps.close();
                ct.close();
                sc.close();
            } else {
                System.out.println("SQL 문법 오류로 인하여 저장되지 않았습니다.");
            }
        } catch (Exception e) {
            System.out.println("DB 정보가 올바르지 않습니다.");
        }
	}
}

class formconfig{	//Database 접속 환경 설정 class
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