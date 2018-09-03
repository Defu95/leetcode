import static java.lang.Character.isDigit;
import static java.lang.Character.isLetter;
import static java.lang.Character.isLetterOrDigit;

public class Valid_Palidrome {
    public static void main(String[] args){
        boolean judge=isPalindrome("aba");
        System.out.print(judge);
    }

    public static boolean isPalindrome(String s){
        if(s.length()==0)
            return true;
        else{
            int length=s.length();
            int front=0,back=length-1;
            int flag=-1;
            int rem=0;
            int invert='a'-'A';
            char[] StrToChar=new char[length];
            StrToChar=s.toCharArray();   //java/!C
            for(int i=0;i<length;i++){
                if(isLetterOrDigit(StrToChar[i]))
                    rem++;
            }
            if(rem==0)
                return true;
            else{
                while(front<=back){
                    flag=1;
                    char tmp=StrToChar[front];
                    char tmp0=StrToChar[back];
                    while(!(isLetterOrDigit(tmp))){
                        front++;
                        tmp=StrToChar[front];
                    }
                    while(!(isLetterOrDigit(tmp0))){
                        back--;
                        tmp0=StrToChar[back];
                    }
                    if((isLetter(tmp)&&isLetter(tmp0))||(isDigit(tmp)&&isDigit(tmp0))){
                        if(tmp==tmp0||(tmp+invert==tmp0)||(tmp-invert==tmp0)){
                            front++;
                            back--;
                        }
                        else if(isDigit(tmp)&&isDigit(tmp0)&&tmp==tmp0){
                            front++;
                            back--;
                        }
                        else{
                            flag=-1;
                            break;
                        }
                    }
                    else{
                        flag=-1;
                        break;}
                }
                if(flag==1||rem==1)
                    return true;
                else
                    return false;
            }}}

}
