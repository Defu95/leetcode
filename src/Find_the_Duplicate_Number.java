public class Find_the_Duplicate_Number {
    public static void main(String[] agrs){
        int[] nums={1,3,4,2,2};
        System.out.print(findDuplicate(nums));
    }
    public static int findDuplicate(int[] nums) {
        int low = 1, high = nums.length- 1;
        while (low < high) {
            int mid=low+(high-low)/2;
            int count=0;
            for(int a: nums){
                if(a<=mid)
                    count++;
            }
            if(count<=mid)
                low=mid+1;
            else high=mid;
        }
        return low;
    }
}
