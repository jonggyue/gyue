<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="ex1_top.jsp"%>
<article>


	<p>현재 IT에서 가장 각광받는 java Technology의 기초부터 고급기술까지 학습합니다 전자정부
		프레임워크(java opensource framework)를 이용한 Enterprise Solution 설계 및 구현과
		안드로이드 및 하이브리드앱을 이용한 모바일 애플리케이션 구현을 학습하고 실무 프로젝트를 통해 현업에서 필요로 하는 자바
		엔지니어 양성을 목표로 합니다.</p>
	<section>
		<header style="margin: auto; width: 100%;">
			<h2>BbsForm page</h2>
		</header>
		<p>
		<form method="post" action="bbsadd.jsp">
			<input type="hidden" name="reip" value="<%=request.getRemoteAddr()%>">
			<table style="margin: auto; width: 300px">
				<tr>
					<td>subject</td>
					<td><input type="text" name="sub"> <!-- Ajax & Jquery로 구현하기 -->
					</td>
				</tr>
				<tr>
					<td>Writer</td>
					<td><input type="text" name="writer"></td>
				</tr>
				<tr>
					<td>PWD</td>
					<td><input type="password" name="pwd"></td>
				</tr>

				<tr>
					<td>Content</td>
					<td>
						<textarea rows="10" cols="30" name="cont">
						</textarea>
					</td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right;">
					<input type="submit" value="Write"
						style="width: 100px; height: 30px;">
						<input type="button" value="List"
						style="width: 100px; height: 30px;"
						onclick="location='bbslist.jsp'"
						>
				</td>
				</tr>
			</table>
		</form>
		</p>
	</section>
</article>
<aside>
	<header>
		<h1>Siderbar Heading</h1>
	</header>
	<p>문서의 주 내용이 아닌 관련성이 낮은 내용들은 aside로 표시할 수 있다. 본문과 직접적으로 상관이 없는 관련
		사이트 링크나 안내글, nav 요소의 그룹 등이 aside 요소로 기술 될 수 있다. 보통 블로그에서 좌우측 사이드바를
		의미하는 것으로서 사이드바의 특성으로 볼때 필수적이지 않아서 표시를 해도 되고 안 해도 되는 내용들 또는 광고물같은 내용들이
		자리할 수 있다.</p>

</aside>
<%@ include file="ex1_bottom.jsp"%>