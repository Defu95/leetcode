import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args){
        String s= "cbaebabacd", p= "abcab";
        System.out.print(findAnagrams(s,p));
    }
    public static List<Integer> findAnagrams(String s, String p) {
        int l1=s.length(),l2=p.length();
        List<Integer> res=new ArrayList<>();
        HashMap<Character,Integer> setp=new HashMap<>();
        for(int i=0;i<p.length();i++){
            if(!setp.containsKey(p.charAt(i)))
                setp.put(p.charAt(i),1);
            else {
                int c=setp.get(p.charAt(i));
                setp.put(p.charAt(i),c+1);
            }
        }
        int a=setp.size();
        return res;
    }
}
