<%-- 
    Document   : Basic_Data
    Created on : 2014. 10. 30, ���� 12:20:11
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("euc-kr");
    String name = request.getParameter("name");
    String orderNum = request.getParameter("orderNum");
    String status = "";

    if (name.equals("��浿") && orderNum.equals("A001")) {
        status = "�ֹ��Ͻ� ��ǰ�� ���� �߼� ���Դϴ�.";
    } else if (name.equals("��츮") && orderNum.equals("A002")) {
        status = "�ֹ��Ͻ� ��ǰ�� ���� ����ǰ�� �߼� �Ǿ����ϴ�.";
    } else {
        status = "�̹� �߼۵� ��ǰ�Դϴ�.";
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
