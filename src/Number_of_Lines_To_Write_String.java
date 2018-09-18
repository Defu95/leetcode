public class Number_of_Lines_To_Write_String {
    public static void main(String[] args) {
//        int[] widths = {10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
//        String S = "abcdefghijklmnopqrstuvwxyz";
        int[] widths = {4, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10, 10};
//        String S = "bbbcccdddaaa";
        String S = "";
        int[] res = numberOfLines(widths, S);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i]);
    }

    public static int[] numberOfLines(int[] widths, String S) {
        if (S.length() == 0)
            return new int[]{0, 0};
        int count = 0, line = 1;
        for (int i = 0; i < S.length(); i++) {
            if (count + widths[S.charAt(i) - 'a'] <= 100)
                count += widths[S.charAt(i) - 'a'];
            else {
                line++;
                count = 0;
                count += widths[S.charAt(i) - 'a'];
            }
        }
        return new int[]{line, count};
    }
}
