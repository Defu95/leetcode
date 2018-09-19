public class Next_Greater_Element_I {
    public static void main(String[] args) {
        int[] nums1 = {4,1,2};
        int[] nums2 = {1,3,4,2};
        int[] res=nextGreaterElement(nums1,nums2);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]+" ");
    }

    public static int[] nextGreaterElement(int[] nums1, int[] nums2) {
        int[] res=new int[nums1.length];
        for(int i=0;i<nums1.length;i++)
            res[i]=NGE(nums1[i],nums2);
        return res;
    }

    public static int NGE(int a,int[] nums2){
        int p=-1;
        for(int i=0;i<nums2.length;i++){
            if(nums2[i]==a)
                p=1;
            if(p==1){
                for(int j=i+1;j<nums2.length;j++)
                    if(nums2[j]>a)
                        return nums2[j];
            }
        }
        return -1;
    }
}
