<%@page import="dao.ImgDirDao"%>
<%@page import="vo.ImgDriVO"%>
<%@page import="java.io.File"%>
<%@page import="com.oreilly.servlet.multipart.DefaultFileRenamePolicy"%>
<%@page import="com.oreilly.servlet.MultipartRequest"%>
<%@ page language="java" contentType="text/html; charset=EUC-KR" pageEncoding="EUC-KR"%>
<%
	
	String path = application.getRealPath("/upload");
	System.out.println(path);

    MultipartRequest mr = new MultipartRequest(request,path,1024*1024*5,
    				"euc-kr",new DefaultFileRenamePolicy());
    
    System.out.println("writer :"+mr.getParameter("writer"));
    // 넘어온 파일을 File객체로 생성
    File s_file =mr.getFile("s_file");
    System.out.println("file :"+ s_file.getName());
    String fileUrl = application.getContextPath() + "/upload/"+ s_file.getName();

	// 모든 파라미터를 vo객체에 저장
	ImgDriVO v = new ImgDriVO();
	v.setWriter(mr.getParameter("writer"));
	v.setImgpath(s_file.getName());
	// Dao를 생성
	ImgDirDao.getDao().addImg(v);
	// 이동할 페이지 이동k
	response.sendRedirect("ex3_list.jsp");

%><img src="<%=fileUrl%>"> / <%=mr.getParameter("writer") %><br />
<img src="<%=application.getContextPath()%>/upload/unjung.jpg">





