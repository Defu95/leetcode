public class Add_Digits {
    public static void main(String[] args) {
        System.out.print(addDigits(2268));
    }

    public static int addDigits(int num) {
        if (num >= 0 && num <= 9)
            return num;
        String s = Integer.toString(num);
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count += s.charAt(i) - '0';
        }
        if (count >= 10)
            return addDigits(count);
        else return count;
    }
}
