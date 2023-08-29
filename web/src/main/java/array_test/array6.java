package array_test;

import java.util.*;

// 2차 배열
public class array6 {

	public static void main(String[] args) {
		new array6().test();
	
	}
	public void test() {
		/*
		int a[] = new int[2];
		a[0] = 1; //정적 배열
		int b[] = {1, 2, 3, 4, 5}; //동적 배열
		*/
		String member[][] = {
				{"박초름","윤보미", "정은지", "김남주", "오하영"},
				{"31", "29", "33", "31", "32"}
		};
		int ea = member.length;
		System.out.println(ea);
		int data_ea = member[0].length;
		System.out.println(data_ea);
		/*
		 응용문제 7
		 다음 코드를 활용하여 결과값을 예시처럼 출력되도록 하시오.
		 박초름
		 31
		 윤보미
		 29
		 정은지
		 33
		 */
		
		
		for (int ff = 0; ff < data_ea; ff++) { //5
		    for (int f = 0; f < ea; f++) { //2바뀌
		        System.out.println(member[f][ff]);
		    }
		}
		
		/*
		 응용문제 8
		 해당 데이터 배열에 있는 모든 값 중 짝수값만 모두 더하여 결과값을
		 출력하는 코드를 작성하시오. (2차 배열)
		 1번 데이터 : 11, 42, 22, 16
		 2번 데이터 : 7, 33, 10, 29
		 결과값은 90이다.
		 */
		
		int number[][] = {
				{11, 42, 22, 16},
				{7, 33, 10, 29}
		};
		/*
		 * int sum = 0; int i; int j; for (i = 0; i < number.length; i++) { for (j = 0;
		 * j < number[i].length; j++) { if (number[i][j] % 2 == 0) { sum +=
		 * number[i][j]; } } } System.out.println("결과값: " + sum);
		 */
		
		//다른 방식 foreach 방식
		int total = 0; //합산 결과 변수값
		
		for(int a[] : number) { //2차배열을 1차배열로 따로따로 구성
			for(int b : a) { 	//위에서 구성된 1차 배열에 있는 데이터를 분리
				if(b % 2 == 0) {//짝수 조건일 경우
					total += b;
				}
			}
		}
		System.out.println(total);
        
        /*
         숙제 :
         해당 두 개의 배열 데이터가 있습니다.
         각 배열별로 인덱스가 같은 번호를
         더하여 짝수, 홀수인지를 배열 결과 데이터로 재설정하여 출력하시오.
         
         Adata = 5 17 19 22 23
         Bdata = 1 2 3 4 5
         
         결과 출력 예시)
         ["짝수", "홀수", "짝수", "짝수", "짝수"]
         */
		
		int[] Adata = {5, 17, 19, 22, 23};
		int[] Bdata = {1, 2, 3, 4, 5};
		String[] result = new String[Adata.length];
		for (int i = 0; i < Adata.length; i++) {
		    int sum = Adata[i] + Bdata[i];
		    if (sum % 2 == 0) {
		        result[i] = "짝수";
		    } else {
		        result[i] = "홀수";
		    }
		}
		System.out.println(Arrays.toString(result));
	}
}