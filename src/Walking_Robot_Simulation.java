import java.util.HashMap;

public class Walking_Robot_Simulation {
    public static void main(String[] args) {
        int[] commands = {4, -1, 4, -2, 4};
        int[][] obstacles = {{2, 4}};
        System.out.println(robotSim(commands, obstacles));
    }

    public static int robotSim(int[] commands, int[][] obstacles) {
//        -2: turn left 90 degrees  -1: turn right 90 degrees
        int direct=0;int[] pos={0,0};int distance=0;
        HashMap<Integer,Integer> map=new HashMap<>();
        for(int i=0;i<obstacles.length;i++)
            map.put(obstacles[i][0],obstacles[i][1]);
        for(int a:commands){

        }
        return 0;
    }
}
