package leetcode;

//[7,1,5,3,6,4]
//[0,-6,4,-2,3,-2]

//[1,2,3,4,5]
//[0,1,1,1,1]

//[7,3,2,1,20]
//[0,-4,-1,-1,19]
public class lc122 {
    public int maxProfit(int[] prices) {
        int n = prices.length;
        int profit = 0;
        for(int i=1;i<n;++i) {
            int diff = prices[i] - prices[i-1];
            if(diff > 0) profit +=diff;
        }
        return profit;
    }
}
