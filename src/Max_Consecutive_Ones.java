public class Max_Consecutive_Ones {
    public static void main(String[] args){
//        int[] nums={1,1,0,1,1,1,0};
        int[] nums={0,1};
        System.out.print(findMaxConsecutiveOnes(nums));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int count=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]==1){
                int tmp=1;
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=0){
                        tmp++;
                        i=j;
                    }else
                        break;
                }
                if(tmp>count)
                    count=tmp;
            }
        }
        return count;
    }
}
