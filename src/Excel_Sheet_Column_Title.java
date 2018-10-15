public class Excel_Sheet_Column_Title {
    public static void main(String[] args) {
        String res = convertToTitle(28);
        System.out.print(res);
    }

    public static String convertToTitle(int n) {
        char[] dic = "ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();
        StringBuffer res = new StringBuffer();
        while (n != 0) {
            if (n % 26 == 0) {
                res.append(dic[25]);
                n = n / 26 - 1;
            } else {
                res.append(dic[n % 26 - 1]);
                n /= 26;
            }
        }
        return res.reverse().toString();
    }
}
