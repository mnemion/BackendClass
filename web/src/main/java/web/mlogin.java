package web;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/*
 응용문제1
 모바일 login.jsp에서 넘어온 아이디, 패스워드를 이용하여
 session을 통하여 정상적으로 로그인이 되도록 하며,
 로그인이 완료되었을 경우 index2.jsp로 이동되도록 합니다.
 
 아이디 / 패스워드 (Free)
 단, session은 아이디와 이름만 생성합니다.
 session명은 다음과 같습니다.
 
 아이디 : perid
 이름 : pernm
 
 아이디와 패스워드가 하나라도 미일치 시 "회원정보를 다시 한 번 확인하세요."
 
*/

@WebServlet("/m/mlogin.do")
public class mlogin extends HttpServlet {
	PrintWriter pw = null;
	HttpSession session = null;
	
	private static final long serialVersionUID = 1L;

    public mlogin() {
        super();
    }

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setContentType("text/html; charset=utf-8");
		
		String mid = request.getParameter("mid").intern();
		String mpass = request.getParameter("mpass").intern();
		PrintWriter pw = response.getWriter();
		HttpSession se = request.getSession();
		if(mid == "" || mpass == "") {
			System.out.println("값 전달 오류");
		}
		else {
			if(mid == "caffrey" || mpass =="a123456") {
				se.setAttribute("perid", mid);
				se.setAttribute("pernm", "김승균");
				pw.write("<script>"
					+ "alert('로그인되셨습니다.');"
					+ "location.href='./index2.jsp';"
					+ "</script>");
			}
			else {
				pw.write("<script>"
					+ "alert('아이디 및 패스워드를 확인하세요');"
					+ "history.go(-1);"
					+ "</script>");
			}
		}
	}
}
