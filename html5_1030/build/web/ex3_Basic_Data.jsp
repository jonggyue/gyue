<%-- 
    Document   : ex3_Basic_Data
    Created on : 2014. 10. 30, 오전 11:47:43
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
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
%><%=status%>