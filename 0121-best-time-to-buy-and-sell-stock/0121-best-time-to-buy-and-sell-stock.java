class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit = 0;
        int bp = prices[0];
        for(int i=0;i<prices.length;i++){
            bp = Math.min(bp,prices[i]);
            maxProfit = Math.max(maxProfit,prices[i]-bp);
        }
        return maxProfit;
        
    }
}