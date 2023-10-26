package leetcode;

import java.util.Arrays;

public class lc1 {
    public static void main(String[] args) {
        int[] num1 = new int[]{1,2,3,0,0,0};
        int[] num2 = new int[]{2,5,6};
        merge(num1,3,num2,3);
        System.out.println(Arrays.toString(num1));
    }

    public static void merge(int[] nums1,int m,int[] nums2,int n){
        int i=m-1,j=n-1;
        int index = m+n-1;
        while(i>=0 && j>=0){
            if(nums1[i] >= nums2[j]) nums1[index--] = nums1[i--];
            else nums1[index--] = nums2[j--];
        }
        while(i>=0){
            nums1[index--] = nums1[i--];
        }
        while(j>=0){
            nums1[index--] = nums2[j--];
        }
    }
}
