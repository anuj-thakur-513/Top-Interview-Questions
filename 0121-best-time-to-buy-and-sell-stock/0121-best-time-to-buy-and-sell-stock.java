class Solution {
    public int maxProfit(int[] prices) { 
        int maxProfit = 0, buyPrice = Integer.MAX_VALUE;
        for(int price: prices){
            if(buyPrice > price){
                buyPrice = price;
            } else{
                maxProfit = Math.max(maxProfit, price - buyPrice);
            }
        }
        return maxProfit;
    }
}