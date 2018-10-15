public class Perfect_Number {
    public static void main(String[] args) {
        System.out.print(checkPerfectNumber(28));
    }

    public static boolean checkPerfectNumber(int num) {
        if (num <= 0)
            return false;
        int res = 0;
        for (int i = 1; i < num / i; i++) {
            if (num % i == 0) {
                res += i;
                res += num / i;
            }
        }
        return res / 2 == num;
    }
}
