package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ActionForward;

// ���ۼ���:3. ���� �����Ͻ� ������ �����ؾ� �ϰ�, �ݵ�� ��Ʈ�ѷ��� ���� ��û�� ���� �� ���� �Ǿ�� �ϱ�
// ������ ��Ʈ�ѷ����� �޴��� ������ �������̽��� �����ؾ��Ѵ�.
public class IndexModel implements Action{

	@Override
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res)
			throws IOException {
		System.out.println("IndexModel�� ����Ǿ���");
		System.out.println("������ ���̽� ���� �۾��� ���⼭ ��!");
		return new ActionForward("/WEB-INF/index.jsp", false);
	}
	
}
