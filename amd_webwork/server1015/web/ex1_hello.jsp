<%-- 
    Document   : ex1_hello
    Created on : 2014. 10. 15, 오후 12:02:18
    Author     : 1
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%!
// 여기는 Ex1_HELLOServlet.class의 멤버역역이다.
    public String todate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
%>

        <% // service메서드안의 local영역
            String name = "jonggyue";
            String today = todate();
        %>

        <h1>Name : <%=name%></h1>
        <h2>Today : <%=today%></h2>
