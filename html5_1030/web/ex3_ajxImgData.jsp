<%-- 
    Document   : ex3_ajxImgData
    Created on : 2014. 10. 30, 오후 2:12:01
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("euc-kr");
    String gname = request.getParameter("gname");
    gname = gname.trim();
    System.out.println("GName : " + gname);
    //"유라","헤리","소진","미라"
    String imgName = "";
    if (gname.equals("유라")) {
        imgName = "girlImg/ura.jpg";
    } else if (gname.equals("헤리")) {
        imgName = "girlImg/heri.jpg";
    } else if (gname.equals("소진")) {
        imgName = "girlImg/sojin.jpg";
    } else if (gname.equals("미라")) {
        imgName = "girlImg/mina.jpg";
        //"보람","지연","효민","은정"","큐리,"소연"
    } else if (gname.equals("보람")) {
        imgName = "taraImg/boram.jpg";
    } else if (gname.equals("지연")) {
        imgName = "taraImg/jiyun.jpg";
    } else if (gname.equals("효민")) {
        imgName = "taraImg/hymin.jpg";
    } else if (gname.equals("큐리")) {
        imgName = "taraImg/jiyun.jpg";
    } else if (gname.equals("소연")) {
        imgName = "taraImg/soyun.jpg";
    }
%><%=imgName%>

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
