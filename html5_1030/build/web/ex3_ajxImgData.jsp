<%-- 
    Document   : ex3_ajxImgData
    Created on : 2014. 10. 30, ���� 2:12:01
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<%
    request.setCharacterEncoding("euc-kr");
    String gname = request.getParameter("gname");
    gname = gname.trim();
    System.out.println("GName : " + gname);
    //"����","�츮","����","�̶�"
    String imgName = "";
    if (gname.equals("����")) {
        imgName = "girlImg/ura.jpg";
    } else if (gname.equals("�츮")) {
        imgName = "girlImg/heri.jpg";
    } else if (gname.equals("����")) {
        imgName = "girlImg/sojin.jpg";
    } else if (gname.equals("�̶�")) {
        imgName = "girlImg/mina.jpg";
        //"����","����","ȿ��","����"","ť��,"�ҿ�"
    } else if (gname.equals("����")) {
        imgName = "taraImg/boram.jpg";
    } else if (gname.equals("����")) {
        imgName = "taraImg/jiyun.jpg";
    } else if (gname.equals("ȿ��")) {
        imgName = "taraImg/hymin.jpg";
    } else if (gname.equals("ť��")) {
        imgName = "taraImg/jiyun.jpg";
    } else if (gname.equals("�ҿ�")) {
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
