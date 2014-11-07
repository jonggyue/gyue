<%-- 
    Document   : ex4_Data
    Created on : 2014. 10. 30, 오후 2:36:14
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    request.setCharacterEncoding("euc-kr");
    String name = request.getParameter("name");
%>
Hello~! <%=name%> 님 반갑습니다.^^;
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {

            });
        </script>
    </head>
    <body>

    </body>
</html>
