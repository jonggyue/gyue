package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class ex2_005fdatalist_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <h1>Hello World! 1</h1>\n");
      out.write("        <h1>Hello World! 2</h1>\n");
      out.write("        <h1>Hello World! 3</h1>\n");
      out.write("    </body>\n");
      out.write("    \n");
      out.write("    <form>\n");
      out.write("        <fieldset>\n");
      out.write("            <legend>datalist연습</legend>\n");
      out.write("            <label for=\"ss\">Homepage:</label>\n");
      out.write("            <input type=\"url\" id=\"ss\"\n");
      out.write("                   list=\"s_data\" required>\n");
      out.write("            <datalist id =\"s_data\">\n");
      out.write("                <!-- 데이터 루프영역-->\n");
      out.write("                <option value=\"http://www.shinhan.com\"\n");
      out.write("                        label=\"신한\"/>\n");
      out.write("                <option value=\"http://www.naver.com\"\n");
      out.write("                        label=\"네이버\"/>\n");
      out.write("                <option value=\"http://www.kosta.or.kr\"\n");
      out.write("                        label=\"kosta\"/>\n");
      out.write("            </datalist>\n");
      out.write("            <p><button type=\"submit\">SEND</button></p>\n");
      out.write("        </fieldset>\n");
      out.write("            \n");
      out.write("        \n");
      out.write("    </form>\n");
      out.write("    \n");
      out.write("    \n");
      out.write("    \n");
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
