var xhr = null;
function getRequest() {
    if (window.ActiveXObject)
        xhr = new ActiveXObject("Microsoft.XMLHTTP");
    else
        xhr = new XMLHttpRequest();
}
function sendRequest(url, param, callback, method, async) {
    getRequest();
    method = (method.toLowerCase() == "get") ? "GET" : "POST";
    param = (param == null || param == "") ? null : param;
    if (method == "GET" && param != null) {
        url = url + "?" + param;
    }
    xhr.onreadystatechange = callback; 
    xhr.open(method, url, async);
    xhr.setRequestHeader("Content-Type", "application/x-www-form-urlencoded");

    xhr.send((method == "POST") ? param : null);

}