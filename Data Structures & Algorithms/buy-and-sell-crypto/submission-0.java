class Solution {
    public int maxProfit(int[] prices) {
        int maxProfit=0;
        int n=prices.length;
        for(int i=n-1;i>0;i--){
            for(int j=i-1;j>=0;j--){
                if(prices[i]-prices[j]>0){
                    maxProfit=Math.max(maxProfit,prices[i]-prices[j]);
                }
            }
        }
        return maxProfit;
    }
}
