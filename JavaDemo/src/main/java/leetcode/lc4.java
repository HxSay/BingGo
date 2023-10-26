package leetcode;

public class lc4 {

    public static void main(String[] args) {
        lc4 problem = new lc4();
        problem.removeDuplicates(new int[]{1,1,1,2,2,3});
    }
    //1,1,1,2,2,3
    //0,0,1,1,1,1,2,3,3
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int i=0,j=0;
        while (j < n){
            if(i<n){
                if(nums[i] == nums[j]){
                    ++j;
                }else{
                    if(i+1 < n ){
                        if(nums[i]==nums[i+1]){
                            if(i+2<n && j+1 < n){
                                nums[i+2] = nums[j];
                                i+=2;
                            }
                        }else{
                            ++i;
                        }
                    }
                }
            }
        }
        return i;
    }
}
