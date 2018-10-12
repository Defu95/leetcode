import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Binary_Watch {
    public static void main(String[] args) {
        List<String> res = readBinaryWatch(18);
        Iterator<String> iterator = res.iterator();
        while (iterator.hasNext()) {
            String it = iterator.next();
            System.out.print(it + "  ");
        }
    }

    public static List<String> readBinaryWatch(int num) {
        List<String> res = new ArrayList<>();
        for (int i = 0; i < 12; i++) {
            for (int j = 0; j < 60; j++) {
                String tmp = "";
                if (countone(i & 15) + countone(j & 63) == num) {
                    if (j < 10)
                        tmp = String.valueOf(i) + ":0" + String.valueOf(j);
                    else
                        tmp = String.valueOf(i) + ":" + String.valueOf(j);
                    res.add(tmp);
                }
            }
        }
        return res;
    }

    public static int countone(int n) {
        if (n == 0)
            return 0;
        int count = 0;
        while (n > 0) {
            if (n % 2 == 1)
                count++;
            n /= 2;
        }
        return count;
    }
}
