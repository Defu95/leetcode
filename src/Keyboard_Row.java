import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Keyboard_Row {
    public static void main(String[] args) {
        String[] test = {"Hello", "Alaska", "Dad", "Peace"};
        System.out.print(findWords(test));
    }

    public static String[] findWords(String[] words) {
        char[] row1 = {'q', 'w', 'e', 'r', 't', 'y', 'u', 'i', 'o', 'p'};
        char[] row2 = {'a', 's', 'd', 'f', 'g', 'h', 'j', 'k', 'l'};
        char[] row3 = {'z', 'x', 'c', 'v', 'b', 'n', 'm'};
        List<Integer> result = new ArrayList<>();
        HashMap<Character, Integer> map = new HashMap<>();
        for (char ch : row1)
            map.put(ch, 1);
        for (char ch : row2)
            map.put(ch, 2);
        for (char ch : row3)
            map.put(ch, 3);
        int c = 0;
        for (String s : words) {
            int flag = -1;
            s = s.toLowerCase();
            for (int i = 0; i < s.length() - 1; i++) {
                if (map.get(s.charAt(i + 1)) != map.get(s.charAt(i))) {
                    flag = 1;
                    break;
                }
            }
            if (flag == -1)
                result.add(c);
            c++;
        }
        String[] res = new String[result.size()];
        for (int i = 0; i < result.size(); i++)
            res[i] = words[result.get(i)];
        return res;
    }
}
