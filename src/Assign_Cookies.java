import java.util.Arrays;

public class Assign_Cookies {
    public static void main(String[] args) {
        int[] g = {1, 2, 3};
        int[] s = {1, 1};
        System.out.print(findContentChildren(g, s));
    }

    public static int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int res = 0, j = 0;
        for (int i = 0; i < g.length; i++) {
            if (j < s.length && g[i] <= s[j]) {
                res++;
                j++;
            } else {
                while (j < s.length) {
                    if (g[i] > s[j])
                        j++;
                    else {
                        res++;
                        j++;
                        break;
                    }
                }
            }
        }
        return res;
    }
}
