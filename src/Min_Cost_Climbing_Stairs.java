public class Min_Cost_Climbing_Stairs {
    public static void main(String[] args){
         int[] cost={1, 100, 1, 1, 1, 100, 1, 1, 100, 1};
         System.out.println(minCostClimbingStairs(cost));
    }
    public static int minCostClimbingStairs(int[] cost) {
        int length=cost.length;
        int[] dp=new int[length+1];
        dp[0]=0;dp[1]=0;
        for(int i=2;i<=length;i++){
            dp[i]=Math.min(dp[i-2]+cost[i-2],dp[i-1]+cost[i-1]);
        }
        return dp[length];
    }
}
