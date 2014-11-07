<%-- 
    Document   : suggestload.jsp
    Created on : 2014. 11. 1, 오전 11:40:29
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
        <script src="js/httpRequest.js"></script>
        <script>
            $(document).ready(function(){
                var lastKey="";
                var check=false;
                var loopKey=false;
                function startSuggest(){
                    if(check==false){
                        setTimeout("sendKeyword();",500);
                        loopKey=true;
                    }
                    check=true;
                }
                function sendKeyword(){
                    if(loopKey==false){
                        return ;
                    }
                    var key=f.word.value;
                    if(key=="" || key=" "){
                        lastKey="";
                        document.getElementById("view").style.display="none";
                    }else if(key !=lastKey){
                        lastKey=keys;
                        var param = "key=" + encodeURIComponent(key);
                        sendRequest("suggest.jsp", param, res, "post");
                    }
                    setTimeout("sendKeyworkd();", 500);
                }
                var jsonObj =null;
                function res(){
                    if(xhr.readyState==4){
                        if(xhr.status==200){
                            var response = xhr.responseText;
                            jsonObj=JSON.parse(response);
                            viewTable();                            
                        }else{
                            document.getElementById("view").style.display="none";
                        }
                    }
                }
                function viewTable(){
                    var vD=document.getElementById("view");
                    var htmlTxt="<table width='200' border='0' cellspacing='0'>";
                    for(var i=0; i<jsonObj.length; i++){
                        htmlTxt +="<tr><td style='cursor:pointer;' onmouseover='this.style.background=\"silver\"' onmouseout='this.style.background=\"while\"' onclick='select("+i+")'>" + jsonObj[i]+"</td></tr>";
                    }
                    htmlTxt +="</table>";
                    vD.innerHTML = htmlTxt;
                    vD.style.display="block";
                }
                function select(index){
                    f.word.value=jsonObj[index];
                    document.getElementById("view").style.display="none";
                    check=false;
                    loopKey=false;
                }
            });
        </script>

    </head>
    <body>
        <form name="f">
            
        </form>
    </body>
</html>
