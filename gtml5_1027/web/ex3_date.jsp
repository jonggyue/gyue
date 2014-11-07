<%-- 
    Document   : ex3_date
    Created on : 2014. 10. 27, 오전 10:44:16
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
    <body>
        <form>
            <fieldset>
                <legend>Data연습</legend>
                <label for="s1">Date:</label>
                <input type="date" id="s1"/><br/>
                <label for="s2">Datetime:</label>
                <input type="datetime" id="s2"/><br/>
                <label for="s3">Time:</label>
                <input type="time" id="s3"/><br/>
                <label for="s4">Week:</label>
                <input type="week" id="s4"/><br/>
                
            </fieldset>
        </form>
    </body>
</html>
