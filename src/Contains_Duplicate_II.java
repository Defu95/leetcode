import java.util.HashSet;

public class Contains_Duplicate_II {
    public static void main(String[] args){
//        int[] nums = {1,2,3,1}; int k=3;
//        int [] nums = {3,0,2,1}; int  k = 1;
//        int[] nums = {1,2,3,1,2,3}; int k = 2;
//        int[] nums={99,1,99}; int k=2;
//        int[] nums={1};int k=1;
        int[] nums={1,2,3,4,5,6,7,8,9,9}; int k=3;
        System.out.print(containsNearbyDuplicate(nums,k));
    }
    public static boolean containsNearbyDuplicate(int[] nums, int k) {
        if(nums.length==0)
            return false;
        if(k>nums.length)
            k=nums.length-1;
//            return false;
//        if(k>=1&&nums.length==1)
//            return false;
        if(k==nums.length){
            HashSet<Integer> set=new HashSet<>();
            for(int i=0;i<k;i++)
                if(!set.contains(nums[i]))
                    set.add(nums[i]);
            if(set.size()<k)
                return true;
        }else{
            for(int i=0;i<nums.length;i++){
                for(int j=1;j<=k;j++){
                    if(i+j>nums.length-1)
                        break;
                    if(nums[i]==nums[i+j])
                        return true;
                }
            }
        }
        return false;
    }
}
