<%-- 
    Document   : boardi
    Created on : 2014. 10. 15, 오후 2:17:58
    Author     : jonggyue
--%>

<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.PreparedStatement"%> 
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="euc-kr"%>
<%
    //--한글처리
    request.setCharacterEncoding("euc-kr");
    
    String title = request.getParameter("title");
    String content = request.getParameter("content");
    int age = Integer.parseInt(request.getParameter("age"));
    String writter = request.getParameter("writter");
    String pass = request.getParameter("pwd");
    String gender = request.getParameter("gender");

    // 1.JDBC를 사용하기 위해서 Connection을 획득
    Connection con = null;
    PreparedStatement pstmt = null;
    try {
        // 1-1 커넥션 객체를 생성
        con = ConnUtil.getConn();
        //2.SQL 문장완성
        StringBuffer sql = new StringBuffer();
        sql.append("insert into jspboard values(jspboard_seq.nextVal,?,?,?,?,?,?,0,?,sysdate)");
        // 3. 전송객체 설정 및 데이터 바인딩
        pstmt = con.prepareStatement(sql.toString());
        pstmt.setString(1, title);
        pstmt.setString(2, content);
        pstmt.setInt(3, age);
        pstmt.setString(4, writter);
        pstmt.setString(5, pass);
        pstmt.setString(6, gender);
        pstmt.setString(7, request.getRemoteAddr()); // 클라이언트 아이피정보
        pstmt.executeUpdate();
    } catch (SQLException e) {
        e.printStackTrace();
    } finally {
        //--작업종료후 무조건 자원을 반환
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
        msg = "미성연자입니다.";
    } else {
        msg = "성인입니다.";
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
