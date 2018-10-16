import java.util.HashSet;

public class Walking_Robot_Simulation {
    public static void main(String[] args) {
//        int[] commands = {4, -1, 4, -2, 4};
//        int[][] obstacles = {{2, 4}};
//        int[] commands = {4, -1, 3};
//        int[][] obstacles = {};
        int[] commands = {7, -2, -2, 7, 5};
        int[][] obstacles = {{-3, 2}, {-2, 1}, {0, 1}, {-2, 4}, {-1, 0}, {-2, -3}, {0, -3}, {4, 4}, {-3, 3}, {2, 2}};
        System.out.println(robotSim(commands, obstacles));
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
//        -2: turn left 90 degrees  -1: turn right 90 degrees
        int direct = 0;
        int[] pos = {0, 0};
        int distance = 0;
        int[][] directions = {{0, 1}, {1, 0}, {0, -1}, {-1, 0}};
        HashSet<String> set = new HashSet<>();
        for (int i = 0; i < obstacles.length; i++)
            set.add(String.valueOf(obstacles[i][0] + "," + String.valueOf(obstacles[i][1])));
        for (int command : commands) {
            if (command == -1)
                direct = (direct + 1) % 4;
            else if (command == -2) {
                direct = (direct - 1) % 4;
                if (direct < 0)
                    direct += 4;
            } else if (command >= 1 && command <= 9) {
                for (int i = 0; i < command; i++) {
                    int xnext = pos[0] + directions[direct][0];
                    int ynext = pos[1] + directions[direct][1];
                    String tmp = String.valueOf(xnext) + "," + String.valueOf(ynext);
                    if (set.contains(tmp))
                        break;
                    pos[0] += directions[direct][0];
                    pos[1] += directions[direct][1];
                    distance = Math.max(distance, pos[0] * pos[0] + pos[1] * pos[1]);
                }
            }
        }
        return distance;
    }
}
