package ex2;

import ex2.vo.MemberVO;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : Ex2_CallByReference created on : 2014. 9. 11, ���� 11:23:42
 */
public class Ex2_CallByReference1 {
    // �������� : ���� Ŭ������ ��ȭ�� �������� ���� Ŭ������ ���谡 �Ǿ� �ִ�.
    // info�� �޼��忡�� �ڿ��� �߰��ؼ� ����ϱ� ���ؼ�
    // �޼����� ���ڰ��� �ÿ��� �ϰ�, ����ʵ� �� setter/getter�� �÷��� �Ѵ�.
    // private boolean agree�� �߰��ؼ� ����غ��� �˰���
    //POJO, CallByReference �� ������ ����ϸ� �ذ��
    
    // �ѻ���� ������ ���-��ȣ,�̸�,����,����,����
    private MemberVO vo;
    
    //�޼���� ȣ��� MemberVO�� ������ �� setter�� ���� ������ ��
    //���ڰ����� ȣ���ؾ� �Ѵ�. ****
    public void info(MemberVO vo){
        // ���� ������ �ʿ��ϴٸ�?
        if(vo.getTel().contains("02")){
            System.out.println("Log : �������̴�!");
        }
    this.vo = vo;
    }

    public MemberVO getVo() {
        return vo;
    }

}
