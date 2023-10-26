package leetcode;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class lc73 {
    /**
     * matrix = [[0,1,2,0],
     *           [3,4,5,2],
     *           [1,3,1,5]]
     *
     * Output: [[0,0,0,0],
     *          [0,4,5,0],
     *          [0,3,1,0]]
     */
    public static void setZeroes(int[][] matrix) {
        Set<Integer> rowList = new HashSet<>();
        Set<Integer> colList = new HashSet<>();
        int n = matrix.length,m = matrix[0].length;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(matrix[i][j] == 0){
                    rowList.add(i);
                    colList.add(j);
                }
            }
        }
        for(Integer row:rowList) setRowToZero(row,matrix);
        for(Integer col:colList) setColToZero(col,matrix);
    }

    public static void setRowToZero(int i,int[][] matrix){
        int n = matrix.length,m = matrix[0].length;
        for(int j =0;j<n;++j) matrix[i][j] = 0;
    }

    public static   void setColToZero(int j,int[][] matrix){
        int n = matrix.length,m = matrix[0].length;
        for(int i = 0;i < m;++i) matrix[i][j] = 0;
    }
}
