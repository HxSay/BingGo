package leetcode;

public class lc80 {
    public static void main(String[] args) {
        int[] nums = new  int[]{0,1,1,1,1,2,3,3};
        int n = removeDuplicates(nums);
        for(int i=0;i<n;++i){
            System.out.print(nums[i]);
        }
    }
    public static int removeDuplicates(int[] nums) {
        int i=0,j=0;
        int n = nums.length;
        boolean isOne = true;
        if(i+1<n && nums[i]== nums[i+1]) isOne=false;
        while(j<n){
            while(j<n && i<n && nums[i]==nums[j]) ++j;
            if(isOne){
                if(i+1<j && j<n){
                    for(int k=i+1;k<j;++k) nums[k] = nums[j];
                }
            }else{
                if(i+2<j && j<n){
                    for(int k=i+2;k<j;++k) nums[k] = nums[j];
                }
            }
            if(isOne) i++;
            else i+=2;
            if(j+1<n && nums[j] == nums[j+1]){
                isOne = false;
            }else{
                isOne = true;
            }
        }
        return i;
    }
}
