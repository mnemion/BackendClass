package javatest;

import java.math.BigInteger;

/*
 반복문 for, while, do~while
*/
public class java6 {

	public static void main(String[] args) {
		new data3().abc();
	}
}

/* 1부터 5까지 출력문 */
class data3 {
    public void abc() {
    	/*
    	int f;
        for(f = 1; f<=5; f++) {
        	System.out.println(f);
        }
        */
    	
    	/*
    	int w = 1;
    	while(w <= 5) {
    		System.out.println(w);
    		w++;
    	}
    	*/
    	
    	/*
    	int w = 1;
    	do {
    		System.out.println(w);
    		w++;
    	} while(w <= 5);
    	*/
    	
    	/*
    	 응용문제2
    	 해당 숫자를 역순으로 출력합니다.
    	 10 ~ 1까지 출력
    	*/
    	
    	/*
    	int w = 10;
    	while(w >= 1) {
    		System.out.println(w);
    		w--;
    	}
    	*/
    	
    	/*
    	for (int i = 5; i >= 0; i--) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        */
    	
    	/*
    	 응용문제3
    	 구구단 9단 
    	 9*1부터 9*9까지
    	 결과값 출력 (do~while문)
    	*/
    	
    	/*
    	int i = 1;
        do {
            System.out.println("9 x " + i + " = " + (9 * i));
            i++;
        } while (i <= 9);
        */
    	
    	/*
    	 응용문제4
    	 100에서 150까지 모든 수를 합한 결과값 출력
    	 while문으로
    	*/
    	
    	/*
    	int i = 100;
        int sum = 0;
        while (i <= 150) {
            sum += i;
            i++;
        }
        System.out.println("합한 결과는 " + sum + "입니다.");
        */
    	
    	/*
   	 	응용문제5
	   	 100에서 150까지 모든 수를 곱한 결과값 출력
	   	 for문으로
	   	*/
    	
    	/*
    	int z = 100;
    	double sum = 1;
    	for(z = 100; z <= 150; z++) {
    		sum *= z;
    	}
    	System.out.println(sum);
    	*/
    	
    	byte b = -128;	//byte -128부터 127까지 출력 가능
    	System.out.println(b);
    }
}