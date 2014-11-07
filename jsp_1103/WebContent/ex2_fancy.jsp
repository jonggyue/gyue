<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<!-- 2014. 11. 3. -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
<title>JSP Page</title>
<link rel="stylesheet" href="source/jquery.fancybox.css">
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<script src="source/jquery.fancybox.js"></script>
<script>
	$(document).ready(function() {
		$('.fancybox').fancybox();
	});
</script>
</head>
<body>
	<h3>Simple image gallery</h3>
	<p>
		<a class="fancybox" href="img/1_b.jpg" data-fancybox-group="gallery"
			title="음하하?"> <img src="img/1_s.jpg" alt="" />
		</a> <a class="fancybox" href="img/2_b.jpg" data-fancybox-group="gallery"
			title="Etiam quis mi eu elit temp"> <img src="img/2_s.jpg" alt="" /></a>
		<a class="fancybox" href="img/2_b.jpg" data-fancybox-group="gallery"
			title="Etiam quis mi eu elit temp"> <img src="img/2_s.jpg" alt="" /></a>
		<a class="fancybox" href="img/2_b.jpg" data-fancybox-group="gallery"
			title="Etiam quis mi eu elit temp"> <img src="img/2_s.jpg" alt="" /></a>
		<a class="fancybox" href="img/2_b.jpg" data-fancybox-group="gallery"
			title="Etiam quis mi eu elit temp"> <img src="img/2_s.jpg" alt="" /></a>
		<a class="fancybox" href="img/2_b.jpg" data-fancybox-group="gallery"
			title="Etiam quis mi eu elit temp"> <img src="img/2_s.jpg" alt="" /></a>

		<a class="fancybox" href="img/3_b.jpg" data-fancybox-group="gallery"
			title="Cras neque mi, semper leon"><img src="img/3_s.jpg" alt="" /></a>

		<a class="fancybox" href="img/4_b.jpg" data-fancybox-group="gallery"
			title="Sed vel sapien vel sem uno"><img src="img/4_s.jpg" alt="" /></a>
	</p>
</body>
</html>
