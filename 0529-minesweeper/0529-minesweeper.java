class Solution {
    int[] dr = {-1,-1,-1,0,0,1,1,1};
    int[] dc = {-1,0,1,-1,1,-1,0,1};

    public char[][] updateBoard(char[][] board, int[] click) {
        int r = click[0];
        int c = click[1];

        if (board[r][c] == 'M') {
            board[r][c] = 'X';
            return board;
        }

        dfs(board, r, c);

        return board;
    }

    void dfs(char[][] board, int r, int c) {
        if (r < 0 || r >= board.length ||
            c < 0 || c >= board[0].length ||
            board[r][c] != 'E') {
            return;
        }

        int mines = 0;

        for (int i = 0; i < 8; i++) {
            int nr = r + dr[i];
            int nc = c + dc[i];

            if (nr >= 0 && nr < board.length &&
                nc >= 0 && nc < board[0].length &&
                board[nr][nc] == 'M') {
                mines++;
            }
        }

        if (mines > 0) {
            board[r][c] = (char)('0' + mines);
            return;
        }

        board[r][c] = 'B';

        for (int i = 0; i < 8; i++) {
            dfs(board, r + dr[i], c + dc[i]);
        }
    }
}