public class Binary_Gap {
    public static void main(String[] args) {
        System.out.print(binaryGap(1));
    }

    public static int binaryGap(int N) {
        String bin = Integer.toBinaryString(N);
        int flag = -1, gap = 0;
        for (int i = 0; i < bin.length(); i++) {
            if (bin.charAt(i) == '1') {
                if (flag != -1) {
                    gap = Math.max(i - flag, gap);
                    flag = i;
                } else {
                    flag = i;
                }
            }
        }
        return gap;
    }
}
