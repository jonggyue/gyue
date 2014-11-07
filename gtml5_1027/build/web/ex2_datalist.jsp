<%-- 
    Document   : ex2_datalist
    Created on : 2014. 10. 27, 오전 10:35:58
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

            });
        </script>
    </head>

    
    <form>
        <fieldset>
            <legend>datalist연습</legend>
            <label for="ss">Homepage:</label>
            <input type="url" id="ss"
                   list="s_data" required>
            <datalist id ="s_data">
                <!-- 데이터 루프영역-->
                <option value="http://www.shinhan.com"
                        label="신한"/>
                <option value="http://www.naver.com"
                        label="네이버"/>
                <option value="http://www.kosta.or.kr"
                        label="kosta"/>
            </datalist>
            <p><button type="submit">SEND</button></p>
        </fieldset>
            
        
    </form>
    
    
    
</html>
