public class Longest_Continuous_Increasing_Subsequence {
    public static void main(String[] args){
        int[] nums={1,3,5,7,1,2,3,4,5,6};
//        int[] nums={1,2,3,4,2,5};
//        int[] nums={1,1,1};
        System.out.print(findLengthOfLCIS(nums));
    }
    public static int findLengthOfLCIS(int[] nums) {
        int l=nums.length;
        if(l<1)
            return 0;
//        int maxlen=1;
//        for(int i=0;i<l;i++){
//            for(int j=i+1;j<l;j++) {
//                if (nums[j] <= nums[j - 1]) {
//                    maxlen = Math.max(maxlen, j - i);
//                    i = j-1 ;
//                    break;
//                }
//                if(j==l-1)
//                    maxlen=Math.max(maxlen,j-i+1);
//            }
//        }
        int maxlen=0,start=0;
        for(int i=1;i<l;i++){
            if(nums[i]<=nums[i-1]){
                maxlen=Math.max(maxlen,i-start);
                start=i;
            }
        }
        return Math.max(maxlen,l-start);
    }
}
