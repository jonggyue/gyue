package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import conn.ConnUtil;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import java.sql.Connection;

public final class login_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;charset=EUC-KR");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");

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
    

      out.write('\n');
      out.print(idv);
      out.write(" : ");
      out.print(msg);
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
