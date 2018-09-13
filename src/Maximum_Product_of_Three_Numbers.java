public class Maximum_Product_of_Three_Numbers {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 3, 4};
        int[] nums = {9, 1, 5, 6, 7, 2};
//        int[] nums={-1,-2,1,2,3};
//        int[] nums={-4,-3,-2,-1,60};
        System.out.print(maximumProduct(nums));
    }

    public static int maximumProduct(int[] nums) {
        int b1 = Integer.MIN_VALUE, b2 = Integer.MIN_VALUE, b3 = Integer.MIN_VALUE; //找出三个最大的数字
        int s1 = Integer.MAX_VALUE, s2 = Integer.MAX_VALUE;///找出两个最小的数字
        for (int a : nums) {
            if (a >= b3) {
                if (b2 > b1)
                    b1 = b2;
                if (b3 > b2)
                    b2 = b3;
                b3 = a;
            } else {
                if (a >= b2) {
                    if (b2 > b1)
                        b1 = b2;
                    b2 = a;
                } else {
                    if (a > b1)
                        b1 = a;
                }
            }
            if (a < s1) {
                if (s1 < s2)
                    s2 = s1;
                s1 = a;
            } else {
                if (a < s2)
                    s2 = a;
            }
        }
        return Math.max(b1 * b2 * b3, b3 * s1 * s2);
    }
}
