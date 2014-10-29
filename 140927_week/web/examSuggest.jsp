<%-- 
    Document   : examSuggest
    Created on : 2014. 9. 24, 오후 4:01:17
    Author     : kosta
--%>
 
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<!DOCTYPE>
<html>
    <head>
        <title></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <script src="js/httpRequest.js"></script>
<!--        <script src="js/json2.js"></script>-->
        <script>
            var lastKey = '';
            var check = false;
            var loopKey = false;
 
            function startSuggest() {
                if(check==false) {
                    setTimeout("sendKeyword();", 500);
                    loopKey = true;
                }
                check = true;
            }
 
            function sendKeyword() {
                if(loopKey == false) {return;}
                var key = f.word.value;
 
                if(key =='' || key == ' ') {
                    lastKey = '';
                    document.getElementById("view").style.display='none';
                }else if(key != lastKey) {
                    lastKey = key;
                    var param = "key=" + encodeURIComponent(key);
                    sendRequest("suggest.jsp", param, res, "post");
                }
                
                setTimeout("sendKeyword();", 500);
            }
 
            var jsonObj = null;
 
            function res() {
 
                if(xhr.readyState==4) {
                    if(xhr.status==200) {
                        var response = xhr.responseText;
                        jsonObj = JSON.parse(response);
 
                        viewTable();
 
                    }else {
                        document.getElementById("view").style.display='none';
                    }
                }
 
            }
 
            function viewTable() {
                var vD = document.getElementById("view");
                var htmlTxt = "<table width='200' border='0' cellspacing='0'>";
 
                for(var i = 0 ; i < jsonObj.length; i++) {
 
                    htmlTxt += "<tr><td style='cursor:pointer;' onmouseover='this.style.background=\"silver\"' onmouseout='this.style.background=\"white\"' onclick='select("+i+")'>" + jsonObj[i] + "</td></tr>";
                }
                htmlTxt += "</table>";
                vD.innerHTML = htmlTxt;
                vD.style.display = "block";
            }
 
            function select(index) {
                f.word.value = jsonObj[index];
                document.getElementById("view").style.display='none';
                check = false;
                loopKey = false;
            }
 
        </script>
    </head>
    <body>
        <form name="f">
        <input type="text" style="width:200px;" name="word" onkeydown="startSuggest();"/>
        <input type="submit" value="검색"/>
        <div id="view" style="width:200px;border:1px solid gray;border-top:0px;margin-top:-1px;display:none;font-family:NanumGothic;font-size:10px"/>
        </form>
    </body>
</html>
 
 
========================================
js/httpRequest.js 
 
var xhr = null;
 
function getXMLHttpRequest() {
    if(window.ActiveXObject) {
        xhr = new ActiveXObject("Microsoft.XMLHTTP");
    }else {
        xhr = new XMLHttpRequest();
    }
}
 
function sendRequest(url, param, callback, method) {
    getXMLHttpRequest();
 
    method = (method.toLowerCase() == 'get') ? 'GET' : 'POST';
 
    param = (param == null || param == '') ? null : param;
 
    if(method == 'GET' && param != null) {
        url = url + '?' + param;
    }
 
    xhr.onreadystatechange = callback;
 
    xhr.open(method, url, true);
 
    xhr.setRequestHeader("Content-Type","application/x-www-form-urlencoded");
 
    xhr.send(method == 'POST' ? param : null);
}
