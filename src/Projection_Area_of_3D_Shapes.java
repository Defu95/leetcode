public class Projection_Area_of_3D_Shapes {
    public static void main(String[] args) {
//        int[][] grid = {{2}};
//        int[][] grid={{1,1,1},{1,0,1},{1,1,1}};
        int[][] grid={{1,2},{3,4}};
        System.out.print(projectionArea(grid));
    }

    public static int projectionArea(int[][] grid) {
        int left = 0, front = 0, over = 0;
        for (int i = 0; i < grid.length; i++) {
            int l = 0;
            for (int j = 0; j < grid[0].length; j++) {
                if (grid[i][j] > 0)
                    over++;
                l = Math.max(grid[i][j], l);
            }
            left += l;
        }
        for (int i = 0; i < grid[0].length; i++) {
            int f = 0;
            for (int j = 0; j < grid.length; j++) {
                f = Math.max(grid[j][i], f);
            }
            front += f;
        }
        return left + front + over;
    }
}
