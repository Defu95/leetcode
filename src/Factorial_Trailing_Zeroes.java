public class Factorial_Trailing_Zeroes {
    public static void main(String[] args) {
        System.out.print(trailingZeroes(25));
        //只需要判断质子中5的个数就行。  0有2*5产生，但是质子中2的个数始终小于5的个数
    }

    public static int trailingZeroes(int n) {
        int res = 0;
        while (n > 0) {
            res += n / 5;
            n /= 5;
        }
        return res;
    }
}
