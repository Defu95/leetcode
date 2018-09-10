public class Max_Area_of_Island {
    public static void main(String[] args){
        int[][] gird={{0,0,1,0,0,0,0,1,0,0,0,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,1,1,0,1,0,0,0,0,0,0,0,0},
                {0,1,0,0,1,1,0,0,1,0,1,0,0},
                {0,1,0,0,1,1,0,0,1,1,1,0,0},
                {0,0,0,0,0,0,0,0,0,0,1,0,0},
                {0,0,0,0,0,0,0,1,1,1,0,0,0},
                {0,0,0,0,0,0,0,1,1,0,0,0,0}};
        System.out.print(maxAreaOfIsland(gird));
    }

    public static int maxAreaOfIsland(int[][] grid) {
        int count=0;
        for(int i=0;i<grid.length;i++){
            for(int j=0;j<grid[0].length;j++){
                if(grid[i][j]==1)
                    count=Math.max(count,searchgrid(grid,i,j));
            }
        }
        return count;
    }
    public static int searchgrid(int[][] subgrid,int i,int j){
        if(i>=0&&i<subgrid.length&&j>=0&&j<subgrid[0].length&&subgrid[i][j]==1){
            subgrid[i][j]=0;
            return 1+searchgrid(subgrid,i-1,j)+searchgrid(subgrid,i+1,j)+searchgrid(subgrid,i,j-1)+searchgrid(subgrid,i,j+1);
        }
        return 0;
    }
}
