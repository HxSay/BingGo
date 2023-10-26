package leetcode;

import java.util.Arrays;

public class lc2 {
    public static void main(String[] args) {
        int[] nums = new int[]{2,2,3};
        int element = removeElement(nums, 2);
        System.out.println(element);
    }

    public static int removeElement(int[] nums, int val) {
        int n = nums.length;
        int j = n-1,i=0;
        int count = 0;
        int temp = 0;
        for (i=0;i<n;++i){
            if(nums[i]==val) count++;
        }
        for(i=0;i<j;++i){
            if(nums[i] == val){
                while(j>=0 && nums[j]==val) --j;
                if(j>=0 && i<j){
                    temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        return n-count;
    }
}
