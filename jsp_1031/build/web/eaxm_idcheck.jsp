<%-- 
    Document   : eaxm1
    Created on : 2014. 11. 1, 오후 4:57:33
    Author     : jonggyue
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="conn.ConnUtils"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    String idv = request.getParameter("id");
    Connection con = ConnUtils.getConn();
    String msg = "";
    PreparedStatement pstm = null;
    StringBuffer sb = new StringBuffer();
    sb.append("select count(*) cnt from mymember ");
    sb.append(" where id=?");
    pstm = con.prepareStatement(sb.toString());
    pstm.setString(1, idv);
    ResultSet rs = null;
    int cnt = 0;
    
    rs = pstm.executeQuery();
    if (rs.next()) {
        cnt= rs.getInt("cnt");
    }

    if (cnt != 0) {
        msg = idv + "는 이미 존재하는 아이디 입니다.^^";
    } else {
        msg = idv + "는 사용이 가능한 아이디 입니다.";
    }

%><%=msg%>
