public class onebit_and_2bit_Characters {
    public static void main(String[] args) {
        int[] bits = {1, 1, 1, 0, 0};
        System.out.print(isOneBitCharacter(bits));
    }

    public static boolean isOneBitCharacter(int[] bits) {
        int p = 0;
        while (p < bits.length - 1) {
            if (bits[p] == 1)
                p += 2;
            else
                p++;
        }
        return p == bits.length ? false : true;
    }
}
