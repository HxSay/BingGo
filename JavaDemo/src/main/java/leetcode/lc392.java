package leetcode;

public class lc392 {
    public static void main(String[] args) {
        isSubsequence("abc","ahbgdc");
    }
    /**
     * Input: s = "abc", t = "ahbgdc"
     * Output: true
     */
    public static boolean isSubsequence(String s, String t) {
        int sLen = s.length();
        int tLen = t.length();
        int j=0;
        for(int i=0;i<tLen;++i){
            if(j<sLen && (t.charAt(i) == s.charAt(j))) ++j;
        }
        return j >= sLen;
    }
}
