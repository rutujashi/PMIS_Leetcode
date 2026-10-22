class Solution {
    public int maxProfit(int[] prices) {
        int mprice = Integer.MAX_VALUE;
        int maxProfit = 0;

        for(int price : prices)
        {
            if(price < mprice)
            {
                mprice = price;
            }

            if(price - mprice > maxProfit)
            {
                maxProfit = price - mprice;
            }
        }
        return maxProfit;
    }
}