public class Number_Complement {
    public static void main(String[] args) {
        System.out.print(findComplement(1));
    }

    public static int findComplement(int num) {
        String bin = Integer.toBinaryString(num);
        String res = "";
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '0')
                res += '1';
            else
                res += '0';
        }
        int k = 0, flag = -1;
        String tmp = "";
        while (k < res.length()) {
            if (res.charAt(k) != '0')
                flag = 1;
            if (flag == 1)
                tmp += res.charAt(k);
            k++;
        }
        if (flag == -1)
            return 0;
        return Integer.valueOf(tmp, 2);
    }
}
