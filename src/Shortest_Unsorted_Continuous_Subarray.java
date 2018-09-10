import java.util.Arrays;

public class Shortest_Unsorted_Continuous_Subarray {
    public static void main(String[] args){
        int[] nums={2, 6, 4, 8, 10, 9, 15};
//        int[] nums={5,4,3,2,1};
//        int[] nums={2,1};
        System.out.print(findUnsortedSubarray(nums));
    }

    public static int findUnsortedSubarray(int[] nums) {
        int[] tmp=new int[nums.length];
        for(int i=0;i<nums.length;i++)
            tmp[i]=nums[i];
        Arrays.sort(tmp);
        int left=0,right=nums.length-1;
        while (left<nums.length-1){
            if(nums[left]==tmp[left])
                left++;
            else
                break;
        }
        while(right>0){
            if(nums[right]==tmp[right])
                right--;
            else
                break;
        }
        if(left>=right)
            return 0;
        else
            return right-left+1;
    }
}
