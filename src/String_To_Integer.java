//关键在于把数字部分切出来
import static java.lang.Character.isDigit;

public class String_To_Integer {
    public static void main(String[] args){
        String s="      10322466363h";
        int a=myAtoi(s);
        System.out.println(a);
    }
    public static int myAtoi(String str) {
        for(int i=0;i<str.length();i++){  //删除字符串开头空格部分
            if(str.charAt(0)==' '){
                str=str.substring(1);
                i--;}
        }
        int sign=1,flag=-1,j=0,m=-1;
        String s="";
        for(int i=0;i<str.length();i++){  //找到字符串中第一个数字出现的位置
            if(isDigit(str.charAt(i))||str.charAt(i)=='+'||str.charAt(i)=='-'){
                flag=i;
                break;}
        }
        if(flag==-1)
            return 0;
        if(str.charAt(0)!='+'&&str.charAt(0)!='-'&&!isDigit(str.charAt(0)))
            return 0;
        else{
            if(str.charAt(flag)=='+'||str.charAt(flag)=='-'){
                if(str.charAt(flag)=='+')
                    sign=1;
                else
                    sign=-1;
                if(flag==str.length()-1)
                    return 0;
                else{
                    if(!isDigit(str.charAt(flag+1)))
                        return 0;
                    else{
                        flag+=1;
                        for(int i=flag;i<str.length();i++){
                            if(isDigit(str.charAt(i)))
                                j=i;
                            else
                                break;

                        }
                        if(j==str.length()-1)
                            s=str.substring(flag);
                        else
                            s=str.substring(flag,j+1);
                        }
                }
            }
            else{
                for(int i=j;i<str.length();i++){
                    if(isDigit(str.charAt(i))){
                        flag=i;
                        break;
                    }
                }
                for(int i=flag+1;i<str.length();i++){
                    if(isDigit(str.charAt(i))){
                        j=i;
                        m=1;
                    }else {
                        break;
                    }
                }
                if(str.length()==1&&isDigit(str.charAt(0)))
                    return (int)str.charAt(0)-48;
                if(j==str.length()-1&&m==1)
                    s=str.substring(flag);
                else
                    s=str.substring(flag,j+1);
            }
        }
        double res=strtoint(s);
        if(sign==-1&&res>2147483647)
            return -2147483648;
        if(sign==1&&res>2147483647)
            return 2147483647;
        else
            return sign*(int)res;
    }
    public static double strtoint(String s){
        int j=0;
        double res=0;
        for(int i=s.length()-1;i>=0;i--){
            res+=(int)(s.charAt(i)-48)*((int)Math.pow(10,j));
            j++;
        }
        return res;
    }
}
