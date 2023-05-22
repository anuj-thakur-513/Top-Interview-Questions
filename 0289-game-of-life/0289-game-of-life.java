class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] directions = { {-1, -1}, {-1, 0}, {-1, 1}, {0, -1}, {0, 1}, {1, -1}, {1, 0}, {1, 1} };

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                int liveNeighbors = countLiveNeighbors(board, i, j, directions);

                if (board[i][j] == 1) {
                    if (liveNeighbors < 2 || liveNeighbors > 3) {
                        // Set the cell as "dying" by using a negative value
                        board[i][j] = -1;
                    }
                } else {
                    if (liveNeighbors == 3) {
                        // Set the cell as "coming to life" by using a positive value
                        board[i][j] = 2;
                    }
                }
            }
        }

        // Update the board based on the marked cells
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (board[i][j] > 0) {
                    board[i][j] = 1;  // Set the cell as live
                } else {
                    board[i][j] = 0;  // Set the cell as dead
                }
            }
        }
    }

    private int countLiveNeighbors(int[][] board, int row, int col, int[][] directions) {
        int count = 0;
        int m = board.length;
        int n = board[0].length;

        for (int[] direction : directions) {
            int newRow = row + direction[0];
            int newCol = col + direction[1];

            if (newRow >= 0 && newRow < m && newCol >= 0 && newCol < n && Math.abs(board[newRow][newCol]) == 1) {
                count++;
            }
        }

        return count;
    }
}
