package ex1;

/**
 *
 * @author 1
 * Document   : Ex4_DataType created on : 2014. 9. 2, $[time}
 */
public class Ex4_DataType {
    //psvm[TAB Key]
    public static void main(String[] args) {
        String str1 = "J"; //암시적으로 객체가 생성된 String
        String str2 = "한";
        char ch1 = 'A'; //' ' 한문자를 저장하기 위한 char
        //sout[TAB Key]
        System.out.println("문자열 : "+str1);
        System.out.println("문자열 : "+str2);
        System.out.println("문자 : "+ch1);
        
        char ch3 = '\u0042';
        System.out.println("ch3:유니코드 값 : "+ch3);
        
        char ch4 = '\ucafe';
        System.out.println("ch4:유니코드 값 : "+ch4);
        
    }

}
