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
					// upload ��ư�� Ŭ���ϸ� ������ ���ε� �Ѵ�
					var xhr = new XMLHttpRequest();
					// ���ε� ���� -> xhr.download.onloadstart�� �ϸ� download
					xhr.upload.onloadstart = function() {
						proval = 0;
						// progress�� ��Ÿ���� none���� ���̵��� ����!
						$('progress').css('display', 'inline');
					};
					// ���ε� ���߿� ��� �߻� -> xhr.download.onprogress �ϸ� download
					xhr.upload.onprogress = function(e) {
						// e.total : ��ü ���ε� ũ��, e.loaded : ���� ���ε�� ũ��
						proval = e.loaded / e.total;
					};
					// ���ε� ���� �� �߻� -> xhr.download.onload �ϸ� download
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
					// prop() : html�̿��� �Ӽ����� ������� �޼���
					// ���۽� �̸����� ����� ����������, ���� ����
					xhr.setRequestHeader("X-File-Name", encodeURIComponent($(
							'input').prop('files')[0].name));
					xhr.send($('input').prop('files')[0]);
				}
				;

			});
</script>
</head>
<body>
	<h1>XMLHttpRequest Level2�� �̿��� ���� ���ε�</h1>
	<input type="file">
	<button>upload</button>
	<progress>0%</progress>
	<div></div>
</body>