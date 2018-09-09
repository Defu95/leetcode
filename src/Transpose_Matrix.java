public class Transpose_Matrix {
    public static void main(String[] args){
        int[][] A={{1,2,3},{4,5,6},{7,8,9}};
        int[][] B=transpose(A);
        Print_Matrix(B);
    }

    public static int[][] transpose(int[][] A) {
        int row=A[0].length,col=A.length;
        int[][] res=new int[row][col];
        for(int i=0;i<A.length;i++)
            for(int j=0;j<A[0].length;j++)
                res[j][i]=A[i][j];
        return res;
    }
    public static void Print_Matrix(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++)
                System.out.print(A[i][j]);
            System.out.println();
        }
    }
}
