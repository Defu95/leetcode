import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Positions_of_Large_Groups {
    public static void main(String[] args) {
        String s = "abcdddeeeeaabbbcd";
        List<List<Integer>> res = largeGroupPositions(s);
        Iterator<List<Integer>> it = res.iterator();
        while (it.hasNext()) {
            Iterator<Integer> iter = it.next().iterator();
            while (iter.hasNext())
                System.out.print(iter.next() + " ");
            System.out.println();
        }
    }

    public static List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> res = new ArrayList<>();
        if (S.length() < 3)
            return res;
        int start = 0;
        for (int i = 1; i < S.length(); i++) {
            if (S.charAt(i) != S.charAt(i - 1)) {
                if (i - start >= 3) {
                    List<Integer> tmp = new ArrayList<>();
                    tmp.add(start);
                    tmp.add(i - 1);
                    res.add(tmp);
                    start = i;
                } else {
                    start = i;
                }
            }
        }
        if (S.length() - 1 - start >= 2) {
            List<Integer> tmp = new ArrayList<>();
            tmp.add(start);
            tmp.add(S.length() - 1);
            res.add(tmp);
        }
        return res;
    }
}
