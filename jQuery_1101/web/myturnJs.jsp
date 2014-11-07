<%-- 
    Document   : myturnJs
    Created on : 2014. 11. 1, 오후 2:18:57
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
                <h1><%=i+1%> 번째 페이지</h1>
                <p class="turn-page">
                    제니스에스티는 6월 3일 코트라(KOTRA)와 미래창조과학부 주관으로 한국의 유망 ICT기업을 일본에 소개하는 대형 수출 로드쇼인 스마트 코리아 포럼 인 재팬에 참가하였습니다.
                </p>
            </div>
        <% } %>
        </div>
    </body>
</html>
