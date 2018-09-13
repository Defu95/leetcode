public class Missing_Number {
    public static void main(String[] args) {
        int[] nums = {3, 0, 1};
        System.out.print(missingNumber(nums));
    }

    public static int missingNumber(int[] nums) {
        int sum = 0;
        for (int a : nums)
            sum += a;
        return (nums.length) * (nums.length + 1) / 2 - sum;
    }
}
