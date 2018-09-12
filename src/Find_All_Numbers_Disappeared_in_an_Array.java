import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Find_All_Numbers_Disappeared_in_an_Array {
    public static void main(String[] args){
//        int[] nums={4,3,3,7,8,2,3,3};
        int[] nums={1,1,2,2};
        System.out.println(findDisappearedNumbers(nums));
    }
    public static List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> res=new ArrayList<>();
        if(nums.length<=0)
            return res;
        Arrays.sort(nums);
        if(nums[0]!=1){
            int j=1;
            while (j<nums[0]){
                res.add(j);
                j++;
            }
        }
        for(int i=1;i<nums.length;i++)
            if(nums[i]!=nums[i-1]&&nums[i]!=nums[i-1]+1) {
                int j = 1;
                while (nums[i - 1] + j < nums[i]) {
                    res.add(nums[i - 1] + j);
                    j++;
                }
            }
        if(nums[nums.length-1]!=nums.length){
            int j=1;
            while (nums[nums.length-1]+j<=nums.length){
                res.add(j+nums[nums.length-1]);
                j++;
            }
        }
        return res;
    }
}
