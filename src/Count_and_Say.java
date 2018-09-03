public class Count_and_Say {
    public static void main(String[] args){
        String str=countAndSay(3);
        System.out.print(str);
    }
    public static String countAndSay(int n) {
        int count=0,flag=-1,j=-1;
        String s="",t="",temp="";
        if(n==1)
            return "1";
        String tmp=countAndSay(n-1);
        for(int i=tmp.length()-1;i>=0;i--){
            if(flag==-1){
                j=(int)tmp.charAt(i)-(int)('0');
                count++;
                flag=1;
            }else{
                if(j==(int)tmp.charAt(i)-(int)('0'))
                    count++;
                else{
                    temp=String.valueOf(j);
                    temp=String.valueOf(count)+temp;
                    s=temp+s;
                    j=(int)tmp.charAt(i)-(int)('0');
//                    flag=-1;
                    count=1;
                }
            }
        }
        t=String.valueOf(j);
        t=String.valueOf(count)+t;
//        System.out.println(t);
        s=t+s;
       return s;
    }
}
