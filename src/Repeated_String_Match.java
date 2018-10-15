public class Repeated_String_Match {
    public static void main(String[] args) {
//        String A = "abcd", B = "cdabcdab";
        String A = "abc", B = "cabcabca";
        System.out.print(repeatedStringMatch(A, B));
    }

    public static int repeatedStringMatch(String A, String B) {
        int times = 1;
        StringBuffer tmp = new StringBuffer();
        for (int i = 0; i < A.length(); i++)
            tmp.append(A.charAt(i));
        tmp.toString();
        int up = (int) Math.floor(B.length() / A.length()) + 2;
        while (times <= up) {
            if (A.contains(B))
                return times;
            times++;
            A += tmp;
        }
        return -1;
    }
}
