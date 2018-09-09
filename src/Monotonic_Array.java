public class Monotonic_Array {
    public static void main(String[] args){
        int[] A={1,1,2,3,4,5};
        System.out.println(isMonotonic(A));
    }
    public static boolean isMonotonic(int[] A) {
        int flag=-1;
        while(flag==-1){
            for(int i=1;i<A.length;i++){
                if(A[i]<A[i-1]){
                    flag=1;
                    break;
                }
            }
            break;
        }
        if(flag==1){
            for(int i=1;i<A.length;i++){
                if(A[i]>A[i-1])
                    return false;
            }
        }
        return true;
    }
}
