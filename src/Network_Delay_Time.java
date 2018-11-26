import java.util.*;

public class Network_Delay_Time {
//    public static void main(String[] args) {
//        int[][] times = {{2, 1, 1}, {2, 3, 1}, {3, 4, 1}};
//        int N = 4, K = 2;
//        System.out.print(networkDelayTime(times, N, K));
//    }

    public static int networkDelayTime(int[][] times, int N, int K) {
        HashMap<Integer, HashMap<Integer, Integer>> map = new HashMap<>();
        for (int i = 0; i < times.length; i++) {
            map.putIfAbsent(times[i][0], new HashMap<>());
            map.get(times[i][0]).putIfAbsent(times[i][1], times[i][2]);
        }
        int[] visit = new int[N + 1];
        for (int i = 1; i < visit.length; i++) {
            visit[i] = Integer.MAX_VALUE;
        }
        PriorityQueue<int[]> pq = new PriorityQueue<>((a, b) -> a[1] - b[1]);
        pq.add(new int[]{K, 0});
        while (!pq.isEmpty()) {
            int[] cur = pq.poll();

            List<Integer> res=new ArrayList<>();
            int node = cur[0];
            int len = cur[1];
            visit[node] = Math.min(visit[node], len);
            if (map.containsKey(node)) {
                for (Integer neighbor : map.get(node).keySet()) {
                    if (visit[neighbor] == Integer.MAX_VALUE) {
                        int newlen = visit[node] + map.get(node).get(neighbor);
                        pq.add(new int[]{neighbor, newlen});
                    }
                }
            }
        }
        int max = -1;
        for (int i = 1; i < visit.length; i++) {
            if (visit[i] == Integer.MAX_VALUE)
                return -1;
            else
                max = Math.max(max, visit[i]);
        }
        return max;
    }

    public static void main(String[] args) {
        System.out.print(Sum_Solution(5));
    }
    public static int Sum_Solution(int n) {
        int res = n;
//        boolean flag = (n>0)&&((res+=Sum_Solution(n-1))>0);
        if(n-1>0){
            res+=Sum_Solution(n-1);
        }
        return res;
    }
}
