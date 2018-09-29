public class Surface_Area_of_3D_Shapes {
    public static void main(String[] args) {
//        int[][] grid = {{2, 2, 2}, {2, 1, 2}, {2, 2, 2}};
        int[][] grid = {{1, 0}, {0, 2}};
        System.out.println(surfaceArea(grid));
    }

    public static int surfaceArea(int[][] grid) {
        int area = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                if(grid[i][j]>0) area += grid[i][j] * 4 + 2;
                if (i > 0) area -= Math.min(grid[i - 1][j], grid[i][j]);
                if (i < grid.length - 1) area -= Math.min(grid[i][j], grid[i + 1][j]);
                if (j > 0) area -= Math.min(grid[i][j - 1], grid[i][j]);
                if (j < grid[0].length - 1) area -= Math.min(grid[i][j], grid[i][j + 1]);
            }
        }
        return area;
    }
}
