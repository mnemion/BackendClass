package javatest;

import java.sql.*;
import java.util.*;

//외부 db 정보 클래스를 로드하여 연결하기
public class db_test3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		try {
			dbconfig db = new dbconfig();
			Connection con = db.info();
			
			String gender;
            do {
                System.out.println("성별을 입력하세요 (남성, 여성 중 하나):");
                gender = sc.nextLine();
                if (!gender.equals("남성") && !gender.equals("여성")) {
                    System.out.println("잘못된 성별입니다. 다시 입력하세요.");
                }
            } while (!gender.equals("남성") && !gender.equals("여성"));

            String age;
            do {
                System.out.println("연령층을 입력하세요 (10대, 20대, 30대, 40대, 50대 이상 중 하나):");
                age = sc.nextLine();
                if (!age.equals("10대") && !age.equals("20대") && !age.equals("30대") && !age.equals("40대") && !age.equals("50대 이상")) {
                    System.out.println("잘못된 연령층입니다. 다시 입력하세요.");
                }
            } while (!age.equals("10대") && !age.equals("20대") && !age.equals("30대") && !age.equals("40대") && !age.equals("50대 이상"));

            String climate_crisis;
            do {
                System.out.println("현재 기후 위기 단계 수준은? (매우 심각하다, 심각하다, 보통이다, 심각하지 않은 편이다 중 하나):");
                climate_crisis = sc.nextLine();
                if (!climate_crisis.equals("매우 심각하다") && !climate_crisis.equals("심각하다") && !climate_crisis.equals("보통이다") && !climate_crisis.equals("심각하지 않은 편이다")) {
                    System.out.println("잘못된 기후 위기 단계 수준입니다. 다시 입력하세요.");
                }
            } while (!climate_crisis.equals("매우 심각하다") && !climate_crisis.equals("심각하다") && !climate_crisis.equals("보통이다") && !climate_crisis.equals("심각하지 않은 편이다"));

            String insert = "INSERT INTO survey (mgender, mage, mclimate_crisis, mdate) VALUES (?, ?, ?, NOW())";
            PreparedStatement ps = con.prepareStatement(insert);
            ps.setString(1, gender);
            ps.setString(2, age);
            ps.setString(3, climate_crisis);

            int oksign = ps.executeUpdate();
            if (oksign == 1) {
                System.out.println("저장이 잘 되었습니다.");
                ps.close();
                con.close();
                sc.close();
            } else {
                System.out.println("SQL 문법 오류로 인하여 저장되지 않았습니다.");
            }
        } catch (Exception e) {
            System.out.println("DB 정보가 올바르지 않습니다.");
        }
    }
}