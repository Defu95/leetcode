import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args){
        String s="cbaebabacd",p="abc";
        System.out.print(findAnagrams(s,p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
//        int l1 = s.length(), l2 = p.length();
//        List<Integer> res = new ArrayList<>();
//        HashMap<Character, Integer> setp = map(p);
//        for (int i = 0; i <= l1 - l2; i++) {
//            String tmp = s.substring(i, i + l2 );
//            HashMap<Character, Integer> sets = map(tmp);
//            if(setp.equals(sets))
//                res.add(i);
//            else i=i+Math.abs(setp.size()-sets.size())-1;
//        }
//        return res;
        int l1 = s.length(), l2 = p.length();
        List<Integer> res = new ArrayList<>();
        if(l2>l1)
            return res;
        HashMap<Character, Integer> setp = new HashMap<>();
        for (int i = 0; i < p.length(); i++) {
            if (!setp.containsKey(p.charAt(i)))
                setp.put(p.charAt(i), 1);
            else {
                int c = setp.get(p.charAt(i));
                setp.put(p.charAt(i), c + 1);
            }
        }

        for (int i = 0; i <= l1 - l2; i++) {
//            String tmp=new String();
//            if(i==l1-l2)
//                tmp = s.substring(i);
//            else
            String tmp = s.substring(i, i + l2 );
            int j = 0,flag=-1;
            for (; j < tmp.length(); j++) {
                if(!setp.containsKey(tmp.charAt(j))){
                    flag=1;
                    break;}
            }
            if(flag==-1)
                res.add(i);
        }
        return res;
    }
//    public static HashMap map (String s){
//        HashMap<Character,Integer> setp= new HashMap<Character,Integer>();
//        for (int i = 0; i < s.length(); i++) {
//            if (!setp.containsKey(s.charAt(i)))
//                setp.put(s.charAt(i), 1);
//            else {
//                int c = setp.get(s.charAt(i));
//                setp.put(s.charAt(i), c + 1);
//            }
//        }
//        return setp;
//    }
}
