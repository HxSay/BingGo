package leetcode;

import java.util.Arrays;

/**
 Input: nums =  [1,2,3,4, 5,6,7], k = 3,n = 7
                [-1,-100,3,99], k=2
 Output: [5,6,7,1,2,3,4]
 */
public class lc189 {
    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7};
        rotate(nums,3);
    }
    public static void rotate(int[] nums, int k) {
        int n = nums.length;
        k = k%n;
        int[] copyNum = Arrays.copyOf(nums,n);
        int j = 0;
        for(int i=0;i<k;++i){
            nums[j++] = copyNum[n-k+i];
        }
        for(int i=0;i<n-k;++i){
            nums[j++] = copyNum[i];
        }
        System.out.println(Arrays.toString(nums));
    }
    public static void rotate2(int[] nums, int k){

    }
}
