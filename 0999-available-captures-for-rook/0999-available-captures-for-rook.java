class Solution {
    public int numRookCaptures(char[][] board) {
        int rookRow = -1, rookCol = -1;

        for (int r = 0; r < 8; r++) {
            for (int c = 0; c < 8; c++) {
                if (board[r][c] == 'R') {
                    rookRow = r;
                    rookCol = c;
                    break;
                }
            }
        }

        int captures = 0;
        int[][] directions = {{-1, 0}, {1, 0}, {0, -1}, {0, 1}};

        for (int[] dir : directions) {
            int r = rookRow + dir[0];
            int c = rookCol + dir[1];

            while (r >= 0 && r < 8 && c >= 0 && c < 8) {
                if (board[r][c] == 'p') {
                    captures++;
                    break;
                }
                if (board[r][c] == 'B') {
                    break;
                }
                r += dir[0];
                c += dir[1];
            }
        }

        return captures;
    }
}