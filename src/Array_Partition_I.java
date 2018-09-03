import java.sql.Array;
import java.util.Arrays;

import static java.lang.Integer.min;

public class Array_Partition_I {
    public static void main(String[] args){
        int[] arr = new int[]{1,3,2,4};
//        quicksort(arr, 0, arr.length - 1);
//        int i=0;
//        while(i<arr.length){
//            System.out.print(arr[i]+" ");
//            i++;
//        }
        System.out.print(arrayPairSum(arr));
    }

    public static int arrayPairSum(int[] nums) {
        int res=0;
//        quicksort(nums,0,nums.length-1);
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i+=2)
            res+=nums[i];
        return res;
//        Arrays.sort(nums);
    }
//
//    public static void quicksort(int[] nums,int begin,int end){
//        if(begin>=end||nums.length<=1)
//            return;
//        int p=nums[(begin+end)/2],i=begin,j=end;
//        while(i<= j){
//            while (nums[i]<p)
//                i++;
//            while (nums[j]>p)
//                j--;
//            if(i<j){
//                nums[i]=nums[i]^nums[j];
//                nums[j]=nums[j]^nums[i];
//                nums[i]=nums[i]^nums[j];
//                i++;
//                j--;
//            }else if(i==j){
//                i++;
//            }
//            quicksort(nums,begin,j);
//            quicksort(nums,i,end);
//        }
//    }
}
