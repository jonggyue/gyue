<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!--2014. 11. 3.-->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<style>
progress {
	display: none;
}
</style>
<script>
	$(document).ready(
			function() {
				var proval = $('progress').val;
				$('button').click(function() {
					fileUpload();
				});
				
				function fileUpload() {
					// upload 버튼을 클릭하면 파일을 업로드 한다
					var xhr = new XMLHttpRequest();
					// 업로드 시작 -> xhr.download.onloadstart로 하면 download
					xhr.upload.onloadstart = function() {
						proval = 0;
						// progress의 스타일을 none에서 보이도록 설정!
						$('progress').css('display', 'inline');
					};
					// 업로드 도중에 계속 발생 -> xhr.download.onprogress 하면 download
					xhr.upload.onprogress = function(e) {
						// e.total : 전체 업로드 크기, e.loaded : 현재 업로드된 크기
						proval = e.loaded / e.total;
					};
					// 업로드 종료 시 발생 -> xhr.download.onload 하면 download
					xhr.upload.onload = function() {
						$('progress').css('display', 'none');
					};
					xhr.onreadystatechange = function() {
						if (xhr.readyState == 4 && xhr.status == 200) {
							$('div').html(xhr.responseText);
						}
						;
					};
					xhr.open("POST", "uploadService.jsp", true);
					// prop() : html이외의 속성값을 얻기위한 메서드
					// 전송시 이름값을 헤더로 먼저보내고, 파일 전송
					xhr.setRequestHeader("X-File-Name", encodeURIComponent($(
							'input').prop('files')[0].name));
					xhr.send($('input').prop('files')[0]);
				}
				;

			});
</script>
</head>
<body>
	<h1>XMLHttpRequest Level2를 이용한 파일 업로드</h1>
	<input type="file">
	<button>upload</button>
	<progress>0%</progress>
	<div></div>
</body>