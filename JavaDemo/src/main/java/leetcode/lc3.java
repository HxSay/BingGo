package leetcode;

public class lc3 {
    public static void main(String[] args) {
        removeDuplicates(new int[]{1,1,2});
    }

    public static int removeDuplicates(int[] nums) {
        int i=0,j=0;
        int n = nums.length;
        while(i<n){
            j=i;
            while(j<n && nums[i] == nums[j]) ++j;
            if(j<n && i+1<n){
                for(int k=i+1;k<j;++k){
                    nums[k] = nums[j];
                }
            }else ++i;
        }
        return i+1;
    }
}
