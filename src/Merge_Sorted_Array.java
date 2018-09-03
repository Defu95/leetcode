public class Merge_Sorted_Array {
    public static void main(String[] args){
        int[] nums1 = {3,6,9,0,0,0};
        int m =3;
        int[] nums2 = {2,5,6};
        int n = 3;
        merge(nums1,m,nums2,n);
        for(int i=0;i<nums1.length;i++)
        System.out.print(nums1[i]);
    }
    public static void merge(int[] nums1, int m, int[] nums2, int n) {
//神级代码
//        int i = m - 1, j = n - 1, position = m + n - 1;
//        while (j >= 0) {
//            nums1[position--] = i >= 0 && nums1[i] > nums2[j] ? nums1[i--] : nums2[j--];
//        }
        int i=m-1,j=n-1,p=m+n-1;
        while(j>=0) {
            if(i==-1){
                nums1[p]=nums2[j];
                p--;j--;
            }
            else {
            if (nums1[i] > nums2[j]) {
                nums1[p] = nums1[i];
                i--;
                p--;
            } else {
                nums1[p] = nums2[j];
                j--;
                p--;
            }
            }
        }
//        while(j>0){
//            nums1[p]=nums2[j];
//            j--;p--;
//        }
    }
}
