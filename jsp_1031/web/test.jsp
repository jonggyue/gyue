<%-- 
    Document   : test
    Created on : 2014. 10. 31, 오후 3:22:59
    Author     : 1
--%>

<%@page import="conn.ConnUtils"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    // PrepareStatement ps 작업 bind작업 excuteUpdate
    Connection con = ConnUtils.getConn();
    System.out.println("Log:"+con);
    //디비작업이 끝났다면....
    //이동할 경로 지정
    // response.sendRedirect("list.jsp");
    
%>
