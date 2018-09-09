public class Flipping_an_Image {
    public static void main(String[] args){
        int[][] A={{1,1,0},{1,0,1},{0,0,0}};
        int[][] B=flipAndInvertImage(A);
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++)
                System.out.print(A[i][j]+" ");
            System.out.println();
        }
    }


    public static int[][] flipAndInvertImage(int[][] A) {
        for(int i=0;i<A.length;i++){
            int left=0,right=A[0].length-1;
            while (left<=right){
                if(A[i][left]==A[i][right]){
                    if(A[i][left]==1){
                        A[i][left]=0;
                        A[i][right]=0;
                    }else{
                        A[i][left]=1;
                        A[i][right]=1;
                    }
                }
                left++;right--;
            }
        }
//        Reverse_Row(A);
//        Reverse_Matrix(A);
        return A;
    }
    public static void Reverse_Row(int[][] A){
        for(int i=0;i<A.length;i++){
            int left=0,right=A[0].length-1;
            while (left<right){
                int tmp=A[i][left];
                A[i][left]=A[i][right];
                A[i][right]=tmp;
                left++;
                right--;
            }
        }
    }
    public static void Reverse_Matrix(int[][] A){
        for(int i=0;i<A.length;i++){
            for(int j=0;j<A[0].length;j++)
                if(A[i][j]==1)
                    A[i][j]=0;
                else
                    A[i][j]=1;
        }
    }
}
