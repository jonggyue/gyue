package suggest;
/**
 * @author kosta 
 * Document   : Suggest Created on : 2014. 9. 24, 오후 3:43:06
 */
import java.net.URL;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import org.jdom2.Document;
import org.jdom2.Element;
import org.jdom2.input.SAXBuilder;

public class Suggest {

    private static Suggest suggest;
    private Document doc;
    private Element root;

    private Suggest() {

        // XML 의 구조를 읽어 들이기 위한 JDOM이 제공하는 기본 객체
        SAXBuilder sb = new SAXBuilder();

        try {
            // Web상에서 XML 경로
            String path = "http://192.168.7.149:8084/week2/suggest.xml";
            doc = sb.build(new URL(path);
            System.out.println("로딩 완료");
            root = doc.getRootElement();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static synchronized Suggest getInstance() {
        if (suggest == null) {
            suggest = new Suggest();
        }
        return suggest;
    }

    public String[] getSuggest(String key) {
       
        ArrayList<String> sugList = new ArrayList<String>();
        //root에서 필요한 요소는 keyword들 뿐이므로 keyword들만 선별한다.
        List<Element> list = root.getChildren("keyword");
         System.out.println("Key : "+ key);
        //속도를 높이기 위해 반복자(Iterator)로 구성한다.
        Iterator<Element> it = list.iterator();

        //사용자가 전달한 문자 또는 문자열(n)을 대/소문자 구별을 하지 않게
        //하기 위해 소문자로 변환
        key = key.toLowerCase();

        //반복자를 이용하여 사용자가 입력한 것으로 시작하는 단어들을 선별하여
        //a_list에 저장한다.
        while (it.hasNext()) {//반복자가 위치한 곳에서 다음칸에 요소가 있으면 true!
            String result = it.next().getText();//keyword요소의 문자열 추출
            //사용자가 던져준 값이 소문자이므로 다시 비교값 또한
            //소문자로 변환한다.
            String compare = result.toLowerCase();

            //사용자가 입력한 값으로 시작하는 것인지를 판단한다.
            if (compare.startsWith(key)) {
                sugList.add(result);
            }
        }


        //이제 사용자에게 전달할 단어들이 선별되었다.(sugList - ArrayList)
        //이것을 다시 String[]로 만들어야 한다.
        if (sugList.size() > 0) {
            String[] sugArr = new String[sugList.size()];

            return sugList.toArray(sugArr);
        }
        return null;
    }
}
