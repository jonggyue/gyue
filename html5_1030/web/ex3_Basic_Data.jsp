<%-- 
    Document   : ex3_Basic_Data
    Created on : 2014. 10. 30, ���� 11:47:43
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
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
%><%=status%>