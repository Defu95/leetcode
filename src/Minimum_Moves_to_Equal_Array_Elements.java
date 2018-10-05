public class Minimum_Moves_to_Equal_Array_Elements {
    public static void main(String[] args) {
        int[] nums={1,2,2};
        System.out.println(minMoves(nums));
    }

    public static int minMoves(int[] nums) {
        int min=Integer.MAX_VALUE;
        int res=0;
        for(int a:nums)
            if(a<min)
                min=a;
        for(int a:nums)
            res+=a-min;
        return res;
    }
}
