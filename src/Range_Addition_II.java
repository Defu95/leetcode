public class Range_Addition_II {
    public static void main(String[] args) {
        System.out.print(maxCount(3, 3, new int[][]{}));
    }

    public static int maxCount(int m, int n, int[][] ops) {
        if (ops.length == 0 || ops[0].length == 0)
            return m * n;
        int r = Integer.MAX_VALUE, c = Integer.MAX_VALUE;
        for (int i = 0; i < ops.length; i++) {
            if (ops[i][0] < r)
                r = ops[i][0];
            if (ops[i][1] < c)
                c = ops[i][1];
        }
        return r * c;
    }
}
