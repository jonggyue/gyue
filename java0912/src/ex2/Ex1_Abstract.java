package ex2;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex1_Abstract created on : 2014. 9. 12, 오후 12:00:48
 */

// 추상메서드를 가진 클래스는 반드시 추상클래스여야 한다.
public abstract class Ex1_Abstract {
    private String money;

    public Ex1_Abstract() {
        money = "money";
    }
    
    // 추상 메서드 : 산을 옮겨라.
    abstract public void moveMount();
    // 일반 메서드 
    public String getMoney() {
        return money;
    }
    

}
