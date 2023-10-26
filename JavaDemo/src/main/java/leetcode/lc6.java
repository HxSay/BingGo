package leetcode;

/**
 * Input: s = "PAYPALISHIRING", numRows = 4
 * Output: "PINALSIGYAHRPI"
 * P(0)         I(6)           N(12)
 * A(1)   L(5)  S(7)     I(11) G(13)
 * Y(2) A(4)    H(8) R(10)
 * P(3)         I(9)
 *
 * P(0*n+0)            I(1*n+2)           N(3*n)     => (2(n-1)) (前后两项的差值)
 * A(0*n+1)   L(1*n+1) S(1*n+3)  I(2*n+3) G(3*n+1)   => (2(n-1), (n-i-1)+(n-1-i) = 2(n-i-1)) (前后两项的差值分别为这两个值)
 * Y(0*n+2) A(1*n+0)   H(2*n+0) R(2*n+2)             => (2(n-1),2(n-i-1))
 * P(0*n+3)            I(2*n+1)                      => (2(n-1))
 */
public class lc6 {
    public static void main(String[] args) {
//        System.out.println(convert("PAYPALISHIRING",4));
        System.out.println(convert("A",1));

    }
    public static String convert(String s, int numRows) {
        int len = s.length();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<numRows;++i){
            if(i == 0 || i == (numRows-1)) {
                for(int j=i;j<len;j+=2*(numRows-1)){
                    ans.append(s.charAt(j));
                }
            }else {
                int j = i;
                while(j<len){
                    int idx1 = j;
                    int idx2 = j +(2*(numRows-1-i));
                    int idx3 = j+2*(numRows-1);
                    if(idx1<len) ans.append(s.charAt(idx1));
                    if(idx2<len) ans.append(s.charAt(idx2));
                    j = idx3;
                }
            }
        }
        return ans.toString();
    }

}
