public class Maximum_Subarray {
    public static void main(String[] args){
//        int[] nums= {-2,1,-3,4,-1,2,1,-5,4};
        int[] nums={-1,-2,-3};
        System.out.print(maxSubArray(nums));
    }
    public static int maxSubArray(int[] nums) {
        int maxsum=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            maxsum= nums[i]>maxsum? nums[i]:maxsum;
            int tmp=nums[i];
            for(int j=i+1;j<nums.length;j++){
                tmp+=nums[j];
                maxsum= tmp>maxsum? tmp:maxsum;
            }
        }
        return maxsum;
    }
}
