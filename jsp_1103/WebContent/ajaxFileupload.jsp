<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- 2014. 11. 3. -->
<!DOCTYPE html>
<html lang="ko">
<head>
<meta charset="EUC-KR">
<title>2014/11/03, 10:46</title>
<style>
progress {
	display: none;
}
</style>

<script>
	var progress = null;
	// 주석예) $(document).ready(function(){}); 변경 
	window.onload = function() {
		progress = document.querySelector("progress");
		// upload 버튼을 클릭하면 파일을 업로드 한다.
		// $(button) - document.querySelector
		document.querySelector("button").onclick = function() {
			fileUpload();
		};
	};

	function fileUpload() {
        var uploadFile = document.querySelector("input");
        var xhr = new XMLHttpRequest();
        // 업로드 시작 -> xhr.download.onloadstart로 하면 download
        xhr.upload.onloadstart = function (e) {
            progress.value = 0;
            // progress의 스타일을 none에서 보이도록 설정!
            progress.style.display = "inline";
        };
        // 업로드 도중에 계속 발생 -> xhr.download.onprogress 하면 download
        xhr.upload.onprogress = function (e) {
            // e.total : 전체 업로드 크기, e.loaded : 현재 업로드된 크기
            progress.value =e.loaded / e.total;
            //console.log(progress.value);
        };
        // 업로드 종료 시 발생 -> xhr.download.onload 하면 download
        xhr.upload.onload = function (e) {
            progress.style.display = "none";
        };

        xhr.onreadystatechange = function () {
            if (xhr.readyState == 4 && xhr.status == 200) {
            	console.log(xhr.responseText);
                document.querySelector("div").innerHTML =xhr.responseText;
            }
        };
        xhr.open("POST", "uploadService.jsp", true);
        xhr.setRequestHeader("X-File-Name",encodeURIComponent(uploadFile.files[0].name));
        xhr.send(uploadFile.files[0]);
    }
</script>
</head>
<body>
	<h1>XMLHttpRequest Level2를 이용한 파일 업로드</h1>
	<input type="file">
	<button>upload</button>
	<progress>0%</progress>
	<br>
	<div></div>
<img src="<%=application.getContextPath()%>/upload/unjung.jpg">
</body>
</html>










