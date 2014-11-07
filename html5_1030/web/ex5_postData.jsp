<%-- 
    Document   : ex5_postData
    Created on : 2014. 10. 30, 오후 3:19:56
    Author     : 1
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%

    String idv = request.getParameter("mid");
    String msg = "";
    Connection con = null;
    PreparedStatement pstm = null;
    StringBuffer sb = new StringBuffer();
    con = ConnUtil.getConnection();
    //리스트작업
    sb.append("select count(*) cnt from imember ");
    sb.append(" where mid=?");
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
