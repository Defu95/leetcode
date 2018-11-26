import java.util.ArrayList;
import java.util.List;

public class Long_Pressed_Name {
    public static void main(String[] args) {
//        String name = "saeed", typed = "ssaaedd";
//        String name = "leelee", typed = "lleeelee";
//        String name = "laiden", typed = "laiden";
        String name = "alex", typed = "aaleex";
        System.out.println(isLongPressedName(name, typed));
    }

    public static boolean isLongPressedName(String name, String typed) {
        List<Character> n = name2str(name);
        List<Character> t = name2str(typed);
        if(n.size()!=t.size())
            return false;
        for(int i=0;i<n.size();i++){
            if(i%2==0){
                if(n.get(i)!=t.get(i))
                    return false;
            }else{
                if((int)n.get(i)>(int)t.get(i))
                    return false;
            }
        }
        return true;
    }

    public static List<Character> name2str(String s) {
        int flag = 0;
        List<Character> list = new ArrayList<>();
        list.add(s.charAt(0));
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                list.add((char)(i - flag));
                list.add(s.charAt(i));
                flag = i;
            }
        }
        list.add((char)(s.length() - flag));
        return list;
    }
}
