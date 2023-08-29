package javatest;

import java.util.Scanner;

/*
 [숙제]
 추상 클래스하고 중첩 클래스를 이용하여 프로세서를 제작합니다.
 추상 클래스에서는 father라는 이름을 가지고 있으며,
 메소드는 f_method라는 이름을 가집니다.
 또한 변수도 u_name이라는 문자형 변수를 생성합니다.
 
 f_method에 문자형으로 인자값을 하나 받는 형태로 제작합니다.
 메인에서 Scanner를 이용하여 사용자 이름을 입력하는 프로세서를 구성합니다.
 구성 후 외부 클래스로 f_method로 값을 전달합니다.
 
 전달된 값을 자식 클래스에 전달하며, 해당 메소드에 다음과 같이 처리합니다.
 홍길동, 이순신, 유관순은 일반회원입니다.라고 출력을 하며,
 강감찬, 장보고는 실버회원입니다.라고 출력합니다.
 그 외에 사용자 이름을 입력 시 "해당 사용자는 비회원입니다."라고 출력되도록 하시오.
 */

abstract class Father {
    String u_name;
    abstract void f_method(String name);

    static class Child extends Father {
        void f_method(String name) {
            u_name = name;
            if (u_name.equals("홍길동") || u_name.equals("이순신") || u_name.equals("유관순")) {
                System.out.println(u_name + "은 일반회원입니다.");
            } else if (u_name.equals("강감찬") || u_name.equals("장보고")) {
                System.out.println(u_name + "은 실버회원입니다.");
            } else {
                System.out.println("해당 사용자는 비회원입니다.");
            }
        }
    }
}

public class work4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("사용자 이름을 입력하세요: ");
        String name = sc.nextLine();
        Father.Child c = new Father.Child();
        c.f_method(name);
    }
}