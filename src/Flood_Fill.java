public class Flood_Fill {
    public static void main(String[] args) {
//        int[][] image = {{1,1,1},{1,1,0},{1,0,1}};
//        int sr = 1, sc = 1, newColor = 2;
        int[][] image = {{0, 0, 0}, {0, 1, 2}};
        int sr = 1, sc = 1, newColor = 1;
        int[][] res = floodFill(image, sr, sc, newColor);
        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++)
                System.out.print(res[i][j] + " ");
            System.out.println();
        }
    }

    public static int[][] floodFill(int[][] image, int sr, int sc, int newColor) {
        int flag = image[sr][sc];
        if (image[sr][sc] == newColor)
            return image;
        image[sr][sc] = newColor;
        if (sr - 1 >= 0 && image[sr - 1][sc] == flag)
            floodFill(image, sr - 1, sc, newColor);
        if (sr + 1 < image.length && image[sr + 1][sc] == flag)
            floodFill(image, sr + 1, sc, newColor);
        if (sc - 1 >= 0 && image[sr][sc - 1] == flag)
            floodFill(image, sr, sc - 1, newColor);
        if (sc + 1 < image[0].length && image[sr][sc + 1] == flag)
            floodFill(image, sr, sc + 1, newColor);
        return image;
    }
}
