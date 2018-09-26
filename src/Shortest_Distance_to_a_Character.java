import java.util.ArrayList;
import java.util.List;

public class Shortest_Distance_to_a_Character {
    public static void main(String[] args) {
        String s = "loveleetcode";
        int[] res = shortestToChar(s, 'e');
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }

    public static int[] shortestToChar(String S, char C) {
        List<Integer> dic = new ArrayList<>();
        for (int i = 0; i < S.length(); i++)
            if (S.charAt(i) == C)
                dic.add(i);
        int[] res = new int[S.length()];
        for (int i = 0; i < S.length(); i++) {
            int count = Integer.MAX_VALUE;
            for (int j = 0; j < dic.size(); j++) {
                int t = dic.get(j) - i;
                if (t >= 0 && t < count)
                    count = t;
                if (-1 * t >= 0 && -1 * t < count)
                    count = -1 * t;
            }
            res[i] = count;
        }
        return res;
    }
}
