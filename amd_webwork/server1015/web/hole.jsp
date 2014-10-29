<%-- 
    Document   : hole
    Created on : 2014. 10. 15, 오후 12:15:01
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%!
    public String hole(int i) {
        String result;

        if (i % 2 == 0) {
            result = i + "짝수";
        } else {
            result = i + "홀수";
        }

        return result;
    }


%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>

    </head>
    <body>
        <%

            String result;
            for (int i = 1; i <= 10; i++) {
                if (i % 2 == 0) {
                    result = i + " 짝수";
                } else {
                    result = i + " 홀수";
                }
                %>
                <h1><%=result%></h1>
            }
        %>
        



    </body>
</html>
