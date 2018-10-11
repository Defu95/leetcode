import java.util.HashSet;

public class Happy_Number {
    public static void main(String[] args) {
        System.out.print(isHappy(1111111));
    }

    public static boolean isHappy(int n) {
        HashSet<Integer> set = new HashSet<>();
        while (n != 1) {
            String num = String.valueOf(n);
            int tmp = 0;
            for (int i = 0; i < num.length(); i++)
                tmp += Math.pow(num.charAt(i) - '0', 2);
            if (set.contains(tmp))
                return false;
            else {
                set.add(tmp);
                n = tmp;
            }
        }
        return true;
    }
}
