public class Add_Strings {
    public static void main(String[] args) {
        System.out.print(addStrings("99", "1"));
    }

    public static String addStrings(String num1, String num2) {
        String res = "";
        int carry = 0;
        int i = num1.length() - 1, j = num2.length() - 1;
        while (i >= 0 && j >= 0) {
            int n1 = num1.charAt(i) - '0';
            int n2 = num2.charAt(j) - '0';
            int tmp = n1 + n2 + carry;
            if (tmp >= 10) {
                carry = 1;
                tmp -= 10;
            } else
                carry = 0;
            res = String.valueOf(tmp) + res;
            i--;
            j--;
        }

        if (i >= 0) {
            return shouwei(i, carry, num1, res);
        } else if (j >= 0) {
            return shouwei(j, carry, num2, res);
        } else{
            if(carry==1)
                return "1"+res;
            else
                return res;
        }
    }

    public static String shouwei(int i, int carry, String num1, String res) {
        while (i >= 0) {
            int tmp = num1.charAt(i) - '0' + carry;
            if (tmp >= 10) {
                carry = 1;
                tmp -= 10;
            } else
                carry = 0;
            res = String.valueOf(tmp) + res;
            i--;
        }
        if(carry==1)
            res="1"+res;
        return res;
    }
}
