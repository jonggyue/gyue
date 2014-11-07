<%-- 
    Document   : ex5_post
    Created on : 2014. 10. 30, ���� 5:37:18
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
                $('#wrap').css({width: '300px', margin:'auto'});
                $('#res').css({width: '300px', background:'pink', marginTop:'30px'});
                // id�Է��ʵ忡 key�� �������� �� Ajax�� ���̰� �ߺ�����
                $('#id').keyup(function(){
                    // serialize() : �Է¾���� ������ parameter��������
                    // ��ȯ -> id=�� ����
                    console.log("serialize : "+$('#id').serialize());
                    $.post('ex5_postData.jsp',$('#id').serialize(),
                    function(data){
                       $('#res').html(data); 
                    });
                });
            });
        </script>
    </head>
    <body>
        <div id="wrap">
            <h1>ȸ������ ��</h1>
            <form method="post" action="" id="f">
                ID: <input type="text" name="mid" id="id">
                <div id="res"></div>
            </form>
        </div>
    </body>
</html>
