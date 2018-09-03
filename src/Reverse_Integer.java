public class Reverse_Integer {

    public static void main(String[] args){
        int a=reverse(123);
        System.out.print(a);
    }


    public static int reverse(int x){
        if(x==0||(x>0&&x<10))
            return x;
        else {
            int[] tmp = new int[16];
            int[] tmp0 = new int[2];
            int temp = 0, a, j = 0;
            double result= 0;
            if (x < 0)
                a = x * (-1);
            else
                a = x;
            while (a >= 10) {
                tmp0 = quyu(a);
                tmp[j] = tmp0[0];
                j++;
                a = tmp0[1];
                if (a < 10) {
                    tmp[j] = tmp0[1];
                }
            }
            int c = 0;
            for (int k = j; k >= 0; k--) {
                temp = (int) (tmp[k] * ( Math.pow(10, (double) (c))));
                result = result + temp;
                c++;
            }
//        if(x>=0)
//            return result;
//        if(x<0)
//            return (result*(-1));
            if(temp>=2147483647||result>=2147483647||temp<=-2147483647||result<=-2147483647)
                return 0;
            else{
                return (int)(result * ((x) / Math.abs(x)));}
        }

    }

    public static int[] quyu(int x){
        int[] m=new int[2];
        for(int i=0;i<=9;i++){
            if ((x-i)%10==0){
                m[0]=i;
                m[1]=(x-i)/10;
                break;
            }
        }
        return m;
    }
}
