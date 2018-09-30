import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Find_the_Difference {
    public static void main(String[] args) {
        String s = "abcd";
        String t = "abcde";
        System.out.print(findTheDifference(s, t));
    }

    public static char findTheDifference(String s, String t) {
        HashMap<Character, Integer> map1 = new HashMap<>();
        HashMap<Character, Integer> map2 = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map1.containsKey(s.charAt(i)))
                map1.put(s.charAt(i), map1.get(s.charAt(i)) + 1);
            else
                map1.put(s.charAt(i), 1);
        }
        for (int i = 0; i < t.length(); i++) {
            if (map2.containsKey(t.charAt(i)))
                map2.put(t.charAt(i), map2.get(t.charAt(i)) + 1);
            else
                map2.put(t.charAt(i), 1);
        }
        Iterator<Map.Entry<Character, Integer>> iterator = map2.entrySet().iterator();
        char c = ' ';
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> entry = iterator.next();
            if (map1.containsKey(entry.getKey())) {
                if (map1.get(entry.getKey()) != entry.getValue()) {
                    c = entry.getKey();
                    break;
                }
            } else {
                c = entry.getKey();
                break;
            }
        }
        return c;
    }
}
