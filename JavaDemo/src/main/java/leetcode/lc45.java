package leetcode;

//[2,3,1,1,4]
public class lc45 {
    public int jump(int[] nums) {
        int step = 0;
        int maxArrive = nums[0];
        int n = nums.length;
        for(int i=1;i<n;++i){
            if(maxArrive >= n-1) return step;
            int arrive = nums[i]+i;
            if(maxArrive > arrive) step++;
            maxArrive = Math.max(maxArrive,arrive);
        }
        return step == 0 ? step:step+1;
    }
}
