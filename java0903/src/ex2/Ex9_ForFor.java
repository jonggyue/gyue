package ex2;
/**
 *
 * @author 1
 * Document   : Ex9_ForFor created on : 2014. 9. 3, ���� 3:50:57
 */
public class Ex9_ForFor {
    public static void main(String[] args) {
        //���� for()��
        //ū for�� �ݺ��� ������ ����for�� �׾ȿ���
        //��� �ʱ�� ���� ���ǽı��� �ݺ��� �ֱ������� �����ϰԵȴ�.
//        for(�ʱ��;���ǽ�; ������){               ū for��
//            ���๮;
//            for(�ʱ��;���ǽ�; ������){           ���� for��
//                ���๮;
//            }
//        }
        for(int i=1; i<=9; i++){
            for(int j=2; j<=9; j++){
                System.out.print(j + " x " + i + " = " + (i * j) + "\t");
            }
            System.out.println("");
        }
        
    }

}
