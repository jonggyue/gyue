package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class myform_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("        <style>\n");
      out.write("            .on{background: orange; color: white}\n");
      out.write("        </style>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-1.11.0.min.js\"></script>\n");
      out.write("        <script src=\"//code.jquery.com/jquery-migrate-1.2.1.min.js\"></script>\n");
      out.write("        <script type=\"text/javascript\">\n");
      out.write("            $(document).ready(function() {\n");
      out.write("                $('form').submit(function() {\n");
      out.write("                    //��ȿ�� �˻� - �ϳ���(if)�ɸ���\n");
      out.write("                    //form�� action=''���� �����͸� ���� ���ϰ� �Ѵ�\n");
      out.write("                    if ($('input[name=id]').val() == '') {\n");
      out.write("                        alert('���̵� �Է��ϼ���!');\n");
      out.write("                        $('input[name=id]').focus().addClass('on');\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if ($('input[name=pwd]').val() == '') {\n");
      out.write("                        alert('��й�ȣ�� �Է��ϼ���!');\n");
      out.write("                        $('input[name=pwd]').focus().addClass('on');\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if ($('input[name=pwd2]').val() == '') {\n");
      out.write("                        alert('��й�ȣ�� �Է��ϼ���!');\n");
      out.write("                        $('input[name=pwd2]').focus().addClass('on');\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if ($('input[name=pwd]').val() != $('input[name=pwd2]').val()) {\n");
      out.write("                        alert('��й�ȣ�� ��ġ�����ʽ��ϴ�.!');\n");
      out.write("                        $('input[name=pwd2]').focus().addClass('on');\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("                    if (!$('input[type=checkbox]').is(':checked')) {\n");
      out.write("                        alert('üũ�ڽ��� �ϳ� �̻��� üũ �Ǿ�� �մϴ�.');\n");
      out.write("                        return false;\n");
      out.write("                    }\n");
      out.write("\n");
      out.write("\n");
      out.write("                });\n");
      out.write("                $('#idcheck').click(function() {\n");
      out.write("                    $.post('eaxm_idcheck.jsp', $('#id').serialize(),\n");
      out.write("                            function(data) {\n");
      out.write("                                alert(data);\n");
      out.write("                            });\n");
      out.write("                });\n");
      out.write("                $('#allChk').click(function() {\n");
      out.write("                    var $chAll = $('input[type=checkbox]');\n");
      out.write("                    var chk = $chAll.is(':checked');\n");
      out.write("                    if (chk) {\n");
      out.write("                        $chAll.attr('checked', false);\n");
      out.write("                        $(this).val('��ü����');\n");
      out.write("                    } else {\n");
      out.write("                        $chAll.attr('checked', true);\n");
      out.write("                        $(this).val('��ü����');\n");
      out.write("                    }\n");
      out.write("                });\n");
      out.write("            });\n");
      out.write("        </script>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div>\n");
      out.write("            <h1>ȸ������</h1>\n");
      out.write("            <form method=\"post\" action=\"eaxm_join.jsp\">\n");
      out.write("                <table>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>���̵�</td>\n");
      out.write("                        <td><input type=\"text\" name=\"id\" id=\"id\">\n");
      out.write("                            <input type=\"button\" value=\"�ߺ�Ȯ��\" id=\"idcheck\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>��й�ȣ</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"password\" name=\"pwd\" id=\"pwd\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>��й�ȣ Ȯ��</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"password\" name=\"pwd2\" id=\"pwd2\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>�̸�</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"name\" id=\"name\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>����</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"age\" id=\"age\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>�̸���</td>\n");
      out.write("                        <td>\n");
      out.write("                            <input type=\"text\" name=\"email\" id=\"email\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td>��� <input type=\"button\" value=\"��ü����\" id=\"allChk\"></td>\n");
      out.write("                        <td>\n");
      out.write("\n");
      out.write("                            <input type=\"checkbox\" name=\"hb1\" class=\"hb\" value=\"�丮\">�丮\n");
      out.write("                            <hr>\n");
      out.write("                            <input type=\"checkbox\" name=\"hb2\" class=\"hb\" value=\"�뷡\">�뷡\n");
      out.write("                            <hr>\n");
      out.write("                            <input type=\"checkbox\" name=\"hb3\" class=\"hb\" value=\"����\">����\n");
      out.write("                            <hr>\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <td colspan=\"2\">\n");
      out.write("                            <input type=\"submit\" value=\"�ߺ�Ȯ��\">\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                </table>\n");
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
