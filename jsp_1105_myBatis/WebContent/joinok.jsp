<%@page import="dao.JoinDao"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR"
	pageEncoding="EUC-KR"%>
<script src="//code.jquery.com/jquery-1.11.0.min.js"></script>
<script src="//code.jquery.com/jquery-migrate-1.2.1.min.js"></script>
<%--JSP UserBean �׼��±׸� ����ϸ� beans�� �Ķ���Ϳ� ���� �����͸� �ֱⰡ ��������. --%>

<%
	request.setCharacterEncoding("euc-kr");
%>
<%-- MjoinVo vo = new MjoinVO() �Ͱ��� --%>
<jsp:useBean id="vo" class="vo.MjoinVO"></jsp:useBean>
<%-- ������ �Ѿ���� �Ķ������ �̸��� vo��ü�� property�� ������ ��
	������� ����ؼ� ���� �۾����� ���� �� �� �ִ�, --%>
<jsp:setProperty property="*" name="vo" />
<%--setter : vo.setId(request.getParameter("id");--%>
<%-- <jsp:setProperty property="id" name="vo" param="id"/> --%>
<%-- <jsp:setProperty property="pwd" name="vo" param="pwd"/> --%>
<%-- <jsp:setProperty property="name" name="vo" param="name"/> --%>
<%-- <jsp:setProperty property="info" name="vo" param="info"/> --%>

<script>
	$(document).ready(function() {
<%		boolean res = JoinDao.getDao().addJoin(vo);%>
		
			
<%
			if (res) {
%>
			//jQuery Code here
			$('#welcomeID').val('<%=vo.getId()%>');
			$('#status').val('ok');
<%
			} else {
%>
			//jQuery Code here
				$('#welcomeID').val('none');
				$('#status').val('no');
	
<%
			}
%>
$('form').submit();
	});
</script>
<form method="post" action="welcome.jsp">
	<input type="hidden" name="welcomeID" id="welcomeID">
	<input type="hidden" name="status" id="status">
</form>

