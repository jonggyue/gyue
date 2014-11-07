<%-- 
    Document   : eaxm_join
    Created on : 2014. 11. 1, ¿ÀÈÄ 5:15:45
    Author     : jonggyue
--%>

<%@page import="java.sql.PreparedStatement"%>
<%@page import="conn.ConnUtils"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    String idv = request.getParameter("id");
    String pwdv = request.getParameter("pwd");
    String namev = request.getParameter("name");
    String agev = request.getParameter("age");
    String emailv = request.getParameter("email");
    String hbv1 = request.getParameter("hb1");
    String hbv2 = request.getParameter("hb2");
    String hbv3 = request.getParameter("hb3");
    Connection con = ConnUtils.getConn();
    PreparedStatement pstm = null;
    StringBuffer sb = new StringBuffer();
    sb.append("insert into mymember values(");
    sb.append("mymember_seq.nextVal,?,?,?,?,?,?,?,?,sysdate)");
    pstm = con.prepareStatement(sb.toString());
    pstm.setString(1, idv);
    pstm.setString(2, pwdv);
    pstm.setString(3, namev);
    pstm.setString(4, agev);
    pstm.setString(5, emailv);
    pstm.setString(6, hbv1);
    pstm.setString(7, hbv2);
    pstm.setString(8, hbv3);
    pstm.executeUpdate();
    response.sendRedirect("eaxm_list.jsp");

%>
