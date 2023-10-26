package leetcode;

import java.util.ArrayList;
import java.util.List;

public class lc54 {
    /**
     * Input: matrix = [[1,2,3],
     *                  [4,5,6],
     *                  [7,8,9]]
     * Output: [1,2,3,6,9,8,7,4,5]
     */

    public static void main(String[] args) {
        int[][] matrix = new int[][]{{1,2,3,4},{5,6,7,8},{9,10,11,12}};
        spiralOrder(matrix);
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        int left=0,right=matrix[0].length,top=0,bottom=matrix.length;
        List<Integer> ans = new ArrayList<>();
        while(left < right){
            for(int j = left;j<right;++j)  ans.add(matrix[top][j]);
            if(++top >= bottom) break;
            for(int i=top;i<bottom;++i) ans.add(matrix[i][right-1]);
            if(left >= --right) break;
            for(int j=right-1;j>=left;--j) ans.add(matrix[bottom-1][j]);
            if(top >= --bottom) break;
            for(int i=bottom-1;i>=top;--i) ans.add(matrix[i][left]);
            if(++left >= right) break;
        }
        return ans;
    }
}
