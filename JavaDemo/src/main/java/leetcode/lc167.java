package leetcode;

import java.util.HashMap;

public class lc167 {
    public static void main(String[] args) {
        twoSum(new int[]{2,7,11,15},9);
    }
    /**
     * 二分查找
     * Input: numbers = [2,7,11,15], target = 9
     * Output: [1,2]
     */
    public static int[] twoSum(int[] numbers, int target) {
        int n = numbers.length;
        int i = 0,j = n-1;
        while (i<j){
            int sum = numbers[i]+numbers[j];
            if(target == sum) return new int[]{i+1,j+1};
            else if(target > sum){
                i++;
            }else {
                j--;
            }
        }
        return new int[]{};
    }
}
