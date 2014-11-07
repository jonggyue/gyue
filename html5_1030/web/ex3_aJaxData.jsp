<%-- 
    Document   : ex3_aJaxData
    Created on : 2014. 10. 30, 오후 2:06:45
    Author     : 1
--%>

<%@page import="ex1.Ex3_Girl"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
      String code = request.getParameter("groupName");
      // 객체생성 
      Ex3_Girl girl = new Ex3_Girl();
      // 메서드 호출후 해당 code에 따른 데이터를 문자열로 반환 받음
      String[] gg = girl.getGirlGroup(code);
      System.out.println(gg.length);
%><option>선택</option>
<% for(String e : gg){ %>
    <option><%=e%></option>
<%} %>

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
