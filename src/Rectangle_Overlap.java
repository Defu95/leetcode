public class Rectangle_Overlap {
    public static void main(String[] args) {
        int[] rec1 = {0, 0, 3, 3};
        int[] rec2 = {1, 1, 2, 2};
        System.out.print(isRectangleOverlap(rec1, rec2));
    }

    public static boolean isRectangleOverlap(int[] rec1, int[] rec2) {
        int x = Math.min(rec1[2], rec2[2]) - Math.max(rec1[0], rec2[0]);
        int y = Math.min(rec1[3], rec2[3]) - Math.max(rec1[1], rec2[1]);
        return (x > 0 && y > 0) ? true : false;
    }
}
