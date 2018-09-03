import static java.lang.Integer.min;

public class Non_decreasing_Array {
    public static void main(String[] args){
//        int[] test={2,3,3,2,4};
//        int[] test={1,3,4,2,5};
//        int[] test={4,2,1};
        int[] test={1,2,3,5,4,4};
//        int[] test={3,4,2,3};
        System.out.print(checkPossibility(test));
    }
    public static boolean checkPossibility(int[] nums) {
        int l=nums.length,i,flag=-1;
        for(i=1;i<=l-1;i++){
            if(nums[i]<nums[i-1]){
                if(flag==1) return false;
                if(i==1||nums[i]>=nums[i-2])
                    nums[i-1]=nums[i];
                else
                    nums[i]=nums[i-1];
                flag=1;
            }
        }
        return true;
    }
}
