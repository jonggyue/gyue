package ex1;

/**
 *
 * @author KOSTA 86�� ������ Document : Client created on : 2014. 9. 15, ���� 9:25:19
 */
public class Client {

    public static void main(String[] args) {
//        Animal animal;
//        animal = new Bird();
//        animal.cry();
//        
//        animal = new Cat();
//        animal.cry();
//
//        animal = new Dog();
//        animal.cry();
        // �迭 ����� ������ ó��
        // �迭�� ��ü
        // - �Ϲ��ڷ��� �迭, �����ڷ��� �迭
        // - ������ �迭�� ������ �迭
        // - �迭�� ������ �ݵ�� ũ�Ⱑ �����Ǿ�� �Ѵ�.

        Animal[] ar = new Animal[3];
        ar[0] = new Bird();
        ar[1] = new Dog();
        ar[2] = new Cat();
        int size = ar.length;
        System.out.println("�迭�� ũ�� : " + size);

        for (int i = 0; i < size; i++) {
            // ȿ������ �ڵ带 ����ϴ� ���
            // i < ar.length�� ���� �ȵǴ�����
            // �迭�� �׳��� �������� �ݺ����� �����ϸ鼭 ��� �迭ũ�� ���
            // �޸� ����
            ar[i].cry();
        }
        System.out.println("=====================");
        // jdk5���� ���� for���� ����
        // for(�迭/�÷����ǰ�ü �������� : (in�� �ǹ�)������){
        for (Animal e : ar) {
            e.cry();
        }
    }

}
