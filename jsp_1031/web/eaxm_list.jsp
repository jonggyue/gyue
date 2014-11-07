<%-- 
    Document   : eaxm_list
    Created on : 2014. 11. 1, 오후 5:57:07
    Author     : jonggyue
--%>

<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="conn.ConnUtils"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%

    Connection con = ConnUtils.getConn();
    StringBuffer sb = new StringBuffer();
    sb.append("select mymemberno,id,pwd,name,age,email,hobby1,hobby2,hobby3,mymemberdate from mymember ");
    sb.append("order by 1 desc");
    PreparedStatement pstm = con.prepareStatement(sb.toString());
    ResultSet rs = pstm.executeQuery();

%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
    </head>
    <body>
        <table>
            <tr>
                <td>번호</td>
                <td>아이디</td>
                <td>비밀번호</td>
                <td>나이</td>
                <td>이메일</td>
                <td>취미1</td>
                <td>취미2</td>
                <td>취미3</td>
                <td>가입일</td>
            </tr>
            <% while (rs.next()) {
                    String num = rs.getString("mymemberno");
                    String id = rs.getString("id");
                    String pwd = rs.getString("pwd");
                    String name = rs.getString("name");
                    String age = rs.getString("age");
                    String email = rs.getString("email");
                    String hb1 = rs.getString("hobby1");
                    String hb2 = rs.getString("hobby2");
                    String hb3 = rs.getString("hobby3");
                    String date = rs.getString("mymemberdate");
            %>
            <tr>
                <td><%=num%></td>
                <td><%=id%></td>
                <td><%=pwd%></td>
                <td><%=name%></td>
                <td><%=age%></td>
                <td><%=email%></td>
                <td><%=hb1%></td>
                <td><%=hb2%></td>
                <td><%=hb3%></td>
                <td><%=date%></td>
            </tr>
            <%}%>
        </table>

    </body>
</html>
