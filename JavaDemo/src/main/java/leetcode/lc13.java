package leetcode;

public class lc13 {
    public static void main(String[] args) {
        System.out.println(romanToInt("LVIII"));
    }
    public static int romanToInt(String s) {
        int n = s.length();
        int ans = 0;
        for (int i=0;i<n;++i){
            char ch = s.charAt(i);
            switch (ch){
                case 'I':
                    ans+=1;
                    break;
                case 'V':
                    ans+=5;
                    if(i>0){
                        char ch2 = s.charAt(i-1);
                        if(ch2 == 'I') ans-= 2;
                    }
                    break;
                case 'X':
                    ans+=10;
                    if(i>0){
                        char ch2 = s.charAt(i-1);
                        if(ch2 == 'I') ans-= 2;
                    }
                    break;
                case 'L':
                    ans+=50;
                    if(i>0){
                        char ch2 = s.charAt(i-1);
                        if(ch2 == 'X') ans-= 10*2;
                    }
                    break;
                case 'C':
                    ans+=100;
                    if(i>0){
                        char ch2 = s.charAt(i-1);
                        if(ch2 == 'X') ans-= 10*2;
                    }
                    break;
                case 'D':
                    ans+=500;
                    if(i>0){
                        char ch2 = s.charAt(i-1);
                        if(ch2 == 'C') ans-= 100*2;
                    }
                    break;
                case 'M':
                    ans+=1000;
                    if(i>0){
                        char ch2 = s.charAt(i-1);
                        if(ch2 == 'C') ans-= 100*2;
                    }
                    break;
            }
        }
        return ans;
    }
}
