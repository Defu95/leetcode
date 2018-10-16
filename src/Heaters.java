import java.util.Arrays;

public class Heaters {
    public static void main(String[] args) {
//        int[] houses = {1, 2, 3, 4};
//        int[] heateres = {1, 4};
//        int[] houses = {1, 5};
//        int[] heateres = {2};
        int[] houses = {1, 2, 3, 5, 15};
        int[] heateres = {2, 30};
//        int[] houses = {282475249, 622650073, 984943658, 144108930, 470211272, 101027544, 457850878, 458777923};
//        int[] heateres = {823564440, 115438165, 784484492, 74243042, 114807987, 137522503, 441282327, 16531729, 823378840, 143542612};
        System.out.print(findRadius(houses, heateres));
    }

    public static int findRadius(int[] houses, int[] heaters) {
        Arrays.sort(houses);
        Arrays.sort(heaters);
        int distance = 0, i = 0;
        for (int house : houses) {
            while (i < heaters.length - 1 && Math.abs(heaters[i + 1] - house) <= Math.abs(heaters[i] - house))
                i++;
            distance = Math.max(distance, Math.abs(heaters[i] - house));
        }
        return distance;
    }
}
