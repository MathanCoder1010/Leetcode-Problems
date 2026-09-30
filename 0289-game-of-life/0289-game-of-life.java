class Solution {
    public void gameOfLife(int[][] board) {
        int m = board.length;
        int n = board[0].length;

        int[][] temp = new int[m][n];

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {

                int count = 0;

                for (int x = i - 1; x <= i + 1; x++) {
                    for (int y = j - 1; y <= j + 1; y++) {

                        if (x >= 0 && x < m && y >= 0 && y < n) {
                            if (board[x][y] == 1) {
                                count++;
                            }
                        }
                    }
                }

                if (board[i][j] == 1) {
                    count--; 

                    if (count == 2 || count == 3) {
                        temp[i][j] = 1;
                    }
                } else {
                    if (count == 3) {
                        temp[i][j] = 1;
                    }
                }
            }
        }

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                board[i][j] = temp[i][j];
            }
        }
    }
}