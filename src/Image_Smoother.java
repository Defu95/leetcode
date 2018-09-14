public class Image_Smoother {
    public static void main(String[] args) {
        int[][] M = {{1, 1, 1},
                {1, 0, 1},
                {1, 1, 1}};
        int[][] res = imageSmoother(M);
        for (int i = 0; i < res.length; i++) {
            for (int j = 0; j < res[0].length; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }

    public static int[][] imageSmoother(int[][] M) {
        int[][] res = new int[M.length][M[0].length];
        for (int i = 0; i < M.length; i++)
            for (int j = 0; j < M[0].length; j++)
                res[i][j] = smooth(M, i, j);
        return res;
    }

    public static int search(int[][] M, int i, int j) {
        int count = 0, num = 0;
        int[] x = {-1, 0, 1};
        int[] y = {-1, 0, 1};
        for (int a : x) {
            for (int b : y) {
                int tmpx = i + a;
                int tmpy = j + b;
                if (tmpx >= 0 && tmpx < M.length && tmpy >= 0 && tmpy < M[0].length) {
                    num++;
                    count += M[tmpx][tmpy];
                }
            }
        }
        return (int) Math.floor(count / num);
    }

    public static int smooth(int[][] M, int i, int j) {
        int count = M[i][j], num = 1;
        if (i - 1 >= 0 && j - 1 >= 0) {
            num++;
            count += M[i - 1][j - 1];
        }
        if (i - 1 >= 0 && j >= 0) {
            num++;
            count += M[i - 1][j];
        }
        if (i - 1 >= 0 && j + 1 < M[0].length) {
            num++;
            count += M[i - 1][j + 1];
        }
        if (i >= 0 && j - 1 >= 0) {
            num++;
            count += M[i][j - 1];
        }
        if (i >= 0 && j + 1 < M[0].length) {
            num++;
            count += M[i][j + 1];
        }
        if (i + 1 < M.length && j - 1 >= 0) {
            num++;
            count += M[i + 1][j - 1];
        }
        if (i + 1 < M.length && j >= 0) {
            num++;
            count += M[i + 1][j];
        }
        if (i + 1 < M.length && j + 1 < M[0].length) {
            num++;
            count += M[i + 1][j + 1];
        }
        return (int) Math.floor(count / num);
    }
}
