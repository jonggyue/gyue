<%-- 
    Document   : myForm
    Created on : 2014. 11. 1, ���� 10:15:36
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <style>
            .on{b}
        </style>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                  $("").submit(function(){
                      if($('input[name=pwd2').val() == ''){
                          alert('��й�ȣ�� �Է��ϼ���');
                          $('input[name=pwd2]').focus().addClass('on');
                          return false;
                      }
                      if($('input[name=pwd').val() == $('input[name=pwd2').val()){
                          alert('��й�ȣ�� ���� �ٸ��׿�!');
                          $('input[name=pwd2]').focus().addClass('on');
                          return false;
                      }
                      if($('input[type=checkbox').is(':checked') == ''){
                          alert('üũ�ڽ��� �ϳ� �̻��� üũ �Ǿ�� �մϴ�.');
                          return false;
                      }
                  });   
                  $('#allChk').click(function(){
                      var chAll = $('input[type=checkbox]');
                      var chk = $chAll.is)(':checked');
                      if(chk){
                          $chAll.attr('checked',false);
                          $(this).val('��ü����');
                      }else {
                          $chAll.attr('checked', true);
                          $(this).val('��ü����');
                      }
                  });
            });
        </script>
    </head>
    <body>
        <h1>Hello World! 1</h1>
        <form method="post" action="addNem.jsp">
            <table>
                <tr>
                    <td>���̵�</td>
                    <td>
                        <input type="text" name="id" id="id">
                        <input type="button" value="�ߺ�Ȯ��">
                    </td>
                </tr>
                <tr>
                    <td>��й�ȣ</td>
                    <td>
                        <input type="password" name="pwd" id="pwd">
                    </td>
                </tr>
                <tr>
                    <td>��й�ȣ Ȯ��</td>
                    <td>
                        <input type="password" name="pwd2" id="pwd2">
                    </td>
                </tr>
                <tr>
                    <td>�̸�</td>
                    <td>
                        <input type="text" name="name" id="name">
                    </td>
                </tr>
                <tr>
                    <td>���</td>
                    <td>
                        <input type="button" value="��ü����" id="allChk">
                    </td>
                    <td>
                        <input type="checkbox" name="hb" class="hb" value="�丮">�丮
                        <hr>
                        <input type="checkbox" name="hb" class="hb" value="�뷡">�뷡
                        <hr>
                        <input type="checkbox" name="hb" class="hb" value="����">����
                        <hr>
                    </td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="����">
                    </td>
                </tr>
                 
            </table>
        </form>
    </body>
</html>
