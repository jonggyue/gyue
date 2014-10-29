/*
    Inter1, Intewr2는 각각 다른 목적에 의해서 설계 되었지만
    현재 MyInter1_2에서 통합해서 사용하고 싶을 때
    인터페이스 끼리는 다중 상속이 가능하다.
 */
package ex3;

public interface MyInter1_2 extends Inter1, Inter2{
    public int getdate();
}
