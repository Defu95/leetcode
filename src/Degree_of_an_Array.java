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
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int a : nums) {
//            if (!map.containsKey(a))
//                map.put(a, 1);
//            else {
//                int c = map.get(a);
//                map.put(a, c + 1);
//            }
//        }
//        Collection<Integer> collect = map.values();
//        int maxfre = Collections.max(collect);
//        int num = -1;
//        for (Map.Entry<Integer, Integer> ent : map.entrySet())
//            if (ent.getValue() == maxfre) {
//                if (num == -1)
//                    num = findsub(nums, ent.getKey());
//                else
//                    num = Math.min(num, findsub(nums, ent.getKey()));
//            }
//        return num;
//    }
//
//    public static int findsub(int[] nums, int num) {
//        int left = 0, right = nums.length - 1;
//        while (nums[left] != num)
//            left++;
//        while (nums[right] != num)
//            right--;
//        return right - left + 1;
//    }
        HashMap<Integer, int[]> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (!map.containsKey(nums[i])) {
                map.put(nums[i], new int[]{1, i, i});
            } else {
                int tmp[] = map.get(nums[i]);
                tmp[0]++;
                tmp[2] = i;
                map.put(nums[i], tmp);
            }
        }
        int num = -1, degree = 0;
        for (Map.Entry<Integer, int[]> ent : map.entrySet()) {
            if (ent.getValue()[0] > degree) {
                degree = ent.getValue()[0];
                num = ent.getValue()[2] - ent.getValue()[1] + 1;
            } else if (ent.getValue()[0] == degree) {
                num = Math.min(num, ent.getValue()[2] - ent.getValue()[1] + 1);
            }
        }
        return num;
    }
}
