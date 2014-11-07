<%@page import="dao.BbsDao"%>
<%@page import="vo.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
		<%
			int num = Integer.parseInt(request.getParameter("num"));
			BbsVO vo = BbsDao.getDao().delete(num);
			response.sendRedirect("bbslist.jsp");
		%>
