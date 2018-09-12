public class Maximum_Average_Subarray_I {
    public static void main(String[] args){
        int[] nums={1,12,-5,-6,50,3};
        int k = 4;
//        int[] nums={1};
//        int k=1;
        System.out.print(findMaxAverage(nums,k));
    }

    public static double findMaxAverage(int[] nums, int k) {
        int max=0;
        for(int i=0;i<k;i++)
            max+=nums[i];
        int tmp=max;
        for(int i=k;i<nums.length;i++){
            tmp+=nums[i];
            tmp-=nums[i-k];
            max=Math.max(max,tmp);
        }
        return (double)max/k;
    }
}
