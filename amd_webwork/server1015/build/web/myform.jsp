<%-- 
    Document   : myform
    Created on : 2014. 10. 15, ���� 2:00:02
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    //myform.html���� ���� ���� ��ư�� ������
    // action���� ������ ���� ��������
    // name="id" ������ �Ķ�����̸����� ���� ��Ƽ� ������ �Ǿ�´�.
    // ���⼭�� �Ķ���͸� �޴� �۾�
    // �װ��� �����ϴ� �۾�(��� ����, ������� �����Ͻ� ����ó��)
    //1. �Ķ��Ƽ �ޱ�
    String idv = request.getParameter("id");
    String namev = request.getParameter("name");
    String passv = request.getParameter("pwd");
    String etcv = request.getParameter("etc");
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><%=idv%></h1>
        <h1><%=namev%></h1>
        <h1><%=passv%></h1>
        <h1><%=etcv%></h1>
    </body>
</html>
