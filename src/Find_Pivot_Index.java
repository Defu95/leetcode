public class Find_Pivot_Index {
    public static void main(String[] args){
        int[] nums={1, 7, 3, 6, 5, 6};
//        int[] nums={-1,-1,-1,-1,-1,-1};
        System.out.print(pivotIndex(nums));
    }

    public static int pivotIndex(int[] nums) {
        if(nums.length<=2)
            return -1;
        int sum=0,tmp=0;
        for( int a : nums)
            sum+=a;
        for(int i=0;i<nums.length;i++){
            if(sum-nums[i]==2*tmp)
                return i;
            tmp+=nums[i];
        }
        return -1;
    }
}
