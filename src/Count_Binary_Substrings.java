public class Count_Binary_Substrings {
    public static void main(String[] args) {
//        String s="00110011";
//        String s="10101";
        String s = "001000";
        System.out.print(countBinarySubstrings(s));
    }

    public static int countBinarySubstrings(String s) {
        int p = 1, count = -1, res = 0, flag = 0;
        if (s.length() == 1)
            return 0;
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != s.charAt(i - 1)) {
                if (flag != 0) {
                    res += Math.min(p, count);
                    count = i - flag;
                    flag = i;
                    p = 1;
                } else {
                    count = i - flag;
                    flag = i;
                    p = 1;
                }
            } else {
                p++;
            }
        }
        if (flag != 0)
            res += Math.min(p, count);
        return res;
    }
}
