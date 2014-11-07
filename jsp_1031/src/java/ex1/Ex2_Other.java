/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ex1;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author 1
 */
public class Ex2_Other extends HttpServlet {

    private String admin_id, test_id, address;

    @Override
    public void init() throws ServletException {
        admin_id = getServletConfig().getInitParameter("admin_id");
        test_id = getServletContext().getInitParameter("admin_id");
        address = getServletContext().getInitParameter("address");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // PrintWriter :  �긴�� ��Ʈ���� �������->����Ʈ ��Ʈ���� �ٷ� ����
        // autoflush ��� -> ���۸� ����ִ� ���
        // 2�� ���� ��Ʈ�� !
        PrintWriter out = resp.getWriter(); //��Ʈ��!
        out.println("Admin ServletConfig : " + admin_id + "<br/>");
        out.println("Admin Test : " + admin_id + "<br/>");
        out.println("Address : " + address + "<br/>");
        /*������
        Admin ServletConfig : null
        Admin Test : null
        Address : ��⵵ �д籸 ���� �������̽�2
         */
    }
}