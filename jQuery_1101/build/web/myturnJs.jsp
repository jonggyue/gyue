<%-- 
    Document   : myturnJs
    Created on : 2014. 11. 1, ���� 2:18:57
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
         <script src="lib/turn.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                   $('#mybook').css({width:'600px',height:'300px'});
                   ('#mybook, turn-page').css({width:'300px',height:'300px',background:'pink'});
                   $('#mybook').turn();
            });
        </script>
    </head>
    <body>
        <div id="mybook">
            <%for(int i=0; i<10; i++) {%>
            <div>
                <h1><%=i+1%> ��° ������</h1>
                <p class="turn-page">
                    ���Ͻ�����Ƽ�� 6�� 3�� ��Ʈ��(KOTRA)�� �̷�â�����к� �ְ����� �ѱ��� ���� ICT����� �Ϻ��� �Ұ��ϴ� ���� ���� �ε���� ����Ʈ �ڸ��� ���� �� ���ҿ� �����Ͽ����ϴ�.
                </p>
            </div>
        <% } %>
        </div>
    </body>
</html>
