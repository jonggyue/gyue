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
        // 요청 파라미터 받아보기
        String v = req.getParameter("cmd");
        System.out.println("첫번째 페이지 이동!"+v);
        req.setAttribute("key", v);
        // 페이지가 이동!, 파라미터 초기화
        // 만약에 값을 다음페이지로 전송할 땐 기존의 url방식으로 사용해야함!
        resp.sendRedirect("SecondReDirect?v=vv");
        
    }
    
}
