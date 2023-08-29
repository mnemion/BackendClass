package javatest;

import java.sql.*;
import java.util.*;

//외부 db 정보 클래스를 로드하여 연결하기
public class db_test4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			dbconfig db = new dbconfig();
			Connection con = db.info();
			
			String customer_type;
            do {
                System.out.println("회원 유형을 입력하세요 (일반고객, 사업자 고객 중 하나):");
                customer_type = sc.nextLine();
                if (!customer_type.equals("일반고객") && !customer_type.equals("사업자 고객")) {
                    System.out.println("잘못된 회원 유형입니다. 다시 입력하세요.");
                }
            } while (!customer_type.equals("일반고객") && !customer_type.equals("사업자 고객"));

            System.out.println("회원 아이디를 입력하세요:");
            String user_id = sc.nextLine();

            String password;
            do {
                System.out.println("패스워드를 입력하세요 (6자리 이상):");
                password = sc.nextLine();
                if (password.length() < 6) {
                    System.out.println("패스워드가 너무 짧습니다. 다시 입력하세요.");
                }
            } while (password.length() < 6);

            if (customer_type.equals("일반고객")) {
                System.out.println("회원 이름을 입력하세요:");
                String name = sc.nextLine();

                String phone_number;
                do {
                    System.out.println("전화번호 또는 휴대전화번호를 입력하세요 (11자리 숫자만 입력):");
                    phone_number = sc.nextLine();
                    if (phone_number.length() != 11) {
                        System.out.println("전화번호 또는 휴대전화번호가 올바르지 않습니다. 다시 입력하세요.");
                    }
                } while (phone_number.length() != 11);

                String email;
                do {
                    System.out.println("이메일 주소를 입력하세요:");
                    email = sc.nextLine();
                    if (!email.contains("@") || !(email.endsWith("@naver.com") || email.endsWith("@gmail.com") || email.endsWith("@daum.net") || email.endsWith("@kakao.com") || email.endsWith("@nate.com"))) {
                        System.out.println("이메일 주소가 올바르지 않습니다. 대표적인 메일만 입력하세요. 다시 입력하세요.");
                    }
                } while (!email.contains("@") || !(email.endsWith("@naver.com") || email.endsWith("@gmail.com") || email.endsWith("@daum.net") || email.endsWith("@kakao.com") || email.endsWith("@nate.com")));

                String insert = "INSERT INTO general_customers (user_id, password, name, phone_number, email, created_at) VALUES (?, PASSWORD(?), ?, ?, ?, NOW())";
                PreparedStatement ps = con.prepareStatement(insert);
                ps.setString(1, user_id);
                ps.setString(2, password);
                ps.setString(3, name);
                ps.setString(4, phone_number);
                ps.setString(5, email);

                int oksign = ps.executeUpdate();
                if (oksign == 1) {
                    System.out.println("저장이 잘 되었습니다.");
                    ps.close();
                    con.close();
                    sc.close();
                } else {
                    System.out.println("SQL 문법 오류로 인하여 저장되지 않았습니다.");
                }
            } else if (customer_type.equals("사업자 고객")) {
                System.out.println("회사명을 입력하세요:");
                String company_name = sc.nextLine();

                String phone_number;
                do {
                    System.out.println("전화번호 또는 휴대전화번호를 입력하세요 (11자리 숫자만 입력):");
                    phone_number = sc.nextLine();
                    if (phone_number.length() != 11) {
                        System.out.println("전화번호 또는 휴대전화번호가 올바르지 않습니다. 다시 입력하세요.");
                    }
                } while (phone_number.length() != 11);

                String email;
                do {
                    System.out.println("이메일 주소를 입력하세요:");
                    email = sc.nextLine();
                    if (!email.contains("@") || !(email.endsWith("@naver.com") || email.endsWith("@gmail.com") || email.endsWith("@daum.net") || email.endsWith("@kakao.com") || email.endsWith("@nate.com"))) {
                        System.out.println("이메일 주소가 올바르지 않습니다. 다시 입력하세요.");
                    }
                } while (!email.contains("@") || !(email.endsWith("@naver.com") || email.endsWith("@gmail.com") || email.endsWith("@daum.net") || email.endsWith("@kakao.com") || email.endsWith("@nate.com")));

                String business_number;
                do {
                    System.out.println("사업자 번호를 입력하세요 (10자리):");
                    business_number = sc.nextLine();
                    if (business_number.length() != 10) {
                        System.out.println("사업자 번호가 올바르지 않습니다. 다시 입력하세요.");
                    }
                } while (business_number.length() != 10);

                String insert = "INSERT INTO business_customers (user_id, password, company_name, phone_number, email, business_number, created_at) VALUES (?, PASSWORD(?), ?, ?, ?, ?, NOW())";
                PreparedStatement ps = con.prepareStatement(insert);
                ps.setString(1, user_id);
                ps.setString(2, password);
                ps.setString(3, company_name);
                ps.setString(4, phone_number);
                ps.setString(5, email);
                ps.setString(6, business_number);

                int oksign = ps.executeUpdate();
                if (oksign == 1) {
                    System.out.println("저장이 잘 되었습니다.");
                    ps.close();
                    con.close();
                    sc.close();
                } else {
                    System.out.println("SQL 문법 오류로 인하여 저장되지 않았습니다.");
                }
            } else {
                System.out.println("잘못된 회원 유형입니다. 다시 시도해주세요.");
            }
        } catch (Exception e) {
            System.out.println("DB 정보가 올바르지 않습니다.");
        }
    }
}