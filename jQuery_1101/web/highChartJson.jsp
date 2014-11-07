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
                var options ={
                  //하이차트에서 사용할 객체 정의
                  title:{
                      text:'chaaaaaa'
                  },
                   chart:{
                       //차트를 적용할 컨테이너(div)
                      renderTo:'container',
                      type:'bar'//'spling',
                  },
                  //차트에 데이터를 저장,표현(json 형태로 사용 [{}{}] )
                  series:[{}]
                };
                //차트에 그릴 외부데이터를 받아오는 부분(url,data,success)
                $.getJSON("chartData.jsp",function (data){
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
