package leetcode;

import java.util.HashMap;
import java.util.HashSet;

public class lc36 {
    public static boolean isValidSudoku(char[][] board) {
        for(int i=0;i<9;++i){
            if(!checkCol(board,i) || !checkRow(board,i)) return false;
            for(int j=0;j<9;++j){
                if(((i%3==0) && (j%3==0)))
                if(!checkBox(board,i,j)){
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean checkCol(char[][] board,int j){
        HashSet<Character> hashSet = new HashSet<>();
        for(int i=0;i<9;++i){
            char ch = board[i][j];
            if(ch == '.') continue;
            if(hashSet.contains(ch)) return false;
            hashSet.add(ch);
        }
        return true;
    }

    public static boolean checkRow(char[][] board,int i){
        HashSet<Character> hashSet = new HashSet<>();
        for(int j=0;j<9;++j){
            char ch = board[i][j];
            if(ch == '.') continue;
            if(hashSet.contains(ch)) return false;
            hashSet.add(ch);
        }
        return true;
    }

    public static boolean checkBox(char[][] board,int x,int y){
        HashSet<Character> hashSet = new HashSet<>();
        for(int i=0;i<3;++i){
            for(int j=0;j<3;++j){
                char ch = board[x+i][y+j];
                if(ch == '.') continue;
                if(hashSet.contains(ch)) return false;
                hashSet.add(ch);
            }
        }
        return true;
    }
}
