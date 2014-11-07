package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class suggestload_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.01 Transitional//EN\">\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <title></title>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <script src=\"js/httpRequest.js\"></script>\n");
      out.write("<!--        <script src=\"js/json2.js\"></script>-->\n");
      out.write("        <script>\n");
      out.write("                    var lastKey = '';\n");
      out.write("                    var check = false;\n");
      out.write("                    var loopKey = false;\n");
      out.write("                    function startSuggest() {\n");
      out.write("                    if (check == false) {\n");
      out.write("                    setTimeout(\"sendKeyword();\", 500);\n");
      out.write("                            loopKey = true;\n");
      out.write("                    }\n");
      out.write("                    check = true;\n");
      out.write("                    }\n");
      out.write("            function sendKeyword() {\n");
      out.write("            if (loopKey == false) {return; }\n");
      out.write("            var key = f.word.value;\n");
      out.write("                    if (key == '' || key == ' ') {\n");
      out.write("            lastKey = '';\n");
      out.write("                    document.getElementById(\"view\").style.display = 'none';\n");
      out.write("            } else if (key != lastKey) {\n");
      out.write("            lastKey = key;\n");
      out.write("                    var param = \"key=\" + encodeURIComponent(key);\n");
      out.write("                    sendRequest(\"suggest.jsp\", param, res, \"post\");\n");
      out.write("            }\n");
      out.write("            setTimeout(\"sendKeyword();\", 500);\n");
      out.write("            }\n");
      out.write("            var jsonObj = null;\n");
      out.write("                    function res() {\n");
      out.write("                    if (xhr.readyState == 4) {\n");
      out.write("                    if (xhr.status == 200) {\n");
      out.write("                    var response = xhr.responseText;\n");
      out.write("                            jsonObj = JSON.parse(response);\n");
      out.write("                            viewTable();\n");
      out.write("                    } else {\n");
      out.write("                    document.getElementById(\"view\").style.display = 'none';\n");
      out.write("                    }\n");
      out.write("                    }\n");
      out.write("                    }\n");
      out.write("            function viewTable() {\n");
      out.write("            var vD = document.getElementById(\"view\");\n");
      out.write("                    var htmlTxt = \"<table width='200' border='0' cellspacing='0'>\";\n");
      out.write("                    for (var i = 0; i < jsonObj.length; i++) {\n");
      out.write("            htmlTxt += \"<tr><td style='cursor:pointer;'\n");
      out.write("                    onmouseover = 'this.style.background=\\\"silver\\\"'\n");
      out.write("                    onmouseout = 'this.style.background=\\\"white\\\"' onclick = 'select(\"+i+\")' > \" + jsonObj[i]\n");
      out.write("                    + \"</td></tr>\";\n");
      out.write("            }\n");
      out.write("            htmlTxt += \"</table>\";\n");
      out.write("                    vD.innerHTML = htmlTxt;\n");
      out.write("                    vD.style.display = \"block\";\n");
      out.write("            }\n");
      out.write("            function select(index) {\n");
      out.write("            f.word.value = jsonObj[index];\n");
      out.write("                    document.getElementById(\"view\").style.display = 'none';\n");
      out.write("                    check = false;\n");
      out.write("                    loopKey = false;\n");
      out.write("            }\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <form name=\"f\">\n");
      out.write("            <input type=\"text\" style=\"width:200px;\" name=\"word\" onkeydown=\"startSuggest();\"/>\n");
      out.write("            <input type=\"submit\" value=\"°Ë»ö\"/>\n");
      out.write("            <div id=\"view\" style=\"width:200px;border:1px solid gray;border-top:0px;margin-top:-1px;display:none;font-family:NanumGothic;font-size:10px\"/>\n");
      out.write("        </form>\n");
      out.write("    </body>\n");
      out.write("</html>");
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
