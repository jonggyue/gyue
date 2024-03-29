package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ActionForward;

// 제작순서: 7.
public class ValueModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		String v = req.getParameter("val");
		StringBuffer sb = new StringBuffer();
		sb.append("당신이 요청한 값은 ").append(v).append("입니다.");
		//request 객체를 통해서 값을 전달할려면?
		req.setAttribute("msg", sb.toString());
		return new ActionForward("/WEB-INF/value1.jsp", false);
	}

}
