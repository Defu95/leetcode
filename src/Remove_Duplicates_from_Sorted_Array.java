public class Remove_Duplicates_from_Sorted_Array {
    public static void main(String[] args){
        int[] arr={0,0,1,1,1,2,2,3,3,4};
        int a=removeDuplicates(arr);
        System.out.print(a);
    }

    public static int removeDuplicates(int[] nums) {
        int n=nums.length;
        if(n<=1)
            return n;
        int a=0;
        for(int i=1;i<n;i++){
            if(nums[i]!=nums[a]){
                a++;
                nums[a]=nums[i];
            }
        }
        return a+1;
    }
}
