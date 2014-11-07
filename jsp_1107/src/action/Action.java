package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ActionForward;
// 제작순서:2. 모델들이 반드시 수행해야 될 목록
// 컨트럴러가 사용될 메뉴얼 - 서블릿이 현재 인터페이스를 사용해서 추상메서드를 호출할 때
// 사용자가 요청한것을 model에 넘겨주기위해
// request, response를 인자값으로 넣어서 주입한다.
public interface Action {
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res)
			throws IOException;
}
