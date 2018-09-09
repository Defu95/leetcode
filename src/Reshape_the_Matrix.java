public class Reshape_the_Matrix {
    public static void main(String[] args){
        int[][] nums ={{1,2},{3,4}};
        int r = 1, c = 4;
        Transpose_Matrix.Print_Matrix(matrixReshape(nums,r,c));
    }
    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if(nums.length*nums[0].length!=(r*c))
            return nums;
        int[] tmp=new int[r*c];
        int[][] res=new int[r][c];
        int k=0;
        for(int i=0;i<nums.length;i++)
            for(int j=0;j<nums[0].length;j++){
                tmp[k]=nums[i][j];
                k++;
            }
            k--;
        for(int i=r-1;i>=0;i--)
            for(int j=c-1;j>=0;j--){
                res[i][j]=tmp[k];
                k--;
            }
            return res;
    }
}
