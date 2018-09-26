import java.lang.reflect.Array;
import java.util.Arrays;

public class Smallest_Range_I {
    public static void main(String[] args){
        int[] A = {0,10};
        int K = 2;
        System.out.println(smallestRangeI(A,K));
    }
    public static int smallestRangeI(int[] A, int K) {
        if(A.length==0)
            return 0;
        Arrays.sort(A);
        int len=A.length;
        if(A[0]+K>=A[len-1]-K)
            return 0;
        else{
            return (A[len-1]-2*K-A[0]);
        }
    }
}
