class Solution {
    public int maxProfit(int[] prices) {
       int profit=0;
       int min=Integer.MAX_VALUE;
       for(int i=0;i<prices.length;i++){
        if(prices[i]<min){
            min=prices[i];
        }
        else{
            int profit1=prices[i]-min;
            profit=Math.max(profit,profit1);
        }
       }
       return profit;
    }
}