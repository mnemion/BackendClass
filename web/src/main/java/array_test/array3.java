package array_test;

// foreach문 : 무조건 배열에만 사용하는 반복문
public class array3 {

	public static void main(String[] args) {
		new array3().test();
	}
	public void test() {
		/* foreach는 배열 값을 이용하여 범위에 할당한 만큼만 반복적으로 사용하는 문법
		   주의사항 : 배열 자료형과 foreach에 사용하는 자료형은 동일하게 설정
		*/
		String user[] = {"홍길동", "김유신", "장보고", "유관순"};
		for(String f : user) {
			System.out.println(f);
		}
		/* 
		 응용문제4
		 foreach를 이용하여 다음 배열 데이터의 값을 모두 곱한 결과를 출력하시오.
		 5 10 15 20 25 30 35
		*/
		/*int[] data = {5, 10, 15, 20, 25, 30, 35};
		int aa = 1;
		for (int bb : data) {
		    aa *= bb;
		}
		System.out.println("곱한값 :" + aa);*/
		
		//다른 방식
		int no[] = {5, 10, 15, 20, 25, 30, 35};
		int aaa= 1;
		for(int n : no) {
			aaa = aaa * n;
		}
		System.out.println("곱한값 :" + aaa);
		
		/*
		 응용문제5
		 다음 리스트 숫자 중 짝수, 혹수 각각의 갯수를 출력하시오.
		 3, 6, 9, 12, 15, 18, 21, 24, 27
		 */
		
		/*
		int[] data = {3, 6, 9, 12, 15, 18, 21, 24, 27};
		int aaaa = 0;
		int bbbb = 0;
		for (int cccc : data) {
		    if (cccc % 2 == 0) {
		       aaaa++;
		    } else {
		       bbbb++;
		    }
		}
		System.out.println("짝수" + aaaa);
		System.out.println("홀수" + bbbb);
		*/
		
		//다른 방식
		int num[] = {3, 6, 9, 12, 15, 18, 21, 24, 27};
		int count1 = 0;
		int count2 = 0;
		for(int z : num) {
			if(z % 2 == 0) {
				count1++;
			}
			else {
				count2++;
			}
		}
		System.out.println("짝수: " + count1);
		System.out.println("홀수: " + count2);


		
	}
}