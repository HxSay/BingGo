package leetcode;

public class lc121 {

    public int maxProfit(int[] prices) {
        int minVal = prices[0];
        int maxProfit = 0;
        for(int i=1;i<prices.length;++i){
            maxProfit = Math.max(maxProfit,prices[i]-minVal);
            minVal = Math.min(prices[i],minVal);
        }
        return maxProfit;
    }
}
