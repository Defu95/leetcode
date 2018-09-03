import static sun.swing.MenuItemLayoutHelper.max;

public class AddBinary {
    public static void main(String[] args){
        String a="1010",b="1011";
        String c=addBinary(a,b);
        System.out.println(c);
    }

    public static String addBinary(String a, String b) {
        int al=a.length(),bl=b.length();
        StringBuilder stringbuild=new StringBuilder();
        if(al<bl){
            String c=a;
            a=b;
            b=c;
        }
        int delta=a.length()-b.length();
        int flag=0;
        for (int k=a.length()-1;k>=0;k--){
            int tmp1=0;
            if(k-delta>=0){
                tmp1=b.charAt(k-delta)-'0';
            }
            int tmp2=a.charAt(k)-'0';
            if(k-delta<0){
                if((a.charAt(k)-'0'+flag)==2){
                    stringbuild.append('0');
                    flag=1;
                }
                else {
                    stringbuild.append(a.charAt(k)-'0'+flag);
                    flag=0;
                }
            }
            else{
                if(tmp1+tmp2+flag==2){
                    stringbuild.append("0");
                    flag=1;
                }
                else {if(tmp1+tmp2+flag>2){
                    stringbuild.append('1');
                    flag=1;
                }
                else{
                    stringbuild.append(tmp1+tmp2+flag);
                    flag=0;
                }}
            }
        }
        if(flag==1)
            stringbuild.append('1');
        System.out.println(stringbuild);
//        String res="";
//        for(int i=stringbuild.length()-1;i>=0;i--)
//            res+=String.valueOf((stringbuild.charAt(i)));
        return stringbuild.reverse().toString();
    }
}
