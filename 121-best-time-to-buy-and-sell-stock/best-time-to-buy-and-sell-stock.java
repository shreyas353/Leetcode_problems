class Solution 
{
    public int maxProfit(int[] prices) 
    {
        int min = Integer.MAX_VALUE;
        int maxProfit = 0;
        for (int i = 0; i < prices.length; i++) 
        {
            if (prices[i] < min) 
            {
                min = prices[i];
            }
            int currentProfit = prices[i] - min;
            if (currentProfit > maxProfit) 
            {
                maxProfit = currentProfit;
            }
        }
        return maxProfit;
    }
}