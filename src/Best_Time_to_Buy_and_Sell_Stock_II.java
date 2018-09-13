public class Best_Time_to_Buy_and_Sell_Stock_II {
    public static void main(String[] args) {
//        int[] prices = {7, 1, 5, 3, 6, 4};
//        int[] prices={1,2,3,4,5};
        int[] prices = {5, 4, 3, 2, 1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
        int benifit = 0, flag = 0, sub = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] - prices[i - 1] > 0) {
                sub = prices[i] - prices[flag];
            } else {
                benifit += sub;
                flag = i;
                sub = 0;
            }
        }
        benifit += sub;
        return benifit;
    }
}
