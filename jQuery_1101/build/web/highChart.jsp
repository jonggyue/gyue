<%-- 
    Document   : highChart
    Created on : 2014. 11. 1, ���� 2:47:45
    Author     : KOSTA
--%>

<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script src="http://code.highcharts.com/highcharts.js"></script>
        <script>
            $(document).ready(function(){
                 $('#container').highcharts({
                    chart: {
                        type: 'bar'//'line'
                    },
                    title: {
                        text: 'Fruit Consumption'
                    },
                    xAxis: {
                        categories: ['Apples', 'Bananas', 'Oranges']
                    },
                    yAxis: {
                        title: {
                            text: 'Fruit eaten'
                        }
                    },
                    series: [{
                        name: 'Jane',
                        data: [1, 0, 4]
                    }, {
                        name: 'John',
                        data: [5, 7, 3]
                    }]
                });
            });
        </script>

    </head>
    <body>
      <div id="container" style="width:100%; height:400px;"></div>
    </body>
</html>
