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
                  //������Ʈ���� ����� ��ü ����
                  title:{
                      text:'chaaaaaa'
                  },
                   chart:{
                       //��Ʈ�� ������ �����̳�(div)
                      renderTo:'container',
                      type:'bar'//'spling',
                  },
                  //��Ʈ�� �����͸� ����,ǥ��(json ���·� ��� [{}{}] )
                  series:[{}]
                };
                //��Ʈ�� �׸� �ܺε����͸� �޾ƿ��� �κ�(url,data,success)
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
