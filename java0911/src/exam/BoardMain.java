package exam;

import java.util.Scanner;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : BoardMain created on : 2014. 9. 11, ���� 2:06:18
 */
public class BoardMain {
    // 1.�Է�, 2.���, 3.���� : 1
    // ���� :
    // ���� :('M', 'F', 'm', 'f',)���޼��� !
    // �ۼ��� :
    // ���� :
    // ���糯¥ : 
    // 1.�Է�, 2.���, 3.���� : 2
    // ���� ~~~~���� ��¥�� ���
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
       
        BoardReference ref = new BoardReference();
        int num;

        while(true){
            
            System.out.print("1.�Է� 2.��� 3.���� : ");
            num = Integer.parseInt(sc.nextLine());
            if(num==1){
                BoardVO v = new BoardVO();
                System.out.print("���� : ");
                v.setTitle(sc.nextLine());
                System.out.print("���� : ");
                v.setGender(sc.nextLine());
                System.out.print("�ۼ��� : ");
                v.setPost(sc.nextLine());
                System.out.print("���� : ");
                v.setContent(sc.nextLine());
                System.out.print("���糯¥ : ");
                v.setDay(sc.nextLine());
                
                /*
                boolean result = vc.info(vo);
                if(result == false){
                    System.out.println("�������� M,F,m,f�� �Է°����մϴ�.);
                }
                */
                
                ref.info(v);
                
            }
            if(num==2){
                System.out.println("���� : "+ref.getVo().getTitle());
                System.out.println("���� : "+ref.getVo().getGender());
                System.out.println("�ۼ��� : "+ref.getVo().getPost());
                System.out.println("���� : "+ref.getVo().getContent());
                System.out.println("���糯¥ : "+ref.getVo().getDay());
            }
            if(num==3){
                break;
            }
        }
        
    }
    

}
