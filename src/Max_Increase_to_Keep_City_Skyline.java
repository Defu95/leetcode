public class Max_Increase_to_Keep_City_Skyline {
    public static void main(String[] args) {
        int[][] grid = {{3, 0, 8, 4}, {2, 4, 5, 7}, {9, 2, 6, 3}, {0, 3, 1, 0}};
        int increase = maxIncreaseKeepingSkyline(grid);
//        for(int i=0;i<grid.length;i++){
//            for(int j=0;j<grid[0].length;j++)
//                System.out.print(increase[i][j]);
//            System.out.println();
//        }
        System.out.println(increase);
    }

    public static int maxIncreaseKeepingSkyline(int[][] grid) {
        int[] row = new int[grid.length];
        int[] col = new int[grid[0].length];
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > row[i])
                    row[i] = grid[i][j];
                if (grid[i][j] > col[j])
                    col[j] = grid[i][j];
            }
        }
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                count += Math.min(row[i], col[j]) - grid[i][j];
            }
        }
        return count;
    }
}
