import java.util.Arrays;
import java.util.HashMap;

public class Relative_Ranks {
    public static void main(String[] args) {
        int[] nums = {5, 4, 3, 2, 1};
        String[] res = findRelativeRanks(nums);
        for (String s : res)
            System.out.print(s + " ");
    }

    public static String[] findRelativeRanks(int[] nums) {
        int[] tmp = new int[nums.length];
        for (int j = 0; j < nums.length; j++)
            tmp[j] = nums[j];
        Arrays.sort(tmp);
        HashMap<Integer, Integer> map = new HashMap<>();
        int i = nums.length;
        for (int t : tmp) {
            map.put(t, i);
            i--;
        }
        String[] res = new String[nums.length];
        for (int j = 0; j < nums.length; j++) {
            if (map.get(nums[j]) == 1)
                res[j] = "Gold Medal";
            else if (map.get(nums[j]) == 2)
                res[j] = "Silver Medal";
            else if (map.get(nums[j]) == 3)
                res[j] = "Bronze Medal";
            else
                res[j] = String.valueOf(map.get(nums[j]));
        }
        return res;
    }
}
