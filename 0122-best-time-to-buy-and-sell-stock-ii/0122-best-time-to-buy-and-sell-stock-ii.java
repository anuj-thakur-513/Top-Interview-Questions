class Solution {
    public int maxProfit(int[] prices) {
        // here the only thing that matters to us is buying on a valley
        // and selling on the peak for max profit
        int i = 0, valley = prices[0], peak = prices[0];
        int maxProfit = 0;

        while(i < prices.length - 1) {
            // finding the valley
            while(i < prices.length - 1 && prices[i] >= prices[i + 1]) {
                i += 1;
            }
            // got our valley point
            valley = prices[i];

            // finding the peak
            while(i < prices.length - 1 && prices[i] <= prices[i + 1]) {
                i += 1;
            }
            // got the peak point
            peak = prices[i];
            
            maxProfit += peak - valley;
        }

        return maxProfit;


        // a simpler way to do the same:
        // int maxprofit = 0;
        // for (int i = 1; i < prices.length; i++) {
        //     if (prices[i] > prices[i - 1])
        //         maxprofit += prices[i] - prices[i - 1];
        // }
        // return maxprofit;
    }
}