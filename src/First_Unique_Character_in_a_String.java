import java.util.Collection;
import java.util.HashMap;

public class First_Unique_Character_in_a_String {
    public static void main(String[] args){
        System.out.print(firstUniqChar("aadadaad"));
    }
    public static int firstUniqChar(String s) {
//        int flag=-1;
//        HashMap<Character,Integer> map=new HashMap<>();
//        for(int i=0;i<s.length();i++){
//            if(!map.containsKey(s.charAt(i)))
//                map.put(s.charAt(i),1);
//            else {
//                int c=map.get(s.charAt(i));
//                map.put(s.charAt(i),c++);
//            }
//        }
//        Collection<Integer> set=map.values();
//        if(s.length()==1)
//            return 0;
//        for(int i=0;i<s.length()-1;i++){
//            int flag=-1;
//            for(int j=i+1;j<s.length();j++){
//                if(s.charAt(i)==s.charAt(j)){
//                    flag=1;
//                    break;
//                }
//            }
//            if(flag!=1)
//                return i;
//        }
//        return -1;
        if(s.length()==0)
            return -1;
        if(s.length()==1)
            return 0;
        HashMap<Character,Integer> map=new HashMap<>();
        for(int i=0;i<s.length()-1;i++){
            int flag=-1;
            if(!map.containsKey(s.charAt(i))){
                map.put(s.charAt(i),1);
                for(int j=i+1;j<s.length();j++){
                    if(s.charAt(i)==s.charAt(j)){
                        flag=1;
                        break;
                    }
                }
                if(flag!=1)
                    return i;
            }
        }
        if(map.containsKey(s.charAt(s.length()-1)))
            return -1;
        else
            return s.length()-1;
    }
}
