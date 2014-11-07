<%-- 
    Document   : ex5_jsp
    Created on : 2014. 10. 30, ���� 5:09:38
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
                // keyup: Ű���� ���� ������ �߻��ϴ� �̺�Ʈ
                $('#name').keyup(function(){
                    // aJax�� ����Ͽ� �񵿱������ ������ ��������ȸ
                   
                    $.ajax({
                       url: "ex5_postData.jsp",
                       data: {'mid':$(this).val()},
                       // ���޹��� ���� callback�Ͽ� div�� �ǽð� ���
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
