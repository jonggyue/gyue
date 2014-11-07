<%-- 
    Document   : Basic_Data
    Created on : 2014. 10. 30, 오후 12:20:11
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("euc-kr");
    String name = request.getParameter("name");
    String orderNum = request.getParameter("orderNum");
    String status = "";

    if (name.equals("김길동") && orderNum.equals("A001")) {
        status = "주문하신 상품은 지금 발송 중입니다.";
    } else if (name.equals("김우리") && orderNum.equals("A002")) {
        status = "주문하신 상품에 대한 사은품이 발송 되었습니다.";
    } else {
        status = "이미 발송된 상품입니다.";
    }
%>
<%=status%>
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
