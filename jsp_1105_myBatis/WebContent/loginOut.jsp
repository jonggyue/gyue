<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<%
	session.removeAttribute("MEMBERID");
	session.removeAttribute("USERNAME");
	// session.invalidate(); => 모든 세션을 삭제
	response.sendRedirect("ex1_body.jsp");

%>