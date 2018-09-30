import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Letter_Case_Permutation {
    public static void main(String[] args) {
        String s = "12a";
        List<String> t = letterCasePermutation(s);
        Iterator<String> iterator = t.iterator();
        while (iterator.hasNext()) {
            String it = iterator.next();
            System.out.print(it + " ");
        }
    }

    public static List<String> letterCasePermutation(String S) {
        List<String> res = new ArrayList<>();
        if (S.length() <= 0)
            return res;
        char[] ch = S.toCharArray();
        Low_Captical(ch, res, 0);
        return res;
    }

    public static void Low_Captical(char[] ch, List<String> res, int i) {
        if (i == ch.length) {
            res.add(new String(ch));
            return;
        } else {
            if (!Character.isDigit(ch[i])) {
                ch[i] = Character.toLowerCase(ch[i]);
                Low_Captical(ch, res, i + 1);
                ch[i] = Character.toUpperCase(ch[i]);
                Low_Captical(ch, res, i + 1);
            } else {
                Low_Captical(ch, res, i + 1);
            }
        }
    }
}
