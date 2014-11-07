// js/httpRequest.js�� �ٿ� �ְ�
var xhr = null;
function getRequest() {
    if (window.ActiveXObject)
        xhr = new ActiveXObject("Microsoft.XMLHTTP");
    else
        xhr = new XMLHttpRequest();
}
function sendRequest(url, param, callback, method, async) {
    getRequest();
    // ? ��������� : true : false
    method = (method.toLowerCase() == "get") ? "GET" : "POST";
    param = (param == null || param == "") ? null : param;
    if (method == "GET" && param != null) {
        url = url + "?" + param;
    }
    xhr.onreadystatechange = callback; // ������ ������ �����ϴ� �Լ�����
    xhr.open(method, url, async); // ��û���� ����
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");
    // ���� ��û ������
 
    xhr.send((method == "POST") ? param : null);
 
}

