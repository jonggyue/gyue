/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ex2;


import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class FirstReDirect extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        // ��û �Ķ���� �޾ƺ���
        String v = req.getParameter("cmd");
        System.out.println("ù��° ������ �̵�!"+v);
        req.setAttribute("key", v);
        // �������� �̵�!, �Ķ���� �ʱ�ȭ
        // ���࿡ ���� ������������ ������ �� ������ url������� ����ؾ���!
        resp.sendRedirect("SecondReDirect?v=vv");
        
    }
    
}
