package leetcode;

//[2,3,1,1,4]
//[2,4,3,4,8]

//[3,3,3,3,4]
public class lc55 {
    public boolean canJump(int[] nums) {
        int maxArrive = nums[0];
        int n = nums.length;
        for (int i=1;i<n;++i){
            int arrive = nums[i]+i;
            if(maxArrive < i) return false;
            maxArrive = Math.max(maxArrive,arrive);
        }
        return true;
    }
}
