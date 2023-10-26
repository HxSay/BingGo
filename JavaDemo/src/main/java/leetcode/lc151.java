package leetcode;

import java.util.Stack;

public class lc151 {
    public static void main(String[] args) {
        reverseWords("  hello world  ");
    }
    /**
     * Input: s = "the sky is blue"
     * Output: "blue is sky the"
     * @param s
     * @return
     */
    public static String reverseWords(String s) {
        Stack<String> stack = new Stack<>();
        s = s.trim();
        String[] splited = s.split("\\s+");
        for(int i=0;i<splited.length;++i){
            stack.push(splited[i]);
        }
        StringBuilder ans = new StringBuilder();
        while (!stack.isEmpty()){
            ans.append(stack.pop());
        }
        String ret = ans.toString();
        return ret.substring(0,ret.length()-1);
    }
}
