public class Largest_Triangle_Area {
    public static void main(String[] args) {
//        int[][] points = {{0, 0}, {0, 1}, {1, 0}, {0, 2}, {2, 0}};
        int[][] points = {{35, -23}, {-12, -48}, {-34, -40}, {21, -25}, {-35, -44}, {24, 1}, {16, -9}, {41, 4}, {-36, -49}, {42, -49}, {-37, -20}, {-35, 11}, {-2, -36}, {18, 21}, {18, 8}, {-24, 14}, {-23, -11}, {-8, 44}, {-19, -3}, {0, -10}, {-21, -4}, {23, 18}, {20, 11}, {-42, 24}, {6, -19}};
        System.out.print(largestTriangleArea(points));
    }

    public static double largestTriangleArea(int[][] points) {
        double area = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                for (int k = j + 1; k < points.length; k++) {
                    double a = Math.sqrt(Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));
                    double b = Math.sqrt(Math.pow(points[i][0] - points[k][0], 2) + Math.pow(points[i][1] - points[k][1], 2));
                    double c = Math.sqrt(Math.pow(points[k][0] - points[j][0], 2) + Math.pow(points[k][1] - points[j][1], 2));
                    double p = (a + b + c) / 2;
                    area = Math.max(area, Math.sqrt(p * Math.abs(p - a) * Math.abs(p - b) * Math.abs(p - c)));
                }
            }
        }
        return area;
    }
}
