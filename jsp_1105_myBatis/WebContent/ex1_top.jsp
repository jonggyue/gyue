<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!--2014. 11. 4.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<link rel="stylesheet" href="css/style.css" type="text/css">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script>
	$(document).ready(function() {

	});
</script>
<title>Insert title here</title>
</head>
<body>
	<header class="hd">
		<h1>Include 연습</h1>
		<h2>include 지시자의 top.jsp영역
 		<%
		if(session.getAttribute("id")==null){
			String uname = (String)session.getAttribute("id");
		%>
		<%=uname %>님 반갑습니다. ^^	
		<%}
		%>
		</h2>
	</header>
	<nav>
		<ul>
			<li><a href="ex1_body.jsp">홈</a>&nbsp; |</li>
			<%
				// 세션의 유무판단
					if(session.getAttribute("MEMBERID")==null){
			%>
			<li><a href="join.jsp">회원가입</a>&nbsp; |</li>
			<li><a href="loginForm.jsp">로그인</a>&nbsp; |</li>
			<%
				}else{
			%>
			<li><a href="mypage.jsp">개인정보</a>&nbsp; |</li>
			<li><a href="loginOut.jsp">로그아웃</a>&nbsp; |</li>
			<%
				}
			%>
			<li><a href="bbslist.jsp">게시판</a>&nbsp; |</li>
			<li><a href="">메뉴1</a>&nbsp; |</li>
			<li><a href="">메뉴1</a>&nbsp; |</li>
			<li><a href="">메뉴1</a></li>
		</ul>
	</nav>
</body>
</html>