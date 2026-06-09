class Solution {
    public int maxProfit(int[] prices) {
        // int sol = 0;
        // for(int i=0;i<prices.length-1;i++){
        //     for(int j=i+1;j<prices.length;j++){
        //         sol = Math.max(prices[j] - prices[i] , sol);
        //     }
        // }
        // return sol;

        int maxProfit =0;
        int profit =0;
        int minBuyPrice = Integer.MAX_VALUE;
        for(int i=0;i<prices.length;i++){
            minBuyPrice = Math.min(minBuyPrice, prices[i]);
             profit = prices[i] - minBuyPrice;
             maxProfit = Math.max(maxProfit,profit);
        }
        return maxProfit;
    }
}
