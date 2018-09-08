import java.util.Arrays;

public class Kth_Largest_Element_in_an_Array {
    public static void main(String[] args){
//        int[] nums={3,2,3,1,2,4,5,5,6};
//        int k = 4;
        int[] nums={3,2,1,5,6,4};
        int k = 2;
        System.out.print(findKthLargest(nums,k));
    }

    public static int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
