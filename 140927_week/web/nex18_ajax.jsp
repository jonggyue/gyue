<%-- 
    Document   : nex18_ajax
    Created on : 2014. 9. 27, ���� 2:18:42
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>

<%
    String header = request.getHeader("XCode");
    System.out.println("Header: " + header);
    String param1 = request.getParameter("name");
    String param2 = request.getParameter("age");
    %>
    
    <%=param1%>�� ���̴� <%=param2%>�Դϴ�.