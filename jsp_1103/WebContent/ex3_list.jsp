<%@page import="dao.ImgDirDao"%>
<%@page import="vo.ImgDriVO"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!-- 2014. 11. 3. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
</head>
<body>
	<% 
		//Dao로 부터 데이터를 받아오기 위한 메서드를 호출
		ArrayList<ImgDriVO> list = ImgDirDao.getDao().getList();
		for(ImgDriVO e : list){
	%>
	<p>
		<img src=
		"<%=application.getContextPath()%>/upload/<%=e.getImgpath()%>">
	</p>
	<% } %>
	<a href="ex3_uploadForm.jsp"> 업로드폼 </a>
</body>
</html>






