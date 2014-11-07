<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
        <title>JSP Page</title>
        <script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
        <script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
        <script>
            var loopKey=false;
            var check=false;
            var lastKey="";
            $(document).ready(function(){
                $("#word").keydown(function (){
                   startSuggest();
                });
            });
            function sendKeyword(){
                if(loopKey==false){return ;}
                var key =$("#word").val();
                if(key=="" || key=" "){
                    lastKey= key;
                    var param=encodeURIComponent(key);
                    var htmlTxt="<table width='200' border='0' cellspacing='0'>";
                    $.getJSON("suggest.jsp",{key:param}).done(function (data){
                        $(data).each(function (i, item){
                            htmlTxt +="<tr><td style='cursor:pointer;'";                            
                            htmlTxt +="onmouseover='this.style.background=\"silver\"' ";
                            htmlTxt +="onmouseout='this.style.background=\"while\"' ";
                            htmlTxt +="onclick='select(" + i + ")'>" + jsonObj[i]+"</td></tr>";
                        });
                        $("#view").html(htmlTxt);
                        htmlTxt +="</table>";
                        $("#view").css("display","block");
                    }).fail(function (){
                       $("view").css("display","none");
                    });
                }
                setTimeout("sendKeyworkd();",500);
            }
            function select(index){
                $("#word").val(index);
                $("#view").css("display","none");
                check=false;
                loopKey=false;
            }
        </script>

    </head>
    <body>
        <input type="text" style="width: 200px;" name="word" id="word"/>
        <input type="submit" value="검색"/>
        <div id="view" style="width: 200px;border: 1px solid gray;border-top: 0px;margin-top: -1px;display: none;font-family: NamumGothic;font-size: 10px;"><</div>
      
    </body>
</html>
