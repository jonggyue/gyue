package exam;

/**
 *
 * @author KOSTA 86�� ������
 * Document   : BoardReference created on : 2014. 9. 11, ���� 2:09:44
 */
public class BoardReference {
    private BoardVO vo;// has a ����
    
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
        //���� ������ m�̳� f�� �ƴҶ� �� �޼��带 boolean�������ؼ� ����
        //if(!vo.getGender().equalsIgnoreCase("m") && !vo.getGender().equalsIgnoreCase("f"))
        return vo;
    }
}
