import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;

public class Third_Maximum_Number {
    public static void main(String[] args){
//        int[] nums={2, 2, 3, 1};
        int[] nums={1,2,3};
        System.out.print(thirdMax(nums));

    }
    public static int thirdMax(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums.length;i++){
            if(!set.contains(nums[i]))
                set.add(nums[i]);
        }
        if(set.size()<3){
            Arrays.sort(nums);
            return nums[nums.length-1];
        }else{
            Iterator<Integer> it = set.iterator();
            int[] res=new int[set.size()];
            int k=0;
            while (it.hasNext()){
                res[k]=it.next();
                k++;
            }
            Arrays.sort(res);
            return res[res.length-3];
        }
    }
}
