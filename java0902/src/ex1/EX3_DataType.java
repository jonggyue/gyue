package ex1;

public class EX3_DataType {
    public static void main(String[] args){
        byte a = 10;
        byte b = 20;
        byte c;
        int d;
        c=(byte) (a+b);
        //demotion : ū �ڷ������� ���� �ڷ������� �����Ͱ��̵��� ��
        //�ڷ��� �ս��� ���� �� ����(ĳ����)
        //promotion : ���� �ڷ������� ū �ڷ������� �����Ͱ� �̵��� ��
        //�ڿ������� ����
        //JVM�� int 4����Ʈ ������ ������ ���� �� ? int������ �°� ��Ŵ
        //�׷��� a+b�� ������ �̷�� �� �� int������ ���� ����� ������ �Ǳ� ?����
        //�̰��� byte c�� �����ϱ� ���ؼ��� demotion�� �Ͼ.
        d= a+b;
        System.out.println("a+b = c = "+c);
        System.out.println("a+b = d = "+d);
        //long
        long myL = a+b;
        //promotion�Ͼ
        int f = (int) a+b;
        //demotion�Ͼ
        
    }
    
}
