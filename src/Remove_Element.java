public class Remove_Element {
    public static void main(String[] args){
        int[] arr={3,2,2,3};
        int a=removeElement(arr,3);
        System.out.print(a);
    }
    public static int removeElement(int[] nums, int val) {
        if(nums.length==0)
            return 0;
        int a=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]!=val){
                nums[a]=nums[i];
                a++;
            }
//                a++;
        }
        return a;
    }
}
