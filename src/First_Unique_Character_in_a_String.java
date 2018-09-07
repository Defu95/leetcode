import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.Map;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args){
        System.out.print(firstUniqChar("loveleetcode"));
    }
    public static int firstUniqChar(String s) {
        LinkedHashMap<Character,Integer> map=new LinkedHashMap<>();
        int i=0;
        for(;i<s.length();i++){
            if(map.containsKey(s.charAt(i))){
                int c=map.get(s.charAt(i));
                map.put(s.charAt(i),c++);
            }
            else{
                map.put(s.charAt(i),1);
            }
        }
        if
        return flag;
    }
}
