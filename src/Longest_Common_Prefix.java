public class Longest_Common_Prefix {
    public static void main(String[] args) {
//        String[] strs = {"flower", "flow", "flight"};
        String[] strs = {"cat", "dog", "apple"};
//        String[] strs = {"aa", "a"};
        System.out.print(longestCommonPrefix(strs));
    }

    public static String longestCommonPrefix(String[] strs) {
//        String res = "";
//        int flag = -1;
//        for (String st : strs) {
//            if (flag == -1) {
//                res = st;
//                flag = 1;
//            } else {
//                String tmp = "";
//                for (int i = 0; i < Math.min(res.length(), st.length()); i++) {
//                    if (res.charAt(i) != st.charAt(i))
//                        break;
//                    tmp += res.charAt(i);
//                }
//                res = tmp;
//            }
//        }
//        return res;
        if (strs.length == 0)
            return "";
        if (strs.length == 1)
            return strs[0];
        int minlen = Integer.MAX_VALUE;
        for (String st : strs)
            minlen = Math.min(minlen, st.length());
        for (int i = 0; i < minlen; i++) {
            for (int j = 0; j < strs.length - 1; j++) {
                String s1 = strs[j];
                String s2 = strs[j + 1];
                if (s1.charAt(i) != s2.charAt(i))
                    return strs[0].substring(0, i);
            }
        }
        return strs[0].substring(0, minlen);
    }
}
