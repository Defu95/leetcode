public class Nth_Digit {
    public static void main(String[] args) {
        System.out.print(findNthDigit(3));
    }

    public static int findNthDigit(int n) {
//        long digitcount = 9;
//        int times = 1;
//        int start = 1;
//        while (n > digitcount * times) {
//            n -= times * digitcount;
//            digitcount *= 10;
//            start *= 10;
//            times++;
//        }
//        start +=  (n - 1) / times;
//        return ((int) Integer.toString(start).charAt((n - 1) % times) - (int) '0');
        long count = 9;
        int start = 1, len = 1;
        while (n > len * count) {
            n -= len * count;
            count *= 10;
            start *= 10;
            len++;
        }
        start += (n - 1) / len;
        return ((int) Integer.toString(start).charAt((n - 1) % len) - (int) '0');
    }
}
