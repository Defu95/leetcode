public class Island_Perimeter {
    public static void main(String[] args) {
        int[][] grid = {{0, 1, 0, 0},
                {1, 1, 1, 0},
                {0, 1, 0, 0},
                {1, 1, 0, 0}};
        System.out.print(islandPerimeter(grid));
    }

    public static int islandPerimeter(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++)
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    count+=boundary(grid,i,j);
            }
        return count;
    }

    public static int boundary(int[][] grid,int i,int j){
        int bound=0;
        if(i-1<0)
            bound++;
        else if(grid[i-1][j]==0)
            bound++;
        if(i+1>grid.length-1)
            bound++;
        else if(grid[i+1][j]==0)
            bound++;
        if(j-1<0)
            bound++;
        else if(grid[i][j-1]==0)
            bound++;
        if(j+1>grid[i].length-1)
            bound++;
        else if(grid[i][j+1]==0)
            bound++;
        return bound;
    }
}
