package ex2;

import ex2.vo.MemberVO;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : Ex2_CallByReference created on : 2014. 9. 11, 오전 11:23:42
 */
public class Ex2_CallByReference1 {
    // 연습문제 : 현재 클래스는 변화에 유연하지 못한 클래스로 설계가 되어 있다.
    // info란 메서드에게 자원을 추가해서 사용하기 위해서
    // 메서드의 인자값도 늘여야 하고, 멤버필드 및 setter/getter도 늘려야 한다.
    // private boolean agree를 추가해서 사용해보면 알것임
    //POJO, CallByReference 를 적절히 사용하면 해결됨
    
    // 한사람의 정보를 출력-번호,이름,나이,성별,전번
    private MemberVO vo;
    
    //메서드로 호출시 MemberVO를 생성한 후 setter로 값을 저장한 후
    //인자값으로 호출해야 한다. ****
    public void info(MemberVO vo){
        // 만약 가공이 필요하다면?
        if(vo.getTel().contains("02")){
            System.out.println("Log : 서울사람이닷!");
        }
    this.vo = vo;
    }

    public MemberVO getVo() {
        return vo;
    }

}
