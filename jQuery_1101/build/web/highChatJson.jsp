<%-- 
    Document   : highChatJson
    Created on : 2014. 11. 1, 오후 2:56:01
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
               var options = {
                    chat:{
                        renderTo:'container',
                        type:'spline'
                    },
                    title: {
                        
                    }
                    series:[{}]
               };
               $.getJSON('chatData.jsp',function(data){
                   options.series[0].data = data;
                   var chart = new Highcharts.Chart(options);
               });
            });
        </script>
    </head>
    <body>
        <div id="container" style="width:100%; height:400px;"></div>
    </body>
</html>
