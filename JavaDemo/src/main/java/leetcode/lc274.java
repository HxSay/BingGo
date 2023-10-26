package leetcode;

import java.util.Arrays;

//[3,0,6,1,5]
//[0,1,3,5,6] ,n=5,i=2

//[1,1,3]
public class lc274 {
    public static void main(String[] args) {
        hIndex(new int[]{3,0,6,1,5});
    }

    //[0,1,3,5,6]
    //[1,1,3]
    //[0,1]
    public static int hIndex(int[] citations) {
        int n = citations.length;
        int h = 0;
        Arrays.sort(citations);
        for(int i=0;i<n;++i){
            for(int j=n-i;j<=citations[i];++j) {
                if (j <= (n - i)) {
                    h = Math.max(h, i+1);
                }
            }
        }
        return h;
    }
}
