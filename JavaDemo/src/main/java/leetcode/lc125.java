package leetcode;

import java.util.Stack;

public class lc125 {
    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
    /**
     * Input: s = "A man, a plan, a canal: Panama"
     * Output: true
     */
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        String cleanStr = s
                .replaceAll("[^a-z0-9]","")
                .replaceAll("\\s+","")
                .trim();
        return isPalidrome(cleanStr);
    }

    /**
     * aba    3/2=1
     * abba   4/2=2
     */
    public static boolean isPalidrome(String s){
        int n = s.length();
        int i=0,j=0;
        if(n%2 == 0){
            i = n/2 -1;
        }else{
            i = n/2;
        }
        j = n/2;
        while(i>=0 && j<n && (s.charAt(i) == s.charAt(j))){
            --i;++j;
        }
        return i<0;
    }
}
