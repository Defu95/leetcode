import java.util.HashSet;

public class Rotate_String {
    public static void main(String[] agrs){
        System.out.print(rotateString("",""));
    }
    public static boolean rotateString(String A, String B) {
        if(A.equals("")&&B.equals(""))
            return true;
        if(A.length()!=B.length())
            return false;
        HashSet<String> set=new HashSet<>();
        for(int i=0;i<A.length();i++){
            set.add(A.substring(i)+A.substring(0,i));
        }
        return set.contains(B)?true:false;
    }
}
