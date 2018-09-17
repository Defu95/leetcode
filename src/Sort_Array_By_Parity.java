public class Sort_Array_By_Parity {
    public static void main(String[] args) {
//        int[] A = {3, 1, 2, 4};
        int[] A = {1, 3};
        int[] res = sortArrayByParity(A);
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i]);
    }

    public static int[] sortArrayByParity(int[] A) {
        int left = 0, right = A.length - 1;
        while (left < right) {
            while (left < A.length && A[left] % 2 == 0)
                left++;
            while (right >= 0 && A[right] % 2 == 1)
                right--;
            if (left >= right)
                break;
            int tmp = A[left];
            A[left] = A[right];
            A[right] = tmp;
            left++;
            right--;
        }
        return A;
    }
}
