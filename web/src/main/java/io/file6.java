package io;

import java.io.*;
import java.util.*;

/*
 응용문제1
 Scanner를 이용하여 사용자가 입력한 숫자를 모두 저장되도록 하자.
 "1~100까지의 숫자 중 한가지를 입력하세요?"
 단, 한줄에 하나의 숫자가 입력되도록 하며,
 quit를 명령어를 입력 시
 더 이상 프로세서를 작동시키지 않도록 하자.
 저장 파일명은 number.dat로 저장되도록 하시오.
 */

public class file6 {
    public static void main(String[] args) {
        try {
            FileWriter fw = new FileWriter("E:\\project\\web\\src\\main\\webapp\\number.txt", true);
            Scanner sc = new Scanner(System.in);

            while (true) {
                System.out.println("1~100까지의 숫자 중 한가지를 입력하세요?");
                String input = sc.nextLine().intern();	//quit로 인하여 String으로 처리
                if (input.equals("quit")) {
                    break;
                }
                int num = Integer.parseInt(input);
                if (num >= 1 && num <= 100) {	// 100이상 입력 시에 해당
                    fw.write(num + "\n");	//100 이하 입력시 해당 파일로 저장
                } else {
                    System.out.println("잘못된 입력입니다.");
                }
            }
            System.out.println("데이터가 저장되었습니다.");
            fw.close();	//파일 저장 (close를 안할 경우 해당 파일 오픈되어 있으므로 저장되지 않는 상황이 발생)
            sc.close(); //Scanner 종료
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("파일 오류 발생!!");
        }
    }
}
