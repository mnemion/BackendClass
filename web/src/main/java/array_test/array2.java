package array_test;

// 원시배열 + 조건문 + 반복문
public class array2 {

	public static void main(String[] args) {
		array2 ar = new array2();
		ar.test();
		
		//둘 중 하나 쓰면 됨
		//new array2().test();
	}
	public void test() {
		String id[] = {"hong", "kim", "park", "lee", "jang", "so"};
		//힌트
		int word = id[0].length();
		System.out.println(word);
		/*
		 응용문제1
		 해당 사용자 아이디 배열값 중 아이디가 3자리 이하의 사용자만 출력하시오.
		 */
		int w = 0;
		int ea = id.length;
		do {
			//System.out.println(id[w]);
			if(id[w].length() <= 3) {
				System.out.println(id[w]);
			}
			w++;
		}while(w < ea);
		/* 응용문제2 
		 * 데이터는 다음과 같습니다. 15 60 11 14 27의 총 5개의 숫자가 있으며 해당 데이터의 모든 합한 결과값을 출력시키시오.*/
		 int[] data = {15, 60, 11, 14, 27};
		 int sum = 0;
		 for (int i = 0; i < data.length; i++) {
		     sum += data[i];
		    }
		 System.out.println("모든 데이터의 결과값 " + sum);
		 
		 //또 다른 방법
		 int total = 0;
		 while(sum < data.length) {
			 System.out.println(data[sum]);
			 total = total + data[sum];
			 sum++;
		 }
		 System.out.println("모든 데이터의 결과값 " + sum);
		 
		/*
		 응용문제3
		 다음 숫자 데이터 리스트 중 짝수의 값만 모두 더한 최종 결과값을 출력하시오.
		 5 10 15 20 25 30 35
		 */
		 int[] data1 = {5, 10, 15, 20, 25, 30, 35};
	     int sum1 = 0;
	     for (int i = 0; i < data1.length; i++) {
	         if (data1[i] % 2 == 0) {
	             sum1 += data1[i];
	         }
	     }
	     System.out.println("결과값: " + sum1);
	     
	     //또 다른 방식
			/*
			 * int[] number[] = {5, 10, 15, 20, 25, 30, 35}; int f; int sumf = 0; for(f= 0;
			 * f < number.length; f++) { if(number[f] % 2 == 0) { sum = sum + number[f]; } }
			 * System.out.println("결과값: " + sumf);
			 */
		
		for (int i = 0; i < id.length; i++) {
		     if (id[i].length() <= 3) {
		         System.out.println(id[i]);
		     }
		}
	}
}