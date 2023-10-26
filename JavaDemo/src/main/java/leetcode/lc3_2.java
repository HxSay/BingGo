package leetcode;

import java.util.HashMap;

public class lc3_2 {
    public static void main(String[] args) {
        System.out.println(lengthOfLongestSubstring("abba"));
    }
    /**
     * Input: s = "abcabcbb"
     * Output: 3
     * Explanation: The answer is "abc", with the length of 3.
     */
    public static int lengthOfLongestSubstring(String s) {
        int n = s.length();
        HashMap<Character,Integer> hashMap = new HashMap<>();
        int i = 0,ans=0;
        for(int j=0;j<n;++j){
            char ch = s.charAt(j);
            if(!hashMap.containsKey(ch)){
                hashMap.put(ch,j);
            } else {
                i = Math.max(i,hashMap.get(ch)+1);
                hashMap.replace(ch,j);
            }
            ans = Math.max(ans,j-i+1);
        }
        return ans;
    }
}
