package leetcode;

public class lc238 {
    public static void main(String[] args) {
        productExceptSelf(new int[]{1,2,3,4});
    }
    public static int[] productExceptSelf(int[] nums) {
        int n = nums.length;
        int[] arr1 = new int[n];
        int[] arr2 = new int[n];
        arr1[0] = nums[0];
        for(int i=1;i<n;++i){
            arr1[i] = arr1[i-1]*nums[i];
        }
        arr2[n-1] = nums[n-1];
        for(int i=n-2;i>=0;--i){
            arr2[i] = nums[i]*arr2[i+1];
        }
        int[] ans = new int[n];
        for(int i=0;i<n;++i){
            if(i==0){
                ans[i] = arr2[i+1];
            }else if(i==n-1){
                ans[i] = arr1[i-1];
            }else {
                ans[i] = arr1[i - 1] * arr2[i + 1];
            }
        }
        return ans;
    }
}
