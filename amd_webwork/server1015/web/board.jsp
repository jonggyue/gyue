<%-- 
    Document   : boardi
    Created on : 2014. 10. 15, ���� 2:17:58
    Author     : jonggyue
--%>

<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%> 
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="euc-kr"%>
<%
    //--�ѱ�ó��
    request.setCharacterEncoding("euc-kr");
    
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    int age = Integer.parseInt(request.getParameter("age"));
    String writter = request.getParameter("writter");
    String pass = request.getParameter("pwd");
    String gender = request.getParameter("gender");

    // 1.JDBC�� ����ϱ� ���ؼ� Connection�� ȹ��
    Connection con = null;
    PreparedStatement pstmt = null;
    try {
        // 1-1 Ŀ�ؼ� ��ü�� ����
        con = ConnUtil.getConn();
        //2.SQL ����ϼ�
        StringBuffer sql = new StringBuffer();
        sql.append("insert into jspboard values(jspboard_seq.nextVal,?,?,?,?,?,?,0,?,sysdate)");
        // 3. ���۰�ü ���� �� ������ ���ε�
        pstmt = con.prepareStatement(sql.toString());
        pstmt.setString(1, title);
        pstmt.setString(2, content);
        pstmt.setInt(3, age);
        pstmt.setString(4, writter);
        pstmt.setString(5, pass);
        pstmt.setString(6, gender);
        pstmt.setString(7, request.getRemoteAddr()); // Ŭ���̾�Ʈ ����������
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        //--�۾������� ������ �ڿ��� ��ȯ
        try {
            if (pstmt != null) {
                pstmt.close();
            }
            if (con != null) {
                con.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

    String styleColor = "";
    if (gender.equals("male")) {
        styleColor = "#3300ff";
    } else {
        styleColor = "#ff33cc";
    }
    String msg = "";
    if (age < 19) {
        msg = "�̼������Դϴ�.";
    } else {
        msg = "�����Դϴ�.";
    }
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=euc-kr">
        <title>JSP Page</title>
    </head>

    <body>
        <div style="background: <%=styleColor%>">
            <h1><%=writter%> <%=msg%></h1>
            <p><%=title%></p>
            <p><%=content%></p>
            <p><%=gender%></p>
            <a href="exam.html">back</a>
        </div>
    </body>
</html>
