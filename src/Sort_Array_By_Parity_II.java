public class Sort_Array_By_Parity_II {
    public static void main(String[] args) {
//        int[] A = {2, 3};
//        int[] A = {2, 3, 1, 1, 4, 0, 0, 4, 3, 3};
        int[] A={4,2,5,7};
//        int[] A = {648, 831, 560, 986, 192, 424, 997, 829, 897, 843};
        int[] res = sortArrayByParityII(A);
        for (int a : res)
            System.out.print(a + " ");
    }

    public static int[] sortArrayByParityII(int[] A) {
        if (A.length <= 1)
            return A;
        for (int i = 0; i < A.length; i++) {
            if (!parity(A, i)) {
                for (int j = i + 1; j < A.length; j++) {
                    if (!parity(A, j) && (i % 2 != j % 2)) {
                        swap(A, i, j);
                        break;
                    }
                }
            }
        }
        return A;
    }

    public static void swap(int[] A, int i, int j) {
        int tmp = A[i];
        A[i] = A[j];
        A[j] = tmp;
        return;
    }

    public static boolean parity(int[] A, int i) {
        if (i % 2 == 0)
            return A[i] % 2 == 0;
        else
            return A[i] % 2 == 1;
    }
}
