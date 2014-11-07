// js/httpRequest.js에 붙여 넣고
var xhr = null;
function getRequest() {
    if (window.ActiveXObject)
        xhr = new ActiveXObject("Microsoft.XMLHTTP");
    else
        xhr = new XMLHttpRequest();
}
function sendRequest(url, param, callback, method, async) {
    getRequest();
    // ? 사망연산자 : true : false
    method = (method.toLowerCase() == "get") ? "GET" : "POST";
    param = (param == null || param == "") ? null : param;
    if (method == "GET" && param != null) {
        url = url + "?" + param;
    }
    xhr.onreadystatechange = callback; // 서버의 응답이 도착하는 함수지정
    xhr.open(method, url, async); // 요청정보 지정
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    // 서버 요청 보내기
 
    xhr.send((method == "POST") ? param : null);
 
}

