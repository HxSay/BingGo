package leetcode;

public class lc289 {
    public static void main(String[] args) {
        gameOfLife(new  int[][]{
            {1,1},
            {1,0}
        });
    }
    /**
     * board = [[1,1],
     *          [1,0]]
     *
     * Output: [[1,1],
     *          [1,1]]
     * -1 die, -1 die, 2 reproduce
     */
    public static void gameOfLife(int[][] board) {
        int m = board.length,n = board[0].length;
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                board[i][j] = getStatus(board,i,j);
            }
        }
        for(int i=0;i<m;++i){
            for(int j=0;j<n;++j){
                if(board[i][j] > 0) board[i][j] = 1;
                else board[i][j] =0;
            }
        }
    }

    public static int getStatus(int[][] board, int row, int col){
        int m = board.length,n = board[0].length;
        int liveCnt = 0;
        for(int i = -1; i<2 ;++i){
            for(int j = -1; j< 2;++j){
                if(!(i==0 && j==0) && row+i < m && row+i >=0 && col+j<n && col+j>=0) {
                    int cur = board[row + i][col + j];
                    if (cur == 1) liveCnt++;
                    else if(cur == -1) liveCnt++;
                }
            }
        }
        if(board[row][col] == 1){
            if(liveCnt<2) return -1;
            if(liveCnt == 2 || liveCnt==3) return 1;
            if(liveCnt > 3) return -1;
        }else if(board[row][col] == 0){
            if(liveCnt==3) return 2;
        }

        return board[row][col];
    }
}
