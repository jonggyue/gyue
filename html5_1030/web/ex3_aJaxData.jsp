<%-- 
    Document   : ex3_aJaxData
    Created on : 2014. 10. 30, ���� 2:06:45
    Author     : 1
--%>

<%@page import="ex1.Ex3_Girl"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
      String code = request.getParameter("groupName");
      // ��ü���� 
      Ex3_Girl girl = new Ex3_Girl();
      // �޼��� ȣ���� �ش� code�� ���� �����͸� ���ڿ��� ��ȯ ����
      String[] gg = girl.getGirlGroup(code);
      System.out.println(gg.length);
%><option>����</option>
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
