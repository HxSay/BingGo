package leetcode;

public class lc {
    public static void main(String[] args) {
        int[] nums = new  int[]{1,1,2,2,3};
        int n = removeDuplicates(nums);
        for(int i=0;i<n;++i){
            System.out.print(nums[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {
        int i=0,j=0;
        int n = nums.length;
        while(j<n){
            while(j<n && nums[i] == nums[j]) ++j;
            for(int k=i+1;k<j && k<n;++k) {
                if (j < n) {
                    nums[k] = nums[j];
                }
            }
            i++;
        }
        return i;
    }
}
