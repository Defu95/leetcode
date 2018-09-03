import org.omg.Messaging.SYNC_WITH_TRANSPORT;

public class Reverse_Words_In_A_String_III {
    public static void main(String[] args){
        String s="the sky is blue o";
        String res=reverseWords(s);
        System.out.print(res+"a");
    }
    public static String reverseWords(String s) {
        //将字符串整理为规则形式
        String tmp0="",tmp1="";
        if(s.length()==0)
            return tmp0;
        while(s.charAt(0)==' '&&s.length()>1){
            s=s.substring(1);
        }
        while (s.charAt(s.length()-1)==' '&&s.length()>1){
            s=s.substring(0,s.length()-1);
        }
        int length=s.length();
        for(int i=0;i<length-1;i++){
            if(s.charAt(i)==' '&&s.charAt(i+1)==' '){
                s=s.substring(0,i)+s.substring(i+1);
                i--;
            }
        }
        int j=0;
        for(int i=0;i<length-1;i++){
            if(s.charAt(i)==' '){
                tmp1=s.substring(j,i);
                i++;
                j=i;
                if(tmp1.length()==1)
                    tmp0=tmp0+tmp1+" ";
                else {
                    tmp1=reverse(tmp1);
                    tmp0+=tmp1+" ";
                }
            }
        }
        tmp0+=reverse(s.substring(j));
        return tmp0;
//        if(s.charAt(0)==' ')
//        if(s.equals(" "))
////        System.out.println("a"+s+"a");
////        if(s==" ")
//            return tmp0;
//        else
//            return s;
    }
    public static String reverse(String s){
        char[] ch=s.toCharArray();
        char[] ch1=new char[s.length()];
        for(int i=ch.length-1;i>=0;i--){
            ch1[s.length()-i-1]=ch[i];
        }
        String tmp= new String(ch1);
        return tmp;
    }

}
