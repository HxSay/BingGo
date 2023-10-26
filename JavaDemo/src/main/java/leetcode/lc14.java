package leetcode;

import java.util.ArrayList;
import java.util.Stack;
import java.util.Vector;

/**
 * Input: strs = ["flower","flow","flight"]
 * Output: "fl"
 */
public class lc14 {
    public static void main(String[] args) {
        System.out.println(longestCommonPrefix(new String[]{"aaa","aa","aaa"}));
    }
    public static String longestCommonPrefix(String[] strs) {
        int n = strs.length;
        String first = strs[0];
        int i;
        for(i=0;i<first.length();++i){
            char ch = first.charAt(i);
            for(int j=1;j<n;++j){
                if(i<strs[j].length()){
                    if(ch != strs[j].charAt(i)) {
                        return first.substring(0, i);
                    }
                }else{
                    return first.substring(0,i+1);
                }
            }
        }
        return first;
    }
}
