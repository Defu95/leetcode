import javax.swing.text.html.parser.Entity;
import java.util.*;

public class Uncommon_Words_from_Two_Sentences {
    public static void main(String[] args) {
//        String A = "I like eat apple";
        String A="";
        String B = "I like eat banana";
        String[] res = uncommonFromSentences(A, B);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i]+" ");
    }

    public static String[] uncommonFromSentences(String A, String B) {
        String[] TA = A.split(" ");
        String[] TB = B.split(" ");
        HashMap<String, Integer> map = new HashMap<>();
        for (String s : TA) {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        for (String s : TB) {
            if (map.containsKey(s))
                map.put(s, map.get(s) + 1);
            else
                map.put(s, 1);
        }
        List<String> tmp = new ArrayList<>();
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry it = iterator.next();
            if ((int) it.getValue() == 1)
                tmp.add((String) it.getKey());
        }
        String[] res = new String[tmp.size()];
//        Iterator<String> r = tmp.iterator();
//        int i = 0;
//        while (r.hasNext()) {
//            String R = r.next();
//            res[i] = R;
//            i++;
//        }
        for(int i=0;i<tmp.size();i++)
            res[i]=tmp.get(i);
        return res;
    }
}
