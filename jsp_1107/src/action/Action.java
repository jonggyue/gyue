package action;

import java.io.IOException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import control.ActionForward;
// ���ۼ���:2. �𵨵��� �ݵ�� �����ؾ� �� ���
// ��Ʈ������ ���� �޴��� - ������ ���� �������̽��� ����ؼ� �߻�޼��带 ȣ���� ��
// ����ڰ� ��û�Ѱ��� model�� �Ѱ��ֱ�����
// request, response�� ���ڰ����� �־ �����Ѵ�.
public interface Action {
	public ActionForward execute(HttpServletRequest req, HttpServletResponse res)
			throws IOException;
}
