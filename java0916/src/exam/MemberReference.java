package exam;

/**
 *
 * @author KOSTA 86기 김종규 Document : MemberReference created on : 2014. 9. 16, 오후
 * 5:09:27
 */
public class MemberReference {
//여기에 ArrayList가져오는게 좋음
    private MemberVO vo;

    public void info(MemberVO vo) {
        this.vo = vo;

    }

    public MemberVO getVo() {
        return vo;
    }

}
