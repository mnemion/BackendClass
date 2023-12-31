package javatest;

import java.util.*;

/*
 overide를 활용함
 응용문제1
 "학생명을 입력해주세요?"
 "검색할 과목명을 입력하세요 (국어, 수학, 과학, 역사)?:"
 
 데이터는 데이터 별도의 class를 이용합니다.
 해당 클래스 class 안에 해당 배열 데이터가 있으며,
 해당 데이터를 상속 받아서 다음과 같이 결과가 돌출 되도록 프로세서를 작성하시오.
 
 [데이터]
 {"홍길동", "이순신", "유관순"}
 {"80", "78", "92", "40"},
 {"40", "80", "80", "100"},
 {"55", "40", "50", "80"}
 
 결과 :
 홍길동
 과학 88점
 */

public class java13 {
	public static void main(String[] args) {
		search sh = new search();
		sh.list();	//상속받은 메소드를 실행
		sh.datasearch();
	}
}

class Datalist {	//DB영역
    String members[][] = null; //필드에 원시 배열 선언
    String userlist[] = null;
    
    public void list() {
    	this.userlist = new String[] {"홍길동", "이순신", "유관순"};
    	
    	this.members = new String[][] {	//this를 이용해서 실행
    		 {"80", "78", "92", "40"},
    		 {"40", "80", "80", "100"},
    		 {"55", "40", "50", "80"}
    	};
    }
}

class search extends Datalist {	//deepToString : 2차 배열에서 사용하는 메소드
	Scanner sc = null;
	@Override
	public void list() {
		super.list(); //super는 상속 받을 때 해당 메소드를 실행 후 상속 받음
		//System.out.println(Arrays.toString(this.members[0]));
		//System.out.println(Arrays.toString(this.members));
		//System.out.println(Arrays.deepToString(this.members));
	}
	
	public void datasearch() {
		this.list();
		this.sc = new Scanner(System.in);
		//System.out.println(Arrays.deepToString(this.members));
		System.out.println("학생명을 입력해주세요?:");
		String name = this.sc.nextLine().intern();
		int node = 0;
		for(String n : this.userlist) {
			if(n == name) {
				node = node;
				break;
			}
			else {
				node++;
			}
		}
		if (node == 0) {
            System.out.println(name + " 학생은 데이터에 존재하지 않습니다.");
            return;
        }
		
		System.out.print("검색할 과목명을 입력하세요 (국어, 수학, 과학, 역사)?: ");
		String subject = this.sc.nextLine();
		int snode = 0;	//과목에 대한 노드번호
		switch(subject) {
		case "국어": 
			snode = 0;
		break;
		
		case "수학":
			snode = 1;
		break;
		
		case "과학":
			snode = 2;
		break;
		
		case "역사":
			snode = 3;
		break;
		
		default:
			System.out.println("해당 과목은 존재하지 않습니다.");
			break;
		}
		System.out.println(name + " 학생의 " + subject + " 점수는 " + this.members[node][snode] + "점 입니다.");
	}
}
