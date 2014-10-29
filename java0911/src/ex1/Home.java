package ex1;

/**
 *
 * @author KOSTA 86기 김종규 Document : Home created on : 2014. 9. 11, 오전 10:02:54
 */
public class Home {
// call by reference 예
    private String doorColor;//대문의 색상 : 정보를 은닉
    // setter/getter를 사용 캡슐화

    public String getDoorColor() { // 대문색을 확인하도록 제공
        return doorColor;
    }

    public void setDoorColor(String doorC) { // 대문색을 지정하도록 제공
        doorColor = doorC; // doorC는 call by value
    }

}
