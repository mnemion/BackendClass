package javatest;

import java.util.*;

/*
 응용문제1
 외부 클래스명 data2를 활용하여 조건문을 완성하는 코드를 작성하시오.
 "첫번째 숫자를 입력합니다."
 "두번째 숫자를 입력합니다."
 어느값이 큰값인지 콘솔로 출력하시오.
 단, 첫번째, 두번째 숫자 중 하나라도 미 입력 시 재호출되도록 합니다. 
 */
public class java5 {
    public static void main(String[] args) {
    	data2 dt = new data2();
    	dt.abc();
    }
}

class data2 {
	Scanner sc = null;
	//intern(), equals() : 문자만 받음
	//숫자 : 연산기호 (==, ===, !=, >=, <=, <, >);
	public void abc() {
		System.out.println("첫번째 숫자를 입력하세요:");
		this.sc = new Scanner(System.in);
		String a = this.sc.nextLine().intern();
		System.out.println("두번째 숫자를 입력하세요:");
		String b = this.sc.nextLine().intern();
		
		if(a == null || a == "" || b == null || b == "") {	// || (조건 중 하나라도 맞을 경우), && (모든 조건이 맞을 경우)
			abc();	//재호출
		} else {
			int aa = Integer.parseInt(a);	//문자를 숫자로 변환
			int bb = Integer.parseInt(b);
			if(aa > bb) {
				System.out.println("첫번째 값이 큽니다.");
			} else if(aa < bb) {
				System.out.println("두번째 값이 큽니다.");
			} else {
				System.out.println("두 값이 같습니다.");
			}
		}
	}
}
