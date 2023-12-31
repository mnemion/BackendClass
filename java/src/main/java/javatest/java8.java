package javatest;

import java.util.Scanner;

/*
 double loop 응용편 (do~while + for)
 다음 결과값처럼 출력되도록 하시오.
 9*1 = 9
 9*2 = 18
 9*3 = 27
 8*1 = 8
 8*2 = 16
 8*3 = 24
 7*1 = 7
 7*2 = 14
 7*3 = 21
 */
public class java8 {

	public static void main(String[] args) {
		//new data5().abc();
		
		/*
		 응용문제5
		 Scanner를 이용하여 다음과 같이 결과값이 나오도록 합니다.
		 "구구단 2단부터 9단까지 숫자를 하나 입력하세요:
		 사용자가 5를 입력 시
		 5*1부터 5*9 = 45까지 출력되도록 합니다.
		 단, 메인메소드에서 입력을 받은 후 외부 클래스 메소드로 전송하여 출력합니다.
		*/
		
		Scanner scanner = new Scanner(System.in);
        System.out.print("구구단 2단부터 9단까지 숫자를 하나 입력하세요: ");
        int dan = scanner.nextInt();
        if (dan >= 2 && dan <= 9) {
        	new data5().abc(dan);
        } else {
        	System.out.println("입력한 숫자가 범위를 벗어났습니다. 2단부터 9단까지의 숫자를 입력해주세요.");
        }
        
	}
}

class data5{
	public void abc(int dan) {
		/*
		int i = 9;
		do {
		    for (int j = 1; j < 4; j++) {
		        System.out.println(i + " * " + j + " = " + (i*j));
		    }
		    i--;
		} while (i > 6);
		*/
		
		//다른 방식
		/*
		int w = 9;
		int f;
		do {
			for(f=1;f<=3;f++) {
				System.out.println(w + " * " + f + " = " + (w*f));
			}
			w--;
		}while(w > 6);
		*/
		
		for (int i = 1; i < 10; i++) {
            System.out.println(dan + " * " + i + " = " + (dan*i));
        }
		
	}
}