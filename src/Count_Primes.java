public class Count_Primes {
    public static void main(String[] args) {
        System.out.print(countPrimes(10));
    }

    public static int countPrimes(int n) {
//        int count = 0;
//        for (int i = 2; i < n; i++) {
//            if (sushu(i))
//                count++;
//        }
//        return count;
//    }
//
//    public static boolean sushu(int n) {
//        for (int i = 2; i <= n / i; i++) {
//            if (n % i == 0)
//                return false;
//        }
//        return true;
        if (n < 2) {
            return 0;
        }
        boolean[] notPrime = new boolean[n];
        int res = 0;
        for (int i = 2; i < n; i++) {
            if (notPrime[i] == false) {
                res++;
                if (i > Math.sqrt(n)) {
                    continue;
                }
                for (int j = i; i * j < n; j++) {
                    notPrime[i * j] = true;
                }
            }
        }
        return res;
    }
}
