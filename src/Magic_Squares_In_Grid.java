import java.util.HashSet;

public class Magic_Squares_In_Grid {
    public static void main(String[] args){
        int[][] grid={{4,3,8,4},
                {9,5,1,9},
                {2,7,6,2}};
        System.out.print(numMagicSquaresInside(grid));
    }

    public static int numMagicSquaresInside(int[][] grid) {
//        if (grid[0].length<3||grid.length<3)
//            return 0;
//        int count=0;int[][] tmp=new int[3][3];
//        for(int i=0;i<grid[0].length-2;i++){
//            for(int j=0;j<grid.length-2;j++){
//                for(int m=0;m<3;m++){
//                    for(int n=0;n<3;n++)
//                        tmp[m][n]=grid[j+m][i+n];
//                }
//                if(ismagic(tmp))
//                    count++;
//            }
//        }
//        return count;
//    }
//
//    public static boolean ismagic(int[][] subgrid){
//        HashSet<Integer> set=new HashSet<>();
//        for(int i=0;i<3;i++){
//            for(int j=0;j<3;j++){
//                if(subgrid[i][j]>9)
//                    return false;
//                if(!set.contains(subgrid[i][j]))
//                    set.add(subgrid[i][j]);
//            }
//        }
//        if(set.size()<9)
//            return false;
//        for(int i=0;i<3;i++){
//            if((subgrid[i][0]+subgrid[i][1]+subgrid[i][2])!=15)
//                return false;
//            if((subgrid[0][i]+subgrid[1][i]+subgrid[2][i])!=15)
//                return false;
//        }
//        if((subgrid[0][0]+subgrid[1][1]+subgrid[2][2]!=15)||(subgrid[0][2]+subgrid[1][1]+subgrid[2][0]!=15))
//            return false;
//        return true;


        if (grid[0].length<3||grid.length<3)
            return 0;
        int count=0;
        for(int i=0;i<grid.length-2;i++){
            for(int j=0;j<grid[0].length-2;j++){
                if(ismagic(grid,i,j))
                    count++;
            }
        }
        return count;
    }

    public static boolean ismagic(int[][] subgrid,int a,int b){
        HashSet<Integer> set=new HashSet<>();
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                if(subgrid[i+a][j+b]>9)
                    return false;
                if(!set.contains(subgrid[i+a][j+b]))
                    set.add(subgrid[i+a][j+b]);
            }
        }
        if(set.size()<9)
            return false;
        for(int i=0;i<3;i++){
            if((subgrid[a+i][b]+subgrid[a+i][b+1]+subgrid[a+i][b+2])!=15)
                return false;
            if((subgrid[a][b+i]+subgrid[a+1][b+i]+subgrid[a+2][b+i])!=15)
                return false;
        }
        if((subgrid[a][b]+subgrid[a+1][b+1]+subgrid[a+2][b+2]!=15)||(subgrid[a][b+2]+subgrid[a+1][b+1]+subgrid[a+2][b]!=15))
            return false;
        return true;
    }
}
