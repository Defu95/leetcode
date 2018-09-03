public class Palidrome_Number {
    public static void main(String[] args){
        boolean judge=isPalindrome(1234321);
        System.out.print(judge);
    }
    public static boolean isPalindrome(int x) {
        if(x<0){
            return false;}
        if(x>=0&&x<10){
            return true;}
        else{
            int a=x;
            int j=0;
            int[] tmp=new int[16];
            int[] tmp0=new int[2];
            while(a>=10){
                tmp0=quyu(a,j);
                a=tmp0[1];
                tmp[j]=tmp0[0];
                j++;
//                int l=(int)Math.pow(10,j);
//                x=(x-l)/((int)Math.pow(10,j));
                a=tmp0[1];
                if(a<10){
                    tmp[j]=tmp0[1];
                }
            }

            for(int k=0;k<=j/2;k++){
                if (tmp[k]!=tmp[j-k])
                    return false;
            }
            return true;
        }

    }

    public static int[] quyu(int x,int j){
        int[] m=new int[2];
        for(int i=0;i<=9;i++){
            if ((x-i)%10==0) {
                m[0]=i;
//                m[1]=(x-m[0])/((int)Math.pow(10,(double)(j+1)));
                m[1]=(x-m[0])/10;
                break;}
        }
        return m;
    }
}
