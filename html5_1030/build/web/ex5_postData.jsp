<%-- 
    Document   : ex5_postData
    Created on : 2014. 10. 30, ���� 3:19:56
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
    //����Ʈ�۾�
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
        msg = idv + "�� �̹� �����ϴ� ���̵� �Դϴ�.^^";
    } else {
        msg = idv + "�� ����� ������ ���̵� �Դϴ�.";
    }
%><%=msg%>
