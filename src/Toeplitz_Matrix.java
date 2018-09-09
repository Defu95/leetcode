public class Toeplitz_Matrix {
    public static void main(String[] args){
        int[][] matrix ={{1,2,3,4},
                         {5,1,2,3},
                         {9,5,2,2}};
        System.out.println(isToeplitzMatrix(matrix));
    }
    public static boolean isToeplitzMatrix(int[][] matrix) {
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                int n=1;
                while (i+n<matrix.length&&j+n<matrix[0].length){
                    if(matrix[i][j]!=matrix[i+n][j+n])
                        return false;
                    j++;
                }
            }
        }
        return true;
    }
}
