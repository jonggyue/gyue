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
			<h2>Join Page</h2>
		</header>
		<p>
		<form method="post" action="joinok.jsp">
			<table style="margin: auto; width: 300px">
				<tr>
					<td>ID</td>
					<td><input type="text" name="id"> <!-- Ajax & Jquery�� �����ϱ� -->
						</td>
						<td><input type="button" id="btn1" value="����Ȯ��"
						style="width: 100px; height: 30px;"></td>
				</tr>
				<tr>
					<td>PWD</td>
					<td><input type="password" name="pwd"></td>
				</tr>
				<tr>
					<td>NAME</td>
					<td><input type="text" name="name"></td>
				</tr>
				<tr>
					<td>info</td>
					<td><textarea rows="10" cols="30" name="info"></textarea></td>
				</tr>
				<tr>
					<td colspan="2" style="text-align: right;"><input
						type="submit" value="Join"></td>
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