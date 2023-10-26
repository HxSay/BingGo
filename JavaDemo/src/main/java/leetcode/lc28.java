package leetcode;

public class lc28 {
    /**
     * Input: haystack = "sadbutsad", needle = "sad"
     * Output: 0
     */
    public static int strStr(String haystack, String needle) {
        for(int i=0;i<haystack.length();++i){
            int j = 0;
            if(haystack.charAt(i) ==  needle.charAt(j)){
                while(i+j < haystack.length() &&
                        j < needle.length() &&
                        (haystack.charAt(i+j) == needle.charAt(j))){
                    ++j;
                }
                if(j >= needle.length()) return i;
            }
        }
        return -1;
    }
}
