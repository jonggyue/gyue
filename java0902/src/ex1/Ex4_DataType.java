package ex1;

/**
 *
 * @author 1
 * Document   : Ex4_DataType created on : 2014. 9. 2, $[time}
 */
public class Ex4_DataType {
    //psvm[TAB Key]
    public static void main(String[] args) {
        String str1 = "J"; //�Ͻ������� ��ü�� ������ String
        String str2 = "��";
        char ch1 = 'A'; //' ' �ѹ��ڸ� �����ϱ� ���� char
        //sout[TAB Key]
        System.out.println("���ڿ� : "+str1);
        System.out.println("���ڿ� : "+str2);
        System.out.println("���� : "+ch1);
        
        char ch3 = '\u0042';
        System.out.println("ch3:�����ڵ� �� : "+ch3);
        
        char ch4 = '\ucafe';
        System.out.println("ch4:�����ڵ� �� : "+ch4);
        
    }

}
