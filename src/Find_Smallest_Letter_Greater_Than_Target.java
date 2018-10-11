import java.util.Arrays;

public class Find_Smallest_Letter_Greater_Than_Target {
    public static void main(String[] args) {
        char[] letters = {'c', 'f', 'j'};
        char target = 'k';
        System.out.print(nextGreatestLetter(letters, target));
    }

    public static char nextGreatestLetter(char[] letters, char target) {
        int near = Integer.MAX_VALUE, far = Integer.MAX_VALUE;
        char nearch = '0', farch = '0';
        for (char ch : letters) {
            int a = ch - target;
            if (a > 0) {
                if (a < near) {
                    near = a;
                    nearch = ch;
                }
            } else if (a < 0) {
                if (a < far) {
                    far = a;
                    farch = ch;
                }
            }
        }
        return nearch == '0' ? farch : nearch;
    }
}
