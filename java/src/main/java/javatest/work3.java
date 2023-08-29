package javatest;

import java.util.*;

/*
  [숙제] 상속형태의 클래스를 이용하여 다음 문제에 맞는 결과값을 돌출하는 코드를 작성하시오.
 [DB] = {55, 1, 6, 8, 10, 22, 96, 33, 31, 45, 48, 60}
 
 "해당 데이터를 1.짝수, 2.홀수를 선택하세요?"
 
 [결과]
 짝수값 : 6, 8, 10, 22, 96, 48, 60
 홀수값 : 55, 1, 33, 31, 45
 
 단, sort(정렬)하십시오.
 
 최종값에 대한 오름차순으로 정렬하여 최종출력합니다. (sort)
 최종값(짝수) : 6, 8, 10, 22, 48, 60, 96 (오름차순으로 정렬)
 */

class dbData {
    int[] datalist = {55, 1, 6, 8, 10, 22, 96, 33, 31, 45, 48, 60};
}

class Sort extends dbData {
    public void sortData() {
        int[] a = new int[datalist.length];
        int[] b = new int[datalist.length];
        
        int aa = 0;
        int bb = 0;
        for (int i : datalist) {
            if (i % 2 == 0) {
                a[aa++] = i;
            } else {
                b[bb++] = i;
            }
        }

        java.util.Arrays.sort(a);
        java.util.Arrays.sort(b);

        System.out.print("짝수값 : ");
        for (int i : a) {
            if (i != 0) {
                System.out.print(i + ", ");
            }
        }
        
        System.out.println();	//한칸 내리기

        System.out.print("홀수값 : ");
        for (int i : b) {
            if (i != 0) {
                System.out.print(i + ", ");
            }
        }
    }
}

public class work3 {
    public static void main(String[] args) {
        Sort s = new Sort();
        s.sortData();
    }
}
