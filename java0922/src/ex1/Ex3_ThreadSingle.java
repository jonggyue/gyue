package ex1;
/**
 *
 * @author KOSTA 86�� ������
 Document   : Ex3_ThreadSingle created on : 2014. 9. 22, ���� 11:19:45
 */
// -�������� : start�� �ٸ� Ŭ������ �����ؾߵ� �ڿ��̱� ������ static����
// �����ϰ� Thred�� tngodehlf dlfdmf Ex3_MyTread���� ������
// ����غ���.
public class Ex3_ThreadSingle {
    public static long start;
    public static void main(String[] args) {
        Ex3_Sing sing = new Ex3_Sing();
        sing.start();
        start = System.currentTimeMillis();
        
        //------------Thread�� ����
//        for(int i =0; i<300; i++){
//            System.out.print("*");
//        }
//        System.out.println("");
        
//        System.out.println(System.currentTimeMillis()-start);
        // --------�״��
        for(int i =0; i<300; i++){
            System.out.print("X");
        }
        System.out.println("");
        System.out.println(System.currentTimeMillis()-start);
    }

}
