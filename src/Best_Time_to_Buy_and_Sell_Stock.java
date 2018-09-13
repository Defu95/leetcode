public class Best_Time_to_Buy_and_Sell_Stock {
    public static void main(String[] args) {
        int[] prices = {7, 3, 4, 5, 1};
//        int[] prices={1,2,3,4,5};
//        int[] prices = {5, 4, 3, 2, 1};
        System.out.println(maxProfit(prices));
    }

    public static int maxProfit(int[] prices) {
//        if(prices.length<=1)
//            return 0;
//        int mprofit=0;
//        for(int i=0;i<prices.length;i++){
//            for(int j=i+1;j<prices.length;j++)
//                mprofit=Math.max(mprofit,prices[j]-prices[i]);
//        }
//        return mprofit;
        if (prices.length <= 1)
            return 0;
        int buy = prices[0], mp = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > buy)
                mp = Math.max(mp, prices[i] - buy);
            else
                buy = prices[i];
        }
        return mp;
    }
}
