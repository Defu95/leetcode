import java.util.HashMap;

public class Number_of_Boomerangs {
    public static void main(String[] args) {
//        int[][] points = {{1, 0}, {0, 0}, {2, 0}};
        int[][] points = {{0, 0}, {1, 0}, {-1, 0}, {0, 1}, {0, -1}};
        System.out.print(numberOfBoomerangs(points));
    }

    public static int numberOfBoomerangs(int[][] points) {
        int res = 0;
        HashMap<Double, Integer> map = new HashMap<>();
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                if (j != i) {
                    double dis = Math.sqrt(Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2));
                    if (map.containsKey(dis)) {
                        res += 2 * map.get(dis);
                        map.put(dis, map.get(dis) + 1);
                    } else
                        map.put(dis, 1);
                }
            }
            map.clear();
        }
        return res;
    }
}
