import java.util.HashSet;

public class Buddy_Strings {
    public static void main(String[] args){
        String A="ab", B = "cb";
        System.out.print(buddyStrings(A,B));
    }

    public static boolean buddyStrings(String A, String B) {
        if(A.length()!=B.length())
            return false;
        int flag=-1,swap=-1;
        for(int i=0;i<A.length();i++){
            if(A.charAt(i)!=B.charAt(i)){
                if(flag==-1)
                    flag = i;
                else {
                    if(B.charAt(i)!=A.charAt(flag)||B.charAt(flag)!=A.charAt(i))
                        return false;
                    else {
                        flag=i;
                        swap=1;
                        break;
                    }
                }
            }
        }
        if(flag!=-1&&swap==-1)
            return false;
        for(int i=flag+1;i<A.length();i++){
            if(B.charAt(i)!=A.charAt(i))
                return false;
        }
        HashSet<Character> set=new HashSet<>();
        if(flag==-1){
            for(int i=0;i<A.length();i++){
                if(!set.contains(A.charAt(i)))
                    set.add(A.charAt(i));
            }
        }
        if(set.size()==A.length())
            return false;
        return true;
    }
}
