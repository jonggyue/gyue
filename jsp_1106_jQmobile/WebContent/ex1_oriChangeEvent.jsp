<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<!-- 2014. 11. 3. -->
<!DOCTYPE html>
<html>
<head>
<meta charset="EUC-KR">
<title>Insert title here</title>
<style>
	body{ font-size: 130pt}
</style>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script>
	$(document).ready(function(){
		$(window).bind('orientationchange',function(){
			// ��Ȳ�� ���� �ڵ鸵 
			// (����) Ajax�� ����ؼ� ������� ȭ�� ���� ������ ������ �׿� �µ���
			// �ý����� �����ؼ� ���� �ݹ����ټ� �ִ�.
			if(window.orientation == 0){
				$('body').css('background','pink').html('<h1>Hi!!!</h1>');
			}else{
				$('body').css('background','blue').html('<h1>good!</h1>');
			}
			
		});
	});
</script>
</head>
<body>
 
</body>
</html>