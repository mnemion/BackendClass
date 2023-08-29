package web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
// Controller 파트
public class main extends HttpServlet {
	// 웹 통신에 사용하기 위한 암호화된 페이지 명시한 메모리 형태의 명령어
	private static final long serialVersionUID = 1L;
       
    public main() { //즉시 실행
        super();
    }
    //doGet => method GET 전송
    
	 protected void doGet(HttpServletRequest request, HttpServletResponse
	 response) throws ServletException, IOException { String a =
	 request.getParameter("data"); System.out.println(a); }
	 
	//doPost => method POST 전송
    
	/* 
	   HttpServletRequest : 프론트에서 값을 넘겨받는 통신 언어
	   httpServletResponse : 결과값을 출력 또는 프론트로 return하는 통신 언어
	   getParameter : 프론트에 사용하는 name명 (모든 데이터는 문자 또는 boolean 형태로 구성)
	*/
	/*
	 * protected void doPost(HttpServletRequest request, HttpServletResponse
	 * response) throws ServletException, IOException { String a =
	 * request.getParameter("data"); System.out.println(a); }
	 */
}
