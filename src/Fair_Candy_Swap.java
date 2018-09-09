import java.util.HashSet;

public class Fair_Candy_Swap {
    public static void main(String[] args){
        int[] A={1,2,5}, B = {2,4};
        int[] res=fairCandySwap(A,B);
        for(int i=0;i<res.length;i++)
            System.out.print(res[i]);
    }
    public static int[] fairCandySwap(int[] A, int[] B) {
        HashSet<Integer> set1=new HashSet<>();
        HashSet<Integer> set2=new HashSet<>();
        int sA=0,sB=0;
        for(int i=0;i<A.length;i++){
            sA+=A[i];
            if(!set1.contains(A[i]))
                set1.add(A[i]);
        }
        for(int i=0;i<B.length;i++){
            sB+=B[i];
            if(!set2.contains(B[i]))
                set2.add(B[i]);
        }
        int mid=(sA+sB)/2;
        int f1=-1,f2=-1;
        for(int i=0;i<A.length;i++){
            if(set2.contains(mid-sA+A[i])){
                f1=i;
                break;
            }
        }
        for(int i=0;i<B.length;i++){
            if (B[i]==(mid-sA+A[f1])){
                f2=i;
                break;
            }
        }
        return new int[]{A[f1],B[f2]};
    }
}
