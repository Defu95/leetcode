public class Goat_Latin {
    public static void main(String[] args) {
        String S = "I speak Goat Latin";
        System.out.println(toGoatLatin(S));
    }

    public static String toGoatLatin(String S) {
        String[] tmp = S.split(" ");
        String res = "";
        for (int i = 0; i < tmp.length; i++) {
            String st = "";
            if (isvowel(tmp[i])) {
                st = tmp[i] + "ma";
            } else {
                if (tmp[i].length() > 1) {
                    st = tmp[i].substring(1) + tmp[i].charAt(0) + "ma";
                } else {
                    st = tmp[i] + "ma";
                }
            }
            int j = i;
            while (j >= 0) {
                st += "a";
                j--;
            }
            res = res + st + " ";
        }
        return res.substring(0, res.length() - 1);
    }

    public static boolean isvowel(String s) {
        if (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' || s.charAt(0) == 'u' || s.charAt(0) == 'A' || s.charAt(0) == 'E' || s.charAt(0) == 'I' || s.charAt(0) == 'O' || s.charAt(0) == 'U')
            return true;
        return false;
    }
}
