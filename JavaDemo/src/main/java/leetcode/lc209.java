package leetcode;

import java.util.ArrayList;
import java.util.Arrays;

public class lc209 {
    public static void main(String[] args) {
        System.out.println(minSubArrayLen(15,new int[]{1,2,3,4,5}));
    }
    /**
     * Input: target = 7, nums = [2,3,1,2,4,3]
     * Output: 2
     * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
     *
     * dp[i][i] = nums[i];
     * dp[i][j] = dp[i-1][j]+nums[j];
     * dp[0][j] = dp[0][j-1]+nums[j];
     * dp[i][0] = dp[i-1][0]+nums[i];
     */
    public static int minSubArrayLen2(int target, int[] nums) {
        int n = nums.length;
        int ans = Integer.MAX_VALUE;
        int[][] dp = new int[n][n];
        for(int i=0;i<n;++i){
            for(int j=i;j<n;++j){
                if(i == j){
                    dp[i][j] = nums[i];
                } else{
                    dp[i][j] = dp[i][j-1]+nums[j];
                }
                if(dp[i][j] >= target) {
                    ans = Math.min(ans, j-i);
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0:ans;
    }

    /**
     * Input: target = 7, nums = [2,3,1,2,4,3]
     * Output: 2
     * Explanation: The subarray [4,3] has the minimal length under the problem constraint.
     * 滑动窗口，注意结束条件比较麻烦
     * */
    public static int minSubArrayLen3(int target, int[] nums) {
        int n = nums.length;
        int i=0,j=0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        while(i <= j){
            if(sum < target && j>=n) break;
            if(sum >= target){
                ans = Math.min(j-i,ans);
                if(i<n) sum-=nums[i++];
            }else{
                if(j<n) sum = sum+nums[j++];
            }
        }
        return ans == Integer.MAX_VALUE ? 0:ans;
    }

    public static int minSubArrayLen(int target, int[] nums) {
        int n = nums.length;
        int i=0;
        int sum = 0;
        int ans = Integer.MAX_VALUE;
        for(int j=0;j<n;++j){
            sum+=nums[j];
            if(sum >= target){
                while(i < n && sum >= target) {
                    ans = Math.min(ans, j - i);
                    sum -= nums[i++];
                }
            }
        }
        return ans == Integer.MAX_VALUE ? 0:ans;
    }
}
