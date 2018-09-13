import java.util.HashMap;

public class Majority_Element {
    public static void main(String[] args) {
        int[] nums = {2, 2, 1, 1, 1, 2, 2};
        System.out.print(majorityElement(nums));
    }

    public static int majorityElement(int[] nums) {
        if (nums.length <= 0)
            return 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            if (!map.containsKey(a))
                map.put(a, 1);
            else {
                int c = map.get(a);
                if (c >= nums.length / 2)
                    return a;
                map.put(a, c + 1);
            }
        }
        return nums[0];
    }
}
