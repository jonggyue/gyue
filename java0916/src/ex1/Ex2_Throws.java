package ex1;

/**
 *
 * @author KOSTA 86�� ������ Document : Ex2_Throws created on : 2014. 9. 16, ���� 10:22:39
 */
public class Ex2_Throws {

    public void setData(String m) throws NumberFormatException{
        if(m.length()>=1){
            String str = m.substring(0, 1); //substring 0��°�ڸ�����, 1��°������
            printData(str);
        }

    }
    // throws ȣ���� ������ ����
    public void printData(String m) throws NumberFormatException{
        int dan = Integer.parseInt(m);
        System.out.println(dan + "��");
        System.out.println("============");
        for (int i = 0; i < 9; i++) {
            System.out.println(dan + " X " + (i + 1) + " = " + (dan * (i + 1)));
        }
    }

}