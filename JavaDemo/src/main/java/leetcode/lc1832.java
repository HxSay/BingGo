package leetcode;

public class lc1832 {

    public static void main(String[] args) {
        checkIfPangram("leetcode");
    }

    public static boolean checkIfPangram(String sentence) {
        int tabs = 0;
        for(int i=0;i<sentence.length();++i){
            tabs |= 1 << (sentence.charAt(i)-'a');
        }
        return tabs == (0 | (1<<26));
    }
}
