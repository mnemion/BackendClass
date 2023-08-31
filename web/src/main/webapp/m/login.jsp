<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>모바일 로그인 페이지</title>
</head>
<script>
	function login() {
		
	}
</script>
<body>
<header>
<%@ include file="./top.jsp" %>
</header>	<!-- 메뉴 또는 로그인 -->

<main>

<form name="f" method="post" action="./mlogin.do">
<section>
	<p>MEMBER-LOGIN</p>
	아이디 : <input type="text" name="mid" required="required"><br>
	패스워드 : <input type="password" name="mpass" required="required"><br>
	<button type="submit">로그인</button>
</section>
</form>

</main>

<footer>			<!-- copyright -->
<%@ include file="./copyright.jsp" %>
</footer>
</body>
<script>
	var id = "<%=user_id%>";
	var nm = "<%=user_name%>";
	
	if(id != "null" || nm != "null"){
		location.href="./index2.jsp";
	}
</script>
</html>