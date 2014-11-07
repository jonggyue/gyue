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
public class Ex2_ServletConfig extends HttpServlet {

    private String admin_id, test_id, address;
    // 핵심 : ServletContext는 모든 어플리케이션에서 사용되는 범위
    // ServletConfig는 설정도니 서블릿에서만 유효하다.

    @Override
    public void init() throws ServletException {
        // init-param 으로 동록한 내용은 SErvletConfig에 저장된다.
        admin_id = getServletConfig().getInitParameter("admin_id");
        test_id = getServletContext().getInitParameter("admin_id");
        // context-param으로 등록한 내용은 ServletContext에 저장된다.
        address = getServletContext().getInitParameter("address");
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        // PrintWriter :  브릿지 스트림이 없요없음->바이트 스트림을 바로 적용
        // autoflush 기능 -> 버퍼를 비워주는 기능
        // 2차 문자 스트림 !
        PrintWriter out = resp.getWriter(); //스트림!
        out.println("Admin ServletConfig : " + admin_id + "<br/>");
        out.println("Admin Test : " + admin_id + "<br/>");
        out.println("Address : " + address + "<br/>");
        /*실행결과
        Admin ServletConfig : javabook@naver.com
        Admin Test : javabook@naver.com
        Address : 경기도 분당구 삼평도 유스페이스2
         */
    }

}
