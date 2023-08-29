package javatest;

import java.util.Scanner;

/*
 숙제1
 "개인정보 수집 및 이용동의 (Y/N)"
 "이메일 수집 및 이용동의 (Y/N)"
 "통합서비스 약관 이용동의 (Y/N)"
 해당 동의를 모두 Y를 하였을 경우
 "서비스 이용약관에 모두 동의하셨습니다."라는 콘솔이 출력
 단, 하나라도 N이 적용될 시 다시 처음부터 약관 동의 내용이 출력되도록 합니다.
 
*/

public class work1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean agreed = false;
        while (!agreed) {
            System.out.print("개인정보 수집 및 이용동의 (Y/N): ");
            String aa = sc.nextLine();
            System.out.print("이메일 수집 및 이용동의 (Y/N): ");
            String bb = sc.nextLine();
            System.out.print("통합서비스 약관 이용동의 (Y/N): ");
            String cc = sc.nextLine();
            if (aa.equalsIgnoreCase("Y") && bb.equalsIgnoreCase("Y") && cc.equalsIgnoreCase("Y")) {
                agreed = true;
                System.out.println("서비스 이용약관에 모두 동의하셨습니다.");
            } else {
                System.out.println("모든 약관에 동의해야 합니다. 다시 시도해주세요.");
            }
        }
    }
}
