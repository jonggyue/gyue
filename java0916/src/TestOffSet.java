/**
 *
 * @author KOSTA 86기 김종규
 * Document   : TestOffSet created on : 2014. 9. 16, 오후 3:12:03
 */
public class TestOffSet {
    public static void main(String[] args) {
        String str = "abcdefghijk";
        System.out.println("string = "+str);
         int retvel = str.offsetByCodePoints(0, 2);
         
         System.out.println(retvel);
         System.out.println(str.charAt(retvel));
    }
}
