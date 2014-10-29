package ex2;
/**
 *
 * @author KOSTA 86기 김종규
 Document   : Book9_HelloWorld created on : 2014. 9. 4, 오후 12:01:00
 */
public class Book9_HelloWorld {
    private String name;
    
    public Book9_HelloWorld(String name){
        this.name = name;
    }
    
    public void print(){
        System.out.println("HeLLo! "+ name);
    }
    public static void main(String[] args) {
        Book9_HelloWorld hello = new Book9_HelloWorld("Java");
        hello.print();
    }
}
