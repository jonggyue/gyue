<%-- 
    Document   : myform
    Created on : 2014. 10. 31, ���� 5:16:38
    Author     : 1
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <style>
            .on{background: orange; color: white}
        </style>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('form').submit(function() {
                    //��ȿ�� �˻� - �ϳ���(if)�ɸ���
                    //form�� action=''���� �����͸� ���� ���ϰ� �Ѵ�
                    if ($('input[name=id]').val() == '') {
                        alert('���̵� �Է��ϼ���!');
                        $('input[name=id]').focus().addClass('on');
                        return false;
                    }
                    if ($('input[name=pwd]').val() == '') {
                        alert('��й�ȣ�� �Է��ϼ���!');
                        $('input[name=pwd]').focus().addClass('on');
                        return false;
                    }
                    if ($('input[name=pwd2]').val() == '') {
                        alert('��й�ȣ�� �Է��ϼ���!');
                        $('input[name=pwd2]').focus().addClass('on');
                        return false;
                    }
                    if ($('input[name=pwd]').val() != $('input[name=pwd2]').val()) {
                        alert('��й�ȣ�� ��ġ�����ʽ��ϴ�.!');
                        $('input[name=pwd2]').focus().addClass('on');
                        return false;
                    }
                    if (!$('input[type=checkbox]').is(':checked')) {
                        alert('üũ�ڽ��� �ϳ� �̻��� üũ �Ǿ�� �մϴ�.');
                        return false;
                    }


                });
                $('#idcheck').click(function() {
                    $.post('eaxm_idcheck.jsp', $('#id').serialize(),
                            function(data) {
                                alert(data);
                            });
                });
                $('#allChk').click(function() {
                    var $chAll = $('input[type=checkbox]');
                    var chk = $chAll.is(':checked');
                    if (chk) {
                        $chAll.attr('checked', false);
                        $(this).val('��ü����');
                    } else {
                        $chAll.attr('checked', true);
                        $(this).val('��ü����');
                    }
                });
            });
        </script>
    </head>
    <body>
        <div>
            <h1>ȸ������</h1>
            <form method="post" action="eaxm_join.jsp">
                <table>
                    <tr>
                        <td>���̵�</td>
                        <td><input type="text" name="id" id="id">
                            <input type="button" value="�ߺ�Ȯ��" id="idcheck">
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
                        <td>����</td>
                        <td>
                            <input type="text" name="age" id="age">
                        </td>
                    </tr>
                    <tr>
                        <td>�̸���</td>
                        <td>
                            <input type="text" name="email" id="email">
                        </td>
                    </tr>
                    <tr>
                        <td>��� <input type="button" value="��ü����" id="allChk"></td>
                        <td>

                            <input type="checkbox" name="hb1" class="hb" value="�丮">�丮
                            <hr>
                            <input type="checkbox" name="hb2" class="hb" value="�뷡">�뷡
                            <hr>
                            <input type="checkbox" name="hb3" class="hb" value="����">����
                            <hr>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="�ߺ�Ȯ��">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
