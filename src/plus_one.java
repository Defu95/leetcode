public class plus_one {
    public static void main(String[] args){
        int[] test={8,9};
        int[] result=plusOne(test);
        int i=result.length;
        for(int k=0;k<i;k++){
            System.out.print(result[k]+"  ");}
    }

    public static int[] plusOne(int[] digits){
        int length=digits.length;
        int[] tmp=new int[length];
        if(digits[length-1]<9){
            digits[length-1]+=1;
            for(int i=0;i<=length-1;i++)
                tmp[i]=digits[i];
            return tmp;
        }
        else
            return jinwei(digits);
    }

    public static int[] jinwei(int[] digits){
        int length0=digits.length;
        int j=digits.length-1;
        int flag=-1;
        int[] tmp0=new int[length0];
        int[] tmp1=new int[length0+1];
        digits[j]+=1;
        if (digits[0]==10)
            flag=1;
        while(digits[j]==10&&j>0){
            digits[j]=0;
            digits[j-1]+=1;
            if(digits[0]==10)
                flag=1;
            j--;
        }
        if(j>0||flag!=1){
            for(int i=0;i<digits.length;i++)
                tmp0[i]=digits[i];
            return tmp0;
        }
        else{
            tmp1[0]=1;
            for(int i=1;i<=digits.length;i++)
                tmp1[i]=0;
            return tmp1;
        }
    }
}