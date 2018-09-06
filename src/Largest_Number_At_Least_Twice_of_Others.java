import java.util.Arrays;

public class Largest_Number_At_Least_Twice_of_Others {
    public static void main(String[] args){
//        int[] nums={3, 6, 1, 0};
//        int[] nums={1,2,3,4};
        int[] nums={0,0,0,1};
        System.out.print(dominantIndex(nums));
    }
    public static int dominantIndex(int[] nums) {
        int k=nums.length;
        if(k<=1)
            return 0;
        int[] tmp=new int[k];
        int flag=-1;
        for(int i=0;i<k;i++)
            tmp[i]=nums[i];
        Arrays.sort(nums);
        int Max=nums[k-1];
        int SecMax=nums[k-2];
        for(int i=k-2;i>0;i--){
            if(nums[i]!=Max){
                SecMax=nums[i];
                break;
            }
        }
        if(SecMax==0&&Max!=0){
            for(int i=0;i<k;i++){
                if(tmp[i]==Max){
                    flag=i;
                }
            }
            return flag;
        } else{
            if(Max/SecMax<2)
                return -1;
            else {
                for(int i=0;i<k;i++){
                    if(tmp[i]==Max){
                        flag=i;
                    }
                }
            }
            return flag;
        }
    }
}
