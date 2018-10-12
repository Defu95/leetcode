import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;

public class Longest_Word_in_Dictionary {
    public static void main(String[] args) {
//        String[] words = {"w", "wo", "wor", "worl", "world"};
//        String[] words = {"m", "mo", "moc", "moch", "mocha", "l", "la", "lat", "latt", "latte", "c", "ca", "cat"};
        String[] words = {"t", "ti", "tig", "tige", "tiger", "e", "en", "eng", "engl", "engli", "englis", "english", "h", "hi", "his", "hist", "histo", "histor", "history"};
        System.out.print(longestWord(words));
    }

    public static String longestWord(String[] words) {
        Arrays.sort(words);
        String st = "";
        int maxlen = 0;
        HashSet<String> set = new HashSet<>();
//        for (String s : words) {
//            if (s.length() <= 1) {
//                if (maxlen < 1) {
//                    if(st=="")
//                        st=s;
//                    else if (st.charAt(0) - s.charAt(0) > 0)
//                        st = s;
//                }
//                set.add(s);
//            } else {
//                String tmp = s.substring(0, s.length() - 1);
//                if (set.contains(tmp)) {
//                    if (s.length() > maxlen) {
//                        st = s;
//                        maxlen = s.length();
//                    } else if (s.length() == maxlen) {
//                        for (int i = 0; i < s.length(); i++) {
//                            if (s.charAt(i) - st.charAt(i) < 0) {
//                                st = s;
//                                break;
//                            } else if (s.charAt(i) - st.charAt(i) > 0)
//                                break;
//                        }
//                    }
//                    set.add(s);
//                }
//            }
//        }
        for (String s : words) {
            if (s.length() == 1 || set.contains(s.substring(0, s.length() - 1))) {
                if (s.length() == 1)
                    set.add(s);
                if (s.length() > st.length())
                    st = s;
                set.add(s);
            }
        }
        return st;
    }
}
