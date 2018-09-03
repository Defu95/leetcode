public class Search_Insert_Position {
    public static void main(String[] args){
        int[] nums={1,3,5,6};
        int target=7;
        System.out.print(searchInsert(nums,target));
    }

    public static int searchInsert(int[] nums, int target) {
        if(target<nums[0])
            return 0;
        if(target>nums[nums.length-1])
            return nums.length;
        int flag=-1;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>=target){
                flag=i;
                break;
            }
        }
        return flag;
    }
}
