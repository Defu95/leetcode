import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Longest_Palindrome {
    public static void main(String[] args) {
        String s="abccccdd";
        System.out.print(longestPalindrome(s));
    }

    public static int longestPalindrome(String s) {
        HashMap<Character, Integer> map = new HashMap<>();
        for (int i = 0; i < s.length(); i++) {
            if (map.containsKey(s.charAt(i)))
                map.put(s.charAt(i), map.get(s.charAt(i)) + 1);
            else
                map.put(s.charAt(i), 1);
        }
        int flag = -1, res = 0;
        Iterator<Map.Entry<Character, Integer>> iterator = map.entrySet().iterator();
        while (iterator.hasNext()) {
            Map.Entry<Character, Integer> it = iterator.next();
            if (it.getValue() % 2 == 0)
                res += it.getValue();
            else {
                res += it.getValue() - 1;
                flag = 1;
            }
        }
        return flag == 1 ? res += 1 : res;
    }
}
