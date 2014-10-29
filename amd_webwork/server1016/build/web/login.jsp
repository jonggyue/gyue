<%-- 
    Document   : login
    Created on : 2014. 10. 16, 오후 1:35:46
    Author     : 1
--%>

<%@page import="conn.ConnUtil"%>
<%@page import="java.sql.SQLException"%>
<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page contentType="text/html" pageEncoding="EUC-KR"%>
<%
    //파라미터를 처리(id,pwd)
    String idv = request.getParameter("id");
    String pwdv = request.getParameter("pwd");
    int res = 0;
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    try {
        con = ConnUtil.getConn();
        StringBuffer sql = new StringBuffer();
        sql.append("select count(*) cnt from andmem where ");
        sql.append(" id=? and pwd=?");
        pstmt = con.prepareStatement(sql.toString());
        pstmt.setString(1, idv);
        pstmt.setString(2, pwdv);
        rs = pstmt.executeQuery();
        
        if(rs.next()){
            res = rs.getInt("cnt");
        }
        
    } catch (SQLException ex) {
        ex.printStackTrace();
    } finally {
        try {
            if( con != null){
                con.close();
            }
            if(pstmt != null){
                pstmt.close();
            }
            if(rs != null){
                rs.close();
            }
            
        } catch (SQLException ex) {
            ex.printStackTrace();
        }

    }
    // if 시작
    String msg = "";
        if(res > 0){
            msg = "Welcome to my WebApplication!";
        }else{
            msg = "is not allowed!";
        }
    
%>
<%=idv%> : <%=msg%>



