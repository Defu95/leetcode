public class Move_Zeroes {
    public static void main(String[] args){
        int[] nums={0,1,0,3,0,12};
        moveZeroes(nums);
        for(int i=0;i<nums.length;i++)
            System.out.print(nums[i]);
    }
    public static void moveZeroes(int[] nums) {
        for(int i=0;i<nums.length-1;i++){
            if(nums[i]==0){
                for(int j=i+1;j<nums.length;j++){
                    if(nums[j]!=0){
                        nums[i]=nums[i]+nums[j];
                        nums[j]=nums[i]-nums[j];
                        nums[i]=nums[i]-nums[j];
                        break;
                    }
                }
            }
        }
    }
}
