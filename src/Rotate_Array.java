public class Rotate_Array {

    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
        int k = 3;
//        int[] nums={-1,-100,3,99};
//        int k = 4;
        rotate3(nums,k);
        int i=0;
        while (i<nums.length){
            System.out.print(nums[i]+" ");
            i++;
        }
    }

    public static void rotate1(int[] nums, int k) {
        k=nums.length-k%nums.length;
        if(k==0)
            return;
        int[] tmp=new int[k];
        for(int i=0;i<k;i++)
            tmp[i]=nums[i];
        for(int i=0;i<nums.length-k;i++)
            nums[i]=nums[k+i];
        for(int i=0;i<k;i++)
            nums[i+nums.length-k]=tmp[i];
    }

    public static void rotate2(int[] nums,int k){
        k=nums.length-k%nums.length;
        if(k==0)
            return;
        while (k>0){
            int tmp=nums[0];
            for(int i=1;i<nums.length;i++)
                nums[i-1]=nums[i];
            nums[nums.length-1]=tmp;
            k--;
        }
    }

    public static void rotate3(int[] nums, int k){
        k=k%nums.length;
        if(k==0)
            return;
        while (k>0){
            for(int i=1;i<nums.length;i++){
                nums[i-1]=nums[i-1]^nums[i];
                nums[i]=nums[i]^nums[i-1];
                nums[i-1]=nums[i]^nums[i-1];
            }
            k--;
        }
    }
}
