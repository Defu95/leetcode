import java.lang.reflect.Array;
import java.util.Arrays;

public class Smallest_Range_I {
    public static void main(String[] args) {
        int[] A = {0, 10};
        int K = 2;
        System.out.println(smallestRangeI(A, K));
    }

    public static int smallestRangeI(int[] A, int K) {
        if (A.length == 0)
            return 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int a : A) {
            if (a > max)
                max = a;
            if (a < min)
                min = a;
        }
        int len = A.length;
        if (min + K >= max - K)
            return 0;
        else {
            return (max - 2 * K - min);
        }
    }
}
