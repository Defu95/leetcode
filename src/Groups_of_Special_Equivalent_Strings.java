import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;

public class Groups_of_Special_Equivalent_Strings {
    public static void main(String[] args) {
//        String[] A = {"abc", "acb", "bac", "bca", "cab", "cba"};
//        String[] A={"a","b","c","a","c","c"};
//        String[] A = {"abcd", "cdab", "adcb", "cbad"};
        String[] A = {"aa", "bb", "ab", "ba"};
        System.out.print(numSpecialEquivGroups(A));
    }

    public static int numSpecialEquivGroups(String[] A) {
        HashSet<String> set = new HashSet<>();
        for (String s : A) {
            char[] even = new char[(s.length() + 1) / 2];
            char[] odd = new char[s.length() - (s.length() + 1) / 2];
            for (int i = 0; i < s.length(); i++) {
                if (i % 2 == 0)
                    even[(i + 1) / 2] = s.charAt(i);
                else
                    odd[i / 2] = s.charAt(i);
            }
            Arrays.sort(even);
            Arrays.sort(odd);
            String tmp = new String(even) + new String(odd);
            set.add(tmp);
        }
        return set.size();
    }
}
