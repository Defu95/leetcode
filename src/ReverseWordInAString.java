public class ReverseWordInAString {
    public static void main(String[] args){
        String s="  a b";
        String Reverse=reverseWords(s);
        System.out.print(Reverse+'a');
    }
    public static String reverseWords(String s) {
        String tmp0="";
        if (s.length()==0)
            return tmp0;
        while(s.charAt(0)==' '&&s.length()>1){
            s=s.substring(1);
        }
        int rem=0,flag=-1;
        int length=s.length();
        while(s.charAt(length-1)==' '&&length>1){
            s=s.substring(0,length-1);
            length=s.length();
        }
        for(int i=0;i<=s.length()-1;i++){
            if (s.charAt(i)==' '&&s.charAt(i+1)==' '){
                s=s.substring(0,i)+s.substring(i+1);
                i--;}
        }

        for(int i=0;i<s.length();i++)
            if(s.charAt(i)==' '){
                rem++;
                flag=i;
            }
            length=s.length();
        if(rem==0)
            return s;
        if(s.length()==0)
            return tmp0;
        if(rem==1){
            if(s.charAt(0)==' '){
                tmp0=s.substring(1);
                return tmp0;
            }
            else{ if(s.charAt(length-1)==' ') {
                tmp0 = s.substring(0, length-1);
                return tmp0;
            }
            else{
                tmp0=s.substring(flag+1)+" "+s.substring(0,flag);
                return tmp0;
            }}
        }
        if(s.charAt(0)==' '&&s.charAt(length-1)==0&&rem==2)
            return s;
        else {
            tmp0=s.substring(flag+1);
            int j;
            while (flag!=0){
                for(int i=flag;i>=0;i--){
                    if(s.charAt(i)==' '){
                        rem--;
                        j=i;
                        tmp0+=s.substring(i,flag);
                        flag=i;
                        if(i==0)
                            flag=i;
                    }
                }
                if(rem==0){
                    tmp0+=" "+s.substring(0,flag);
                    break;
                }
            }
            return tmp0;
        }
    }

}
