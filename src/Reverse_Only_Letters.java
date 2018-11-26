public class Reverse_Only_Letters {
    public static void main(String[] args) {
        String S = "Test1ng-Leet=code-Q!";
        System.out.println(reverseOnlyLetters(S));
    }

    public static String reverseOnlyLetters(String S) {
        StringBuffer sb = new StringBuffer();
        for (int i = S.length() - 1; i >= 0; i--) {
            if (Character.isLetter(S.charAt(i)))
                sb.append(S.charAt(i));
        }
        int flag = 0;
        StringBuffer res = new StringBuffer();
        for (int i = 0; i < S.length(); i++) {
            if (Character.isLetter(S.charAt(i))) {
                res.append(sb.charAt(flag));
                flag++;
            } else
                res.append(S.charAt(i));
        }
        return res.toString();
    }
}
