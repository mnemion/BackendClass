package io;
//숙제
/*
  Scanner를 이용하여 총 10개의 숫자를 입력한다.
  단, 1~100까지의 숫자만 입력이 가능하며, 100 이상 숫자를 입력할 경우
  해당 콘솔로 "100까지의 숫자만 입력 가능합니다."라고 메시지가 출력되어야 한다.
  무조건 10개의 숫자를 받아야 하며, 해당 숫자는 모두 data_num.txt 파일로 저장되어야 한다.
  힌트) 무한반복 사용 및 counting을 이용해야 함
*/

import java.util.*;
import java.io.*;
import java.nio.file.*;

public class file18 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int count = 0;
        String data = "";
        while (count < 10) {
            System.out.println("1과 100 사이의 숫자를 입력하십시오: ");
            int num = sc.nextInt();
            if (num >= 1 && num <= 100) {
                data += num + "\n";
                count++;
            } else {
                System.out.println("100까지의 숫자만 입력 가능합니다.");
            }
        }
        sc.close();
        try {
            Path data1 = Paths.get("E:\\project\\web\\src\\main\\webapp\\data_num.txt");
            Files.createFile(data1);
            Files.write(data1, data.getBytes());
            System.out.println("메모장에 데이터가 저장되었습니다.");
        } catch (IOException e) {
        	e.printStackTrace();
            System.out.println("오류가 발생했습니다.");
        }
    }
}
