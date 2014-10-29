package ex1;
/**
 *
 * @author KOSTA 86기 김종규
 * Document   : MP3Phone created on : 2014. 9. 12, 오전 9:58:15
 */
public class MP3Phone extends Ex1_Super{
    private int size;
    
    public MP3Phone(String model, String num, int chord, int size){
        this.size = size;
        super.model = model;
        super.chord = chord;
        setNumber(num);
        
    }

    public int getSize() {
        return size;
    }
    

}
