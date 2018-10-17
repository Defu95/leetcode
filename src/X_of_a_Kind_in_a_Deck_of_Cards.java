import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class X_of_a_Kind_in_a_Deck_of_Cards {
    public static void main(String[] args) {
        int[] deck = {1, 1, 1, 2, 2, 2, 2, 2};
        System.out.print(hasGroupsSizeX(deck));
    }

    public static boolean hasGroupsSizeX(int[] deck) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : deck)
            map.put(a, map.getOrDefault(a, 0) + 1);
        Iterator<Map.Entry<Integer, Integer>> iterator = map.entrySet().iterator();
        int flag = -1, gy = -1;
        while (iterator.hasNext()) {
            Map.Entry<Integer, Integer> it = iterator.next();
            if (it.getValue() <= 1)
                return false;
            if (flag == -1)
                flag = it.getValue();
            else {
                flag = gcd(flag, it.getValue());
            }
        }
        return flag > 1;
    }

    public static int gcd(int x, int y) {
        if (x % y == 0) return y;
        return gcd(y, x % y);
    }
}
