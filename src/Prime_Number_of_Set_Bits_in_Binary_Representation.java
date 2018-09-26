public class Prime_Number_of_Set_Bits_in_Binary_Representation {
    public static void main(String[] args) {
        System.out.print(countPrimeSetBits(10, 15));
    }

    public static int countPrimeSetBits(int L, int R) {
        int result = 0;
        for (int i = L; i <= R; i++) {
            int count = Integer.bitCount(i);
            if (count > 1 && isprime(count))
                result++;
        }
        return result;
    }

    public static boolean isprime(int a) {
        for (int i = 2; i <= a / i; i++)
            if (a % i == 0)
                return false;
        return true;
    }
}
