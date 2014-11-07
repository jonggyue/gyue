<%-- 
    Document   : ex5_jsp
    Created on : 2014. 10. 30, 오후 5:09:38
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
        <script type="text/javascript">
            $(document).ready(function() {
                // keyup: 키에서 손을 땠을때 발생하는 이벤트
                $('#name').keyup(function(){
                    // aJax를 사용하여 비동기식으로 서버의 데이터조회
                   
                    $.ajax({
                       url: "ex5_postData.jsp",
                       data: {'mid':$(this).val()},
                       // 전달받은 값을 callback하여 div에 실시간 출력
                       success:function(data){
                           $('#msg').html(data);
                       },
                       error:function(e){
                           console.log(e.responseText);
                       }
                    });
                });
                
            });
        </script>
    </head>
    <body>
        <input type="text" id="name">
        <div id="msg"></div>
    </body>
</html>
