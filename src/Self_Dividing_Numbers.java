import java.util.LinkedList;
import java.util.List;

public class Self_Dividing_Numbers {
    public static void main(String[] args) {
        List<Integer> test = selfDividingNumbers(1, 22);
        System.out.print(test);
    }

    public static List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> res = new LinkedList<>();
        for (int i = left; i <= right; i++)
            if (isSDN(i))
                res.add(i);
        return res;
    }

    public static boolean isSDN(int num) {
        String s = Integer.toString(num);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '0')
                return false;
            if (num % (s.charAt(i) - '0') != 0)
                return false;
        }
        return true;
    }
}
