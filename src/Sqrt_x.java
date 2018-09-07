public class Sqrt_x {
    public static void main(String[] args){
        System.out.print(mySqrt(4));
    }
    public static int mySqrt(int x) {
//        double res=Math.sqrt((double) x);
//        int tmp=(int)res;
//        if(res-tmp>=0)
//            return tmp;
//        else
//            return tmp-1;
        if(x==0)
            return 0;
        int left=1,right=Integer.MAX_VALUE;
        while(true){
            int mid=left+(right-left)/2;
            if(mid>x/mid){
                right=mid-1;
            }else{
                if((mid+1)>x/(mid+1))
                    return mid;
                else
                    left=mid+1;
            }
        }
    }
}
