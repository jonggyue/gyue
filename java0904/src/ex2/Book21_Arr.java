package ex2;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Book21_Arr created on : 2014. 9. 4, 오후 4:00:32
 */
public class Book21_Arr {
    public static void main(String[] args) {
        int arr[] = {1, 5, 2, 8};
        
        for(int num : arr){
            System.out.println(num);
        }
        for(int i = 0; i < arr.length; i++){
            System.out.println(arr[i]);
        }
    }
}
