<%-- 
    Document   : myform
    Created on : 2014. 10. 31, 오후 5:16:38
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
                    //유효성 검사 - 하나라도(if)걸리면
                    //form의 action=''으로 데이터를 전송 못하게 한다
                    if ($('input[name=id]').val() == '') {
                        alert('아이디를 입력하세요!');
                        $('input[name=id]').focus().addClass('on');
                        return false;
                    }
                    if ($('input[name=pwd]').val() == '') {
                        alert('비밀번호를 입력하세요!');
                        $('input[name=pwd]').focus().addClass('on');
                        return false;
                    }
                    if ($('input[name=pwd2]').val() == '') {
                        alert('비밀번호를 입력하세요!');
                        $('input[name=pwd2]').focus().addClass('on');
                        return false;
                    }
                    if ($('input[name=pwd]').val() != $('input[name=pwd2]').val()) {
                        alert('비밀번호가 일치하지않습니다.!');
                        $('input[name=pwd2]').focus().addClass('on');
                        return false;
                    }
                    if (!$('input[type=checkbox]').is(':checked')) {
                        alert('체크박스는 하나 이상은 체크 되어야 합니다.');
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
                        $(this).val('전체선택');
                    } else {
                        $chAll.attr('checked', true);
                        $(this).val('전체해제');
                    }
                });
            });
        </script>
    </head>
    <body>
        <div>
            <h1>회원가입</h1>
            <form method="post" action="eaxm_join.jsp">
                <table>
                    <tr>
                        <td>아이디</td>
                        <td><input type="text" name="id" id="id">
                            <input type="button" value="중복확인" id="idcheck">
                        </td>
                    </tr>
                    <tr>
                        <td>비밀번호</td>
                        <td>
                            <input type="password" name="pwd" id="pwd">
                        </td>
                    </tr>
                    <tr>
                        <td>비밀번호 확인</td>
                        <td>
                            <input type="password" name="pwd2" id="pwd2">
                        </td>
                    </tr>
                    <tr>
                        <td>이름</td>
                        <td>
                            <input type="text" name="name" id="name">
                        </td>
                    </tr>
                    <tr>
                        <td>나이</td>
                        <td>
                            <input type="text" name="age" id="age">
                        </td>
                    </tr>
                    <tr>
                        <td>이메일</td>
                        <td>
                            <input type="text" name="email" id="email">
                        </td>
                    </tr>
                    <tr>
                        <td>취미 <input type="button" value="전체선택" id="allChk"></td>
                        <td>

                            <input type="checkbox" name="hb1" class="hb" value="요리">요리
                            <hr>
                            <input type="checkbox" name="hb2" class="hb" value="노래">노래
                            <hr>
                            <input type="checkbox" name="hb3" class="hb" value="여행">여행
                            <hr>
                        </td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="중복확인">
                        </td>
                    </tr>
                </table>
            </form>
        </div>
    </body>
</html>
