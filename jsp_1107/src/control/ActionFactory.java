package control;

import action.Action;
import action.IndexModel;
import action.TodayModel;
import action.ValueModel;

// ���ۼ���:4. Servlet�� ���������� �����ϴ� Ŭ����****
//(Thread�� �����ϴ� Ŭ����-����ȭ�۾�,�̱����۾� �ʿ�)
public class ActionFactory {
	private static ActionFactory factory;

	public static synchronized ActionFactory getFactory() {
		if(factory == null) factory = new ActionFactory();
		return factory;
	}
	// ��Ʈ�ѷ��� �𵨻��̿��� �߰� ���� ������ �ϴ� ��ü
	// - ��Ʈ�ѷ����Լ� ���� ��û�� �޾Ƽ� �ش� ���� ������ �ּҰ��� �ٽ� ��Ʈ�ѷ����� �����ؼ�
	//	 ��Ʈ�ѷ��� �ֹ��� ��(ActionForward)�� ���� �޵��� �����ϴ� ������ �Ѵ�.
	// ������/ ��ü���� ���յ��� ���߱����� ��ü�� ����� ���� objectFactory
	// ��û�� ó���ϰ� �ڵ鸵�ϴ� ���䵵 �߿�
	
	public Action makeAction(String query){
		Action action = null;
		if(query.equals("index")){
			action = new IndexModel();
		}else if(query.equals("v1")){
			action = new ValueModel();
		}else if(query.equals("todate")){
			action = new TodayModel();
		}
		return action;
	}
}
