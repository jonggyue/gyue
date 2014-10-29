package exam;

/**
 *
 * @author KOSTA 86기 김종규
 * Document   : BoardReference created on : 2014. 9. 11, 오후 2:09:44
 */
public class BoardReference {
    private BoardVO vo;// has a 관계
    
    public void info(BoardVO vo){
        this.vo = vo;
        
    }
    /*
    public boolean info(BoardVO vo){
        if(!vo.getGender().equalsIgnoreCase("m") && !vo.getGender().equalsIgnoreCase("f")){
            return false;
        } else{
            this.vo = vo;
            return true;
        }
    */
    public BoardVO getVo() {
        //만일 성별에 m이나 f가 아닐때 이 메서드를 boolean형으로해서 만듬
        //if(!vo.getGender().equalsIgnoreCase("m") && !vo.getGender().equalsIgnoreCase("f"))
        return vo;
    }
}
