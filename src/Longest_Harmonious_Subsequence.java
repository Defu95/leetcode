import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Longest_Harmonious_Subsequence {
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 5, 2, 3, 7};
        System.out.print(findLHS(nums));
    }

    public static int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int a : nums)
            map.put(a, map.getOrDefault(a, 0) + 1);
        int res = 0;
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
            int tmp = entry.getKey();
            if (map.containsKey(tmp + 1))
                res = Math.max(entry.getValue() + map.get(tmp + 1), res);
        }
        return res;
    }
}
