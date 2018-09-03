public class ValidParentheses {
    public static void main(String[] args){
    boolean res=isValid("(");
    System.out.print(res);
    }

    public static boolean isValid(String s) {
//        int sb=0;int mb=0;int lb=0;  //sb:small brackets
//        for(int i=0;i<s.length();i++) {
//            char tmp=s.charAt(i);
//            if (tmp=='('||tmp==')')
//                sb+=1;
//            else if(tmp=='['||tmp==']')
//                mb+=1;
//            else
//                lb+=1;
//        }
//        if(sb%2!=0||mb%2!=0||lb%2!=0)
//            return false;
//        else
//            return true;
        int n=s.length()/2;
        while(n>0){
            for(int i=0;i<s.length()-1;i++){
                if((s.charAt(i)=='('&&s.charAt(i+1)==')')||(s.charAt(i)=='['&&s.charAt(i+1)==']')||(s.charAt(i)=='{'&&s.charAt(i+1)=='}')) {
//                    method 1
//                String s1=s.substring(0,i);
//                String s2=s.substring(i+2);
//                s=s1+s2;
//                    method 2
                  char tmp=s.charAt(i);
                   char tmp1=s.charAt(i+1);
                   String str=String.valueOf(tmp)+String.valueOf(tmp1);
                  s=s.replace(str,"");
                }
            }
            n--;
        }
        System.out.print(s);
        if(s.length()==0 ){
            return true;}
        else
            return false;
    }
}
