package ex1;

/**
 *
 * @author KOSTA 86기 김종규 Document : Ex2_Throws created on : 2014. 9. 16, 오전 10:22:39
 */
public class Ex2_Throws {

    public void setData(String m) throws NumberFormatException{
        if(m.length()>=1){
            String str = m.substring(0, 1); //substring 0번째자리부터, 1번째전까지
            printData(str);
        }

    }
    // throws 호출한 쪽으로 위임
    public void printData(String m) throws NumberFormatException{
        int dan = Integer.parseInt(m);
        System.out.println(dan + "단");
        System.out.println("============");
        for (int i = 0; i < 9; i++) {
            System.out.println(dan + " X " + (i + 1) + " = " + (dan * (i + 1)));
        }
    }

}
