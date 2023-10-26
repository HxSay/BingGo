package leetcode;

public class lc11 {
    public static void main(String[] args) {
        maxArea(new int[]{1,8,6,2,5,4,8,3,7});
    }
    /**
     * [1,8,6,2,5,4,8,3,7] => 49
     * @param height
     * @return
     */
    public static int maxArea(int[] height) {
        int n = height.length;
        int i = 0,j=n-1;
        int ans = 0;
        while(i+1<n && height[i]<height[i+1]){
            ans = Math.max(Math.min(height[i],height[j])*(j-i),ans);
            ++i;
        }
        while(j-1>i && height[j]<height[j-1]){
            --j;
            ans = Math.max(Math.min(height[i],height[j])*(j-i),ans);
        }
        return Math.max(Math.min(height[i],height[j])*(j-i),ans);
    }
}
