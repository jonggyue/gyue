<%@page import="dao.BbsDao"%>
<%@page import="vo.BbsVO"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<%@ include file="ex1_top.jsp"%>
<article>


	<p>���� IT���� ���� �����޴� java Technology�� ���ʺ��� ���ޱ������ �н��մϴ� ��������
		�����ӿ�ũ(java opensource framework)�� �̿��� Enterprise Solution ���� �� ������
		�ȵ���̵� �� ���̺긮����� �̿��� ����� ���ø����̼� ������ �н��ϰ� �ǹ� ������Ʈ�� ���� �������� �ʿ�� �ϴ� �ڹ�
		�����Ͼ� �缺�� ��ǥ�� �մϴ�.</p>
	<section>
		<header style="margin: auto; width: 100%;">
			<h2>Bbsupform page</h2>
		</header>
		<%
			int num = Integer.parseInt(request.getParameter("num"));
			BbsVO vo = BbsDao.getDao().getDetail(num);
		%>
		<p>
		<form method="post" action="bbsupdate.jsp">
			<input type="hidden" name="num" value="<%=num%>">
			<input type="hidden" name="hit" value="<%=vo.getHit()%>">
			<input type="hidden" name="redate" value="<%=vo.getRedate()%>">
			<input type="hidden" name="reip" value="<%=vo.getReip()%>">
			<table style="margin: auto; width: 300px">
				<tr>
					<td>subject</td>
					<td><input type="text" name="sub" value="<%=vo.getSub() %>"><!-- Ajax & Jquery�� �����ϱ� -->
					</td>
				</tr>
				<tr>
					<td>Writer</td>
					<td><input type="text" name="writer" value="<%=vo.getWriter() %>"></td>
				</tr>
				<tr>
					<td>PWD</td>
					<td><input type="password" name="pwd" value="<%=vo.getPwd()%>"></td>
				</tr>

				<tr>
					<td>Content</td>
					<td>
						<textarea rows="10" cols="30" name="cont">
						<%=vo.getCont()%>
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
	<p>������ �� ������ �ƴ� ���ü��� ���� ������� aside�� ǥ���� �� �ִ�. ������ ���������� ����� ���� ����
		����Ʈ ��ũ�� �ȳ���, nav ����� �׷� ���� aside ��ҷ� ��� �� �� �ִ�. ���� ���α׿��� �¿��� ���̵�ٸ�
		�ǹ��ϴ� �����μ� ���̵���� Ư������ ���� �ʼ������� �ʾƼ� ǥ�ø� �ص� �ǰ� �� �ص� �Ǵ� ����� �Ǵ� ���������� �������
		�ڸ��� �� �ִ�.</p>

</aside>
<%@ include file="ex1_bottom.jsp"%>