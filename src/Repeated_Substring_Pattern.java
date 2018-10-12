public class Repeated_Substring_Pattern {
    public static void main(String[] args) {
        System.out.print(repeatedSubstringPattern("aba"));
    }

    public static boolean repeatedSubstringPattern(String s) {
        if (s == null || s.length() == 0)
            return false;
        String s2 = s.substring(1) + s.substring(0, s.length() - 1);
        return s2.contains(s);
    }
}
