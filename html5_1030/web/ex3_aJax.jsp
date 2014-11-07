<%-- 
    Document   : ex3_aJax
    Created on : 2014. 10. 30, ���� 11:54:07
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
                $('#btn1').click(function(){
                   var n = $('#name').val();
                   var on = $('#orderNum').val();
                   //$ajax(); �޼��带 ����� Ajax���
                   // url : �񵿱������ ���� ������ �ּ�
                   // data : ���� �Ķ����
                   // success : �������� �� callback
                   // error : ����!
                   $.ajax({
                       url:"ex3_Basic_Data.jsp",
                       data:{name:n,orderNum:on},
                       success: function( data, status){
                           console.log("Status:"+status);
                           $('#res').html(data);
                       },
                       error:function (e){
                           console.log("Error:"+e);
                       }
                   });
                });
            });
        </script>
    </head>
    <body>
        <h1>�ֹ�Ȯ��!</h1>
        <input type="text" name="name" id="name"><br/>
        <input type="text" name="orderNum" id="orderNum"><br/>
        <input type="button" value="Ȯ��" id="btn1">
        <div id="res">Status:</div>
    </body>
</html>