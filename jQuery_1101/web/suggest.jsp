<%-- 
    Document   : suggest
    Created on : 2014. 9. 24, ¿ÀÈÄ 3:42:29
    Author     : kosta
--%>
 
<%@page import="suggest.Suggest"%>
<%@page import="java.net.URLDecoder"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>

<%
    request.setCharacterEncoding("UTF-8");
    String key = request.getParameter("key");
    key = URLDecoder.decode(key,"utf-8");
    Suggest suggest = Suggest.getInstance();
    String[] suggests = suggest.getSuggest(key);
    if(suggests !=null) {
%>
[
<% for(int i = 0 ; i < suggests.length ; i++) { %>
"<%=suggests[i]%>"
<% if(!(i==suggests.length-1)) { out.print(",");} }}%>
]