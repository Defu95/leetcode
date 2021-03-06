//滑动窗口问题，把所有字符映射到map数组中，如果s中含有p对应的字符，map对应－1，如果所走长度为p的长度，且count为零保存
//角标，如果s中不含有对应的字符，mao对应-1；则改字符对应的数字必然为负数；最后进行判断，如果map[i]>=0说明原来p中包含这个
// 字符，count++;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Find_All_Anagrams_in_a_String {
    public static void main(String[] args){
        String s="cbaebabacd",p="abc";
//        String s="abab",p="ab";
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
        int[] map=new int[256];
        for(char c: p.toCharArray())
            map[c]++;
        int left = 0, right = 0, count = p.length();
        while (right < s.length()) {
            if (map[s.charAt(right)] >= 1) {
                count--;
            }
            map[s.charAt(right)]--;
            right++;
            if (count == 0) res.add(left);

            if (right - left == p.length() ) {
                if (map[s.charAt(left)] >= 0) {
                    count++;
                }
                map[s.charAt(left)]++;
                left++;
            }
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
