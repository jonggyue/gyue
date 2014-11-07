package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.ResultSet;
import java.sql.PreparedStatement;
import conn.ConnUtils;
import java.sql.Connection;

public final class eaxm_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
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


    Connection con = ConnUtils.getConn();
    StringBuffer sb = new StringBuffer();
    sb.append("select mymemberno,id,pwd,name,age,email,hobby1,hobby2,hobby3,mymemberdate from mymember ");
    sb.append("order by 1 desc");
    PreparedStatement pstm = con.prepareStatement(sb.toString());
    ResultSet rs = pstm.executeQuery();


      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <table>\n");
      out.write("            <tr>\n");
      out.write("                <td>번호</td>\n");
      out.write("                <td>아이디</td>\n");
      out.write("                <td>비밀번호</td>\n");
      out.write("                <td>나이</td>\n");
      out.write("                <td>이메일</td>\n");
      out.write("                <td>취미1</td>\n");
      out.write("                <td>취미2</td>\n");
      out.write("                <td>취미3</td>\n");
      out.write("                <td>가입일</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
 while (rs.next()) {
                    String num = rs.getString("mymemberno");
                    String id = rs.getString("id");
                    String pwd = rs.getString("pwd");
                    String name = rs.getString("name");
                    String age = rs.getString("age");
                    String email = rs.getString("email");
                    String hb1 = rs.getString("hobby1");
                    String hb2 = rs.getString("hobby2");
                    String hb3 = rs.getString("hobby3");
                    String date = rs.getString("mymemberdate");
            
      out.write("\n");
      out.write("            <tr>\n");
      out.write("                <td>");
      out.print(num);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(id);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(pwd);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(name);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(age);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(email);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(hb1);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(hb2);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(hb3);
      out.write("</td>\n");
      out.write("                <td>");
      out.print(date);
      out.write("</td>\n");
      out.write("            </tr>\n");
      out.write("            ");
}
      out.write("\n");
      out.write("        </table>\n");
      out.write("\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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
