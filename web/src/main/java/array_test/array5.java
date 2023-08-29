package array_test;

import java.util.*;

// sort
public class array5 {

	public static void main(String[] args) {
		new array5().test();
	}
	public void test() {
		/*
		 sort : 오름차순, 내림차순으로 정렬할 때 사용하는 클래스
		 단, int 사용 시 Collections.reverseOrder가 작동하지
		 않는 숫자 방식은 Integer로 설정시 정상 작동합니다.
		 */
		
		int a[] = {10, 1, 6, 9, 20, 11};
		Arrays.sort(a);
		System.out.println(Arrays.toString(a));
		
		Integer b[] = {10, 1, 6, 9, 20, 11};
		Arrays.sort(b, Collections.reverseOrder());
		System.out.println(Arrays.toString(b));
		
		String c[] = {"z", "a", "c", "h", "f"};
		Arrays.sort(c);
		System.out.println(Arrays.toString(c));
		
		Arrays.sort(c, Collections.reverseOrder());
		System.out.println(Arrays.toString(c));
	}
}