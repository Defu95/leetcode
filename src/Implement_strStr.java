public class Implement_strStr {
    public static void main(String[] args){
        int a=strStr("mississippi","issipbi");
        System.out.println(a);
    }

    public static int strStr(String haystack, String needle) {
        int length0=haystack.length();
        int length1=needle.length();
        int i=0;
        if ((length0==0&&length1>0)||length0<length1)
            return -1;
        if(length0==0&&length1==0||(length0>0&&length1==0))
            return 0;
        else {
            int flag=-1;
            int b=-1;
            while(i<=length0-length1){
               a: for ( int j=0 ; j<length1; ){
                    if(haystack.charAt(i)==needle.charAt(j)){
                        i++;
                        j++;
                        if(flag==-1)
                            flag=i-1;
                    }
                    if(j==length1){
                        b=1;
                        break ;
                        }
                    else{
                        if (i==length0)
                            break ;
                        if(haystack.charAt(i)!=needle.charAt(j)){
                            j=0;
                            if(flag!=-1){
                                i=flag;
                                i++;
                            }
                            else
                                i++;
                            flag=-1;
                            break a;
                        }
                    }
                }
                if(b==1){
                   break;
                }
            }
            return flag;
        }
    }

}
