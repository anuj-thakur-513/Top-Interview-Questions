class Solution {
    public boolean isValidSudoku(char[][] board) {
        int m = board.length;
        int n = board[0].length;

        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(board[i][j] != '.'){
                    char ch = board[i][j];
                    // replace the character with empty space because we don't want it to clash with itself
                    board[i][j] = '.';

                    if(!isSafe(board, i, j, ch)){
                        return false;
                    } else{
                        // add the character which we removed again
                        board[i][j] = ch;
                    }
                }
            }
        }

        return true;
    }

    private boolean isSafe(char[][] board, int row, int col, char ch){
        // there are 9 rows and cols in the sudoku
        for(int i = 0; i < 9; i++){
            // check in the same row
            if(board[row][i] == ch){
                return false;
            }
            // check in the same col
            if(board[i][col] == ch){
                return false;
            }
            // check in the same block
            if(board[3 * (row / 3) + i/3][3 * (col/3) + i%3] == ch){
                return false;
            }
        }

        return true;
    }
}