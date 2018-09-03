import java.util.HashMap;

public class Set_Mismatch {
    public static void main(String[] args){
       int[] nums = {1,5,3,2,2,7,6,4,8,9};
       int[] res=new int[2];
       res=findErrorNums(nums);
       System.out.print(res[1]);
    }
    public static int[] findErrorNums(int[] nums) {
        int l=nums.length;
        int m=-1,n=2,flag=-1,count=0;
        HashMap<Integer,Integer> set1=new HashMap<>();
        for(int i=0;i<l;i++){
            if(!set1.containsKey(nums[i])) {
                set1.put(nums[i], i);
                count+=nums[i];
                if (nums[i] > m)
                    m = nums[i];
                if(nums[i]<n);
                    n=1;
            } else{
                flag=i;
                count+=nums[i];
            }
        }
        if(m<l)
            return new int[]{nums[flag],l};
        else{
            if(n>l)
                return new int[]{nums[flag],1};
            else
                return new int[]{nums[flag],(1+m)*m/2-count+nums[flag]};
        }
    }
}
