public class Reverse_Bits {
    public static void main(String[] args) {
        System.out.print(reverseBits(1));
    }

    // you need treat n as an unsigned value
    public static int reverseBits(int n) {
        int res = 0;
        for (int i = 0; i < 32; i++, n >>= 1) {
            res = res | (n & 1) << (31 - i);
        }
        return res;
    }
}
