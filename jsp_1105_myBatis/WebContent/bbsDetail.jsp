<%@page import="java.util.List"%>
<%@page import="vo.BbsVO"%>
<%@page import="dao.BbsDao"%>
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
			<h2>BbsList page</h2>
		</header>
		<%
			int num = Integer.parseInt(request.getParameter("num"));
			BbsVO vo = BbsDao.getDao().getDetail(num);
		%>
		<p>
		<table style="width:100%; border: 1px solid; border-collapse: collapse">
			<tr>
				<td>��ȣ</td>
				<td><%=vo.getNum() %></td>
			</tr>
			<tr>
				<td>����</td>
				<td><%=vo.getSub() %></td>
			</tr>
			<tr>
				<td>�ۼ���</td><td><%=vo.getWriter() %></td>
			</tr>
			<tr>
				<td>����</td>
				<td><%=vo.getCont() %></td>
			</tr>
			<tr>
				<td>�ۼ���¥</td><td><%=vo.getRedate() %></td>
			</tr>
			<tr>
				<td>�ۼ��� ������</td>
				<td><%=vo.getReip() %></td>
			</tr>
			<tr><td colspan="2" style="text-align: right;">
				<input type="button" value="Write"
					style="width: 100px; height: 30px;background-color: red; color: white;"
					onclick="location='bbsForm.jsp'"
				>
				<input type="button" value="List"
					style="width: 100px; height: 30px; background-color: red; color: white;"
					onclick="location='bbslist.jsp'"
				>
				<input type="button" value="Update"
					style="width: 100px; height: 30px; background-color: red; color: white;"
					onclick="location='bbsupform.jsp?num=<%=num%>'"
				>
				<input type="button" value="Delete"
					style="width: 100px; height: 30px; background-color: red; color: white;"
					onclick="location='bbsdelete.jsp?num=<%=num%>'"
				>
			</td></tr>
		</table>
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