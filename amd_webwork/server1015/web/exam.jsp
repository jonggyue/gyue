<%-- 
    Document   : exam
    Created on : 2014. 10. 15, 오후 1:41:25
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
    </head>
    <body>
        <%
            String msg = "";
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    msg = "짝수";
                } else {
                    msg = "홀수";
                }
        %>


        <h1><%=i%>/<%=msg%></h1>
        <%}%>
    </body>
</html>
