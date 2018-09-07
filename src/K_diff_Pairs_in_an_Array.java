import java.util.HashSet;

public class K_diff_Pairs_in_an_Array {
    public static void main(String[] args){
        int[] nums={3, 1, 4, 1, 5};int  k = 2;
//        int[] nums={1, 3, 1, 5, 4}; int k = 0;
//        int[] nums={1, 2, 3, 4, 5}; int k = 3;
        System.out.print(findPairs(nums,k));
    }

    public static int findPairs(int[] nums, int k) {
        HashSet<Integer> set=new HashSet<>();
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(set.contains(k+nums[i])||set.contains(nums[i]-k)){
                count++;
                if(!set.contains(nums[i]))
                    set.add(nums[i]);
            }  else{
                if(!set.contains(nums[i]))
                    set.add(nums[i]);
            }
        }
        return count;
//        for(int i=0;i<nums.length-1;i++){
////            if(i+1<nums.length){
//                for(int j=i+1;j<nums.length;j++)
//                    if((nums[i]-nums[j]==k)||(nums[j]-nums[i]==k))
//                        count++;
////            }
//        }
//        return count;
    }
}
