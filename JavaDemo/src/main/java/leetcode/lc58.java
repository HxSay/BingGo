package leetcode;
//"luffy is still joyboy"
public class lc58 {
    public static void main(String[] args) {
        lengthOfLastWord("Hello World");
    }

    public static int lengthOfLastWord(String s) {
        String[] split = s.split(" ");
        return split[split.length-1].length();
    }
}
