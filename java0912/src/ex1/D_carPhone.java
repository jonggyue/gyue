package ex1;
/**
 *
 * @author KOSTA 86�� ������
 * Document   : D_carPhone created on : 2014. 9. 12, ���� 9:45:26
 */
// ����� ������ �ܰ迡�� �θ� Ŭ������ Ex1_Spuer�� ���յȴ�.
// �ڹٿ��� ����� ���� ����̴�.
public class D_carPhone extends Ex1_Super{
    private String pixel; // ȭ�Ҽ�
    public D_carPhone(String model, String num, int chord, String pixel){
        this.pixel = pixel;
//        Ex1_Super ref = new Ex1_Super();
//        ref.model = model;
        
        // �θ��� �ڿ��� ���� �ϱ� ���ؼ� super�� Ű���带 ���
        super.model = model;
        // �θ��� �ڿ��̶�� �ص� private�� ������ �Ұ����ϴ�.
        //�θ�Ŭ������ ���ǵ� �޼��嵵 �ڽ��� �ڿ�ó�� ȣ�Ⱑ��!
        setNumber(num);
        //this.chord = chord; // this�� �θ��� �ڿ��� �ڱ��ڿ����� ���������
                             // ���� Ŭ������ ���� �̸��� ������ �ڽ��� ���� ��Ÿ��
        super.chord = chord;
    }



    // [��������] MP3Phone Ŭ������ ���� Ex1_Super�� ��ӹް�
    // ����ʵ忡�� int size // ����뷮
    // �ϳ� �ΰ� ���� ���� �ʱ�ȭ ��Ű�ÿ�.
    // ��, Ex1_Spuer�� �ڽ� Ŭ������ ������ �Ǵ� �θ� Ŭ�����μ��� �Ǿ���.
    public String getPixel() {
        return pixel;
    }
    
    
}
