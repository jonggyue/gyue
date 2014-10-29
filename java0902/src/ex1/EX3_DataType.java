package ex1;

public class EX3_DataType {
    public static void main(String[] args){
        byte a = 10;
        byte b = 20;
        byte c;
        int d;
        c=(byte) (a+b);
        //demotion : 큰 자료형에서 작은 자료형으로 데이터가이동될 때
        //자료의 손실이 있을 수 있음(캐스팅)
        //promotion : 작은 자료형에서 큰 자료형으로 데이터가 이동될 때
        //자연스러운 현상
        //JVM은 int 4바이트 이하의 연산을 수행 할 ? int형으로 승격 시킴
        //그래서 a+b가 연산이 이루어 질 때 int공간에 연산 결과가 저장이 되기 ?문에
        //이것을 byte c에 저장하기 위해서는 demotion이 일어남.
        d= a+b;
        System.out.println("a+b = c = "+c);
        System.out.println("a+b = d = "+d);
        //long
        long myL = a+b;
        //promotion일어남
        int f = (int) a+b;
        //demotion일어남
        
    }
    
}
