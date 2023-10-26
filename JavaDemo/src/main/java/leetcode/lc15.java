package leetcode;

import java.util.*;

/**
 * Input: nums = [-1,0,1,2,-1,-4]
 * Output: [[-1,-1,2],[-1,0,1]]
 */
public class lc15 {
    public static List<List<Integer>> threeSum(int[] nums) {
        int n = nums.length;
        Set<List<Integer>> retList = new HashSet<>();
        for(int i=0;i<n;++i){
            int target = -nums[i];
            HashMap<Integer,Integer> hashMap = new HashMap<>();
            for(int j=i+1;j<n;++j){
                int sub = target-nums[j];
                if(hashMap.containsKey(sub)){
                    List<Integer> tempList = Arrays.asList(nums[i],sub,nums[j]);
                    Collections.sort(tempList);
                    retList.add(tempList);
                }else{
                    hashMap.put(nums[j],j);
                }
            }
        }
        return new ArrayList<>(retList);
    }

}
