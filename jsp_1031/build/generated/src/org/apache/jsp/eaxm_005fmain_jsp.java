package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class eaxm_005fmain_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=EUC-KR\">\n");
      out.write("        <title>JSP Page</title>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div id=\"wrap\">\n");
      out.write("            <h1>회원가입</h1>\n");
      out.write("            <form method=\"post\" action=\"\" id=\"f\">\n");
      out.write("                아이디: <input type=\"text\" name=\"id\" id=\"id\">\n");
      out.write("                <input type=\"button\" value=\"중복검사\" id=\"btn1\"><br/>\n");
      out.write("                <div id=\"idCheck\">중복체크</div>\n");
      out.write("                비밀번호:<input type=\"password\" name=\"pwd\" id=\"pwd\"><br/>\n");
      out.write("                비밀번호확인:<input type=\"password\" name=\"pwd1\" id=\"pwd1\">\n");
      out.write("                <div id=\"pwdCheck\">중복체크</div>\n");
      out.write("                이름: <input type=\"text\" name=\"name\" id=\"name\"><br/>\n");
      out.write("                나이: <input type=\"text\" name=\"age\" id=\"age\"><br/>\n");
      out.write("                이메일: <input type=\"text\" name=\"email\" id=\"email\"><br/>\n");
      out.write("                <div id=\"emailCheck\">중복체크</div>\n");
      out.write("                <div>취미</div>\n");
      out.write("                <ul>\n");
      out.write("                    <li><input type=\"checkbox\" value=\"bike\" id=\"hcheck1\">bike</li>\n");
      out.write("                    <li><input type=\"checkbox\" value=\"study\" id=\"hcheck2\">study</li>\n");
      out.write("                    <li><input type=\"checkbox\" value=\"sleep\" id=\"hcheck3\">sleep</li>\n");
      out.write("                </ul>\n");
      out.write("                <input type=\"button\" value=\"회원가입\" id=\"btn2\"><br/>\n");
      out.write("            </form>\n");
      out.write("        </div>\n");
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
