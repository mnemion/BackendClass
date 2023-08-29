package javatest;
import java.util.Arrays;

import app.app1;	//패키지명.public class명
//import : 가져오는 기능, export : 내보내는 기능

/*
 1. 패키지가 다를 경우 public class 핸들링
 */
public class java9 {
	//packge app(app1.java) 연계 프로세서
	public static void main(String[] args) {
		//다른 패키지에 있는 public Class만 호출하여 가져올 수 있음
		app1 ap = new app1();
		ap.main(args);
		
		/*
		new abox().dataload();
		new bbox().dataload();;
		new cbox().dataload();;
		*/
		
		//배열로 클래스 로드
		ddd[] d = {new abox(), new bbox(), new cbox()};	//추상 클래스를 상속 받아서 처리하는 class를 배열화하여 순차적으로 작동시키는 형태
		//d[0].dataload();
		
		/*
		for(ddd z : d) {
			z.dataload();
		}
		*/
		
		//반복문으로 배열에 있는 class를 순차적으로 실행시키는 상황
		int w = 0;
		while(w < d.length) {
			if(w != 1) {	//해당 class 외에 다른 class만 실행 : if빼고 돌려도 됨
				d[w].dataload();
			}
			w++;
		}
		
	}
}

//abstract : 추상 클래스 + 추상 메소드 (프레임워크에 활용)
/*
 public class가 없을 경우 abstract에서도 public로 핸들링할 수 있으며,
 단, public class가 있을 경우 default로 abstract를 이용합니다.
 
 public, private, protected : 접근에 해당됨
 
 public 접근 제한자: 단어 뜻 그대로 외부 클래스가 자유롭게 사용할 수 있도록 함.
 protected 접근 제한자: 같은 패키지 또는 자식 클래스에서 사용할 수 있도록 함.
 private 접근 제한자: 단어 뜻 그대로 개인적인 것이라 외부에서 사용될 수 없도록 함.
 default(해당 파일에서 활용하는 변수선언)
 */
abstract class ddd{	//회원가입 게스트 적용 형식
	public String userid = "guest"; //공용으로 사용하는 변수 (this를 모두 활용 가능)
	public String useremail = null;
	public int userpoint = 0;
		
	public abstract void dataload();
}

class abox extends ddd{
	
	@Override
	public void dataload() {
		this.userpoint = 2500;
		System.out.println(this.userpoint);
		System.out.println("abox 클래스");		
	}
}

class bbox extends ddd{
	@Override
	public void dataload() {
		System.out.println("bbox 클래스");
	}
}

class cbox extends ddd{
	@Override
	public void dataload() {
		System.out.println("cbox 클래스");
	}
}