package io;
/*
 I/O 응용편
 응용문제1
 해당 데이터를 파일로 저장 후 출력하는 프로세서를 제작하시오.
 "hong", "kim", "park", "lee"
 "25", "30", "44", "26"
 "홍길동", "김유신", "박찬호", "이순신"
 
 파일에 저장 형태는 다음과 같습니다.
 홍길동: hong(25)
 김유신: kim(30)
 박찬호: park(44)
 이순신: lee(26)
 단, 파일명은 member_list.txt로 저장되어 있어야 합니다.
 */
import java.io.*;

public class file14 {
    public static void main(String[] args) {
        String[] ids = {"hong", "kim", "park", "lee"};
        String[] ages = {"25", "30", "44", "26"};
        String[] names = {"홍길동", "김유신", "박찬호", "이순신"};

        try (BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\project\\web\\src\\main\\webapp\\member_list.txt", true))) {
            for (int i = 0; i < ids.length; i++) {
                bw.write(names[i] + ": " + ids[i] + "(" + ages[i] + ")");
                bw.newLine();
            }
            bw.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
