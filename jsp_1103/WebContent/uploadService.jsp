<%-- 
    Document   : fileupload
    Created on : 2014. 9. 16, 오후 1:26:19
    Author     : kosta
--%>
<!--XMLHttpRequest Level2 : XMLHttpRequest 사양이 발전한 형태로 아래 세가지 특징을 갖는다.
1. 크로스 도메인으로 요청을 송신할 수 있게 됨.
2. 파일이나 바이너리 데이터, 폼 데이터 등 송신할 수 있는 종류가 늘어남.
3. 요청 진행 상황을 확인할 수 있음(업로드/다운로드 모두)
-->
<%@page import="java.io.BufferedOutputStream"%>
<%@page import="java.io.FileInputStream"%>
<%@page import="java.io.BufferedInputStream"%>
<%@page import="org.apache.coyote.http11.filters.BufferedInputFilter"%>
<%@page import="java.io.FileOutputStream"%>
<%@page import="java.io.OutputStream"%>
<%@page import="java.io.InputStream"%>
<%@page import="java.io.File"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    response.setHeader("Access-Control-Allow-Origin", "*");
    response.setHeader("Access-Control-Allow-Headers", "X-File-Name");

    if (!"OPTIONS".equals(request.getMethod().toUpperCase())) {
        String fileName = request.getHeader("X-File-Name");
        fileName = java.net.URLDecoder.decode(fileName, "UTF-8");
        System.out.println(fileName);
        String ext = fileName.substring(fileName.lastIndexOf("."));
        String uploadFileName = fileName.substring(0, fileName.lastIndexOf(".")) + "_" + System.currentTimeMillis() + ext;
        System.out.println("read :"+application.getRealPath("/upload"));
        File uploadDir = new File(application.getRealPath("/upload"));
         System.out.println("***************"+uploadDir.getAbsolutePath());
       
        if (!uploadDir.exists()) {
           
            uploadDir.mkdir();
        }
        File uploadFile = new File(uploadDir, uploadFileName);
		System.out.println("uploadFile :"+uploadFile);
        InputStream in = request.getInputStream();
        OutputStream outFile = new FileOutputStream(uploadFile);
        byte[] buf = new byte[1024 * 2];
        int size = 0;
        while ((size = in.read(buf)) != -1) {
            outFile.write(buf, 0, size);
        }
        
        outFile.close();
        in.close();
		
        String fileUrl = application.getContextPath() + "/upload/" + uploadFileName;

        out.write("<img src='"+fileUrl+"'/>");

    }
%>

