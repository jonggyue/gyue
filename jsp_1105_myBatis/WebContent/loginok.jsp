<%@page import="java.util.HashMap"%>
<%@page import="dao.JoinDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%
	String id = request.getParameter("id");
	String pwd = request.getParameter("pwd");
	HashMap<String, String> info = new HashMap<String, String>();
	info.put("id", id);
	info.put("pwd", pwd);

	int cnt = JoinDao.getDao().login(info);

	//mjoin테이블에서 데이터를 비교해 검색 구현...

	if (cnt == 1) {
		//디비 회원테이블에서 조회가 성공.
		//세션에게 사용자의 정보를 심는다.
		session.setAttribute("MEMBERID", id);
		session.setAttribute("USERNAME", "길동이");
		response.sendRedirect("ex1_body.jsp");//로긴성공
	} else {
		response.sendRedirect("error.jsp");//로긴실패
	}
%>