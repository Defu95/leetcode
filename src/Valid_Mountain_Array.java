public class Valid_Mountain_Array {
    public static void main(String[] args) {
        int[] A = {0, 3, 2, 1};
        System.out.print(validMountainArray(A));
    }

    public static boolean validMountainArray(int[] A) {
        if (A.length <= 2)
            return false;
        int i = 0;
        for (; i < A.length - 1; i++) {
            if (A[i] >= A[i + 1])
                break;
        }
        if (i >= A.length - 1 || i == 0)
            return false;
        for (int j = i; j < A.length - 1; j++) {
            if (A[j] <= A[j + 1])
                return false;
        }
        return true;
    }
}
