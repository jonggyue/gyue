<%-- 
    Document   : ex1_hello
    Created on : 2014. 10. 15, ���� 12:02:18
    Author     : 1
--%>

<%@page import="java.util.Date"%>
<%@page import="java.text.SimpleDateFormat"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%!
// ����� Ex1_HELLOServlet.class�� ��������̴�.
    public String todate() {
        return new SimpleDateFormat("yyyy-MM-dd").format(new Date());
    }
%>

        <% // service�޼������ local����
            String name = "jonggyue";
            String today = todate();
        %>

        <h1>Name : <%=name%></h1>
        <h2>Today : <%=today%></h2>
