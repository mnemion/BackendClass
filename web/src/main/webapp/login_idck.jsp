<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" trimDirectiveWhitespaces="true"%>
    
    <!-- trimDirectiveWhitespaces=false (out.print 적용시 공백 적용
    	 trimDirectiveWhitespaces=true JSP문법이 공백없이 결과값만 적용
     -->
    
    
<%  /* trimDirectiveWhitespaces="true" 공백 제거할 때 사용함 */
	/* response.addHeader: CORS(도메인이 다른 경우, 외부서버에서 접속을 할 때
	보안상 접속을 자동차단) - 접속허가를 해주는 클래스
	*/
	response.addHeader("Access-Control-Allow-Origin", "*");
	response.addHeader("Access-Control-Allow-Credentials", "true");
	
	//intern() : 문자열을 연산기호로 조건문에 사용할 수 있도록 하는 클래스
	String userid = request.getParameter("mid").intern();
	String msg = "";
	//DB : Select로 row 확인 작업
		
	if(userid=="admin"){
		msg = "no";
	}
	else if(userid==""){
		msg="error";
	}
	else{
		msg = "yes";
	}
	out.print(msg);	//ajax로 요청한 사항을 프론트엔드에게 return 결과값
%>