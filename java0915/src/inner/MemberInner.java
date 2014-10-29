package inner;



/**
 *
 * @author KOSTA 86�� ������
 * Document   : MemberInner created on : 2014. 9. 15, ���� 2:05:23
 */
// ����Ŭ���� : Ư��Ŭ���� �ȿ� �� �ٸ� Ŭ������ ���� �Ǵ� ���� �ǹ��Ѵ�.
// ���� : ���, ����, static, �͸�
// 
public class MemberInner {
    private int a = 10;
    private int b;
    private int c;

    public MemberInner() {
        b = 100;
        c = 200;
    }
    // ��� ����Ŭ������ ����
    public class Inner{
        public void printData(){
            System.out.println("�ܺ�Ŭ������ private����"+a);
            System.out.println("�ܺ�Ŭ������ private����"+b);
            System.out.println("�ܺ�Ŭ������ private����"+c);
        }
    }
    
    //����Ŭ���� ���� �� ����
    public static void main(String[] args) {
        // �ܺ�Ŭ������ �����Ѵ�.
        MemberInner outer = new MemberInner();
        // �ܺ�Ŭ������ �ּҸ� ���ؼ� ����Ŭ������ ���� �� ����
        MemberInner.Inner inner = outer.new Inner();
        inner.printData();
        
        
        // ��������.. �����Ѻ��� ���ٷ�
        MemberInner.Inner inner2 = new MemberInner().new Inner();
        inner2.printData();
    }

}
