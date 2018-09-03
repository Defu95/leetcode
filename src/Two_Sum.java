import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Two_Sum {
    public static void main(String[] args){
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] res=twoSum(nums,target);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]);
    }

    public static int[] twoSum(int[] nums, int target) {
        Map<Integer, Integer> map = new HashMap<>();
        for(int i=0; i<nums.length; i++){
            int complement = target - nums[i];
            if(map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
            map.put(nums[i], i);
        }
        throw new IllegalArgumentException("no two sum solution found");
    }
}
