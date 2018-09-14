import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

public class Degree_of_an_Array {
    public static void main(String[] args) {
//        int[] nums = {1, 2, 2, 3, 1, 4, 2};
        int[] nums = {1, 2, 2, 3, 1};
        System.out.print(findShortestSubArray(nums));
    }

    public static int findShortestSubArray(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : nums) {
            if (!map.containsKey(a))
                map.put(a, 1);
            else {
                int c = map.get(a);
                map.put(a, c + 1);
            }
        }
        Collection<Integer> collect = map.values();
        int maxfre = Collections.max(collect);
        int num = -1;
        for (Map.Entry<Integer, Integer> ent : map.entrySet())
            if (ent.getValue() == maxfre) {
                if (num == -1)
                    num = findsub(nums, ent.getKey());
                else
                    num = Math.min(num, findsub(nums, ent.getKey()));
            }
        return num;
    }

    public static int findsub(int[] nums, int num) {
        int left = 0, right = nums.length - 1;
        while (nums[left] != num)
            left++;
        while (nums[right] != num)
            right--;
        return right - left + 1;
    }
}
