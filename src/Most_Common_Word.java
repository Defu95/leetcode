import java.util.*;

public class Most_Common_Word {
    public static void main(String[] args) {
        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String[] banned = {"hit"};
//        String paragraph = "a, a, a, a, b,b,b,c, c";
//        String[] banned = {"a"};
        System.out.print(mostCommonWord(paragraph, banned));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {
        int flag = 0, isch = -1;
        List<String> list = new ArrayList<>();
        for (int i = 0; i < paragraph.length(); i++) {
            if (Character.isLetter(paragraph.charAt(i)) && isch == -1) {
                flag = i;
                isch = 1;
            } else {
                if (!Character.isLetter(paragraph.charAt(i)) && isch != -1) {
                    list.add(paragraph.substring(flag, i));
                    isch = -1;
                }
            }
        }
        if (Character.isLetter(paragraph.charAt(paragraph.length() - 1)))
            list.add(paragraph.substring(flag));
        HashMap<String, Integer> map = new HashMap<>();
        for (int i = 0; i < list.size(); i++) {
            String st = list.get(i).toLowerCase();
            map.put(st, map.getOrDefault(st, 0) + 1);
        }
        HashSet<String> set = new HashSet<>();
        for (String s : banned)
            set.add(s);
        String res = null;
        int max = 0;
        Iterator<Map.Entry<String, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<String, Integer> entry = iterator.next();
            if (!set.contains(entry.getKey())) {
                if (entry.getValue() > max) {
                    max = entry.getValue();
                    res = entry.getKey();
                }
            }
        }
        return res;
    }
}
