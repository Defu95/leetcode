public class Detect_Capital {
    public static void main(String[] args) {
        System.out.print(detectCapitalUse("aB"));
    }

    public static boolean detectCapitalUse(String word) {
        if (word.length() <= 1)
            return true;
        char[] w = word.toCharArray();
        if (Character.isLowerCase(w[0])) {
            for (int i = 1; i < w.length; i++)
                if (!Character.isLowerCase(w[i]))
                    return false;
            return true;
        } else {
            for (int i = 1; i < w.length - 1; i++) {
                if (Character.isLowerCase(w[1])) {
                    if (Character.isLowerCase(w[i]) != Character.isLowerCase(w[i + 1]))
                        return false;
                } else {
                    if (Character.isUpperCase(w[i]) != Character.isUpperCase(w[i + 1]))
                        return false;
                }
            }
            return true;
        }
    }
}
