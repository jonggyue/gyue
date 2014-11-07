
<%@page import="dao.JoinDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>

<%
	request.setCharacterEncoding("euc-kr");
%>
<jsp:useBean id="vo" class="vo.MemberVO"></jsp:useBean>
<jsp:setProperty property="*" name="vo" />

<%JoinDao.getDao().MemberAdd(vo);%>
