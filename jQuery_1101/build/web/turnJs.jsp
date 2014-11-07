<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script src="lib/turn.min.js"></script>
        <script>
            $(document).ready(function(){
                $("#mybook").css({width:'600px', height:'300px'});
                $("#mybook .turn-page").css({width:'300px', height:'300px', background:'red'});
                $("#mybook").turn();
            });
        </script>

    </head>
    <body>
        <div id="mybook">            
<%
                for(int i=0; i<10; i++){                
%>
            <div class="turn-page">
                <h1><%=i%> 번쪽</h1>
                <p><!--<img src="img/Jellyfish.jpg" width="100"/>-->
                    할리우드 소식은 할리우드의 소문, 그리고 각종 언론을 통한 정보를 취합하여 한발 빠른 영화 정보를 즐기는 공간입니다. 거대자본이 투입되고, 수많은 사람들이 관련되어 변화무쌍한 영화계이기에 간혹 정정이 필요한 부분도 있지만, 가급적 업데이트된 다음 소식을 전할 때 정정 내용을 공유 드리고 있으니 양해 부탁 드리겠습니다. 아울러 할리우드 소식은 순수하게 할리우드 영화 정보를 즐기는 공간입니다. 특정 영화에 대한 홍보와 비난은 포함하지 않습니다. 그럼, 이번 주 할리우드 소식 시작하겠습니다.
                </p>
            </div>
<%
                }
%>            
            <div>
                <h1>2번쪽</h1>
                <p>
                    할리우드 소식은 할리우드의 소문, 그리고 각종 언론을 통한 정보를 취합하여 한발 빠른 영화 정보를 즐기는 공간입니다. 거대자본이 투입되고, 수많은 사람들이 관련되어 변화무쌍한 영화계이기에 간혹 정정이 필요한 부분도 있지만, 가급적 업데이트된 다음 소식을 전할 때 정정 내용을 공유 드리고 있으니 양해 부탁 드리겠습니다. 아울러 할리우드 소식은 순수하게 할리우드 영화 정보를 즐기는 공간입니다. 특정 영화에 대한 홍보와 비난은 포함하지 않습니다. 그럼, 이번 주 할리우드 소식 시작하겠습니다.
                </p>
            </div>
            <div>
                <h1>3번쪽</h1>
                <p>
                    할리우드 소식은 할리우드의 소문, 그리고 각종 언론을 통한 정보를 취합하여 한발 빠른 영화 정보를 즐기는 공간입니다. 거대자본이 투입되고, 수많은 사람들이 관련되어 변화무쌍한 영화계이기에 간혹 정정이 필요한 부분도 있지만, 가급적 업데이트된 다음 소식을 전할 때 정정 내용을 공유 드리고 있으니 양해 부탁 드리겠습니다. 아울러 할리우드 소식은 순수하게 할리우드 영화 정보를 즐기는 공간입니다. 특정 영화에 대한 홍보와 비난은 포함하지 않습니다. 그럼, 이번 주 할리우드 소식 시작하겠습니다.
                </p>
            </div>
             
        </div>
    </body>
</html>
