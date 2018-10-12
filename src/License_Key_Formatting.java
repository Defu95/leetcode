public class License_Key_Formatting {
    public static void main(String[] args) {
//        String S = "2-5g-3-J";
//        int K = 2;
        String S = "5F3Z-2e-9-w";
        int K = 3;
        System.out.print(licenseKeyFormatting(S, K));
    }

    public static String licenseKeyFormatting(String S, int K) {
        StringBuilder tmp = new StringBuilder();
        StringBuilder result = new StringBuilder();
        if (S == "-")
            return "";
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) != '-')
                tmp.append(S.charAt(i));
        }
        String st = tmp.toString();
        for (int i = tmp.length() - 1; i >= 0; i--) {
            result.append(st.charAt(i));
            if (i % K == 0 && i > 0)
                result.append("-");
        }
        return result.toString().toUpperCase();
    }
}
