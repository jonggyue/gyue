<%-- 
    Document   : test
    Created on : 2014. 10. 31, ���� 3:22:59
    Author     : 1
--%>

<%@page import="conn.ConnUtils"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    // PrepareStatement ps �۾� bind�۾� excuteUpdate
    Connection con = ConnUtils.getConn();
    System.out.println("Log:"+con);
    //����۾��� �����ٸ�....
    //�̵��� ��� ����
    // response.sendRedirect("list.jsp");
    
%>
