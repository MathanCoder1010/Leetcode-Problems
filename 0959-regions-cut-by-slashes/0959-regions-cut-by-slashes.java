class Solution {
    public int regionsBySlashes(String[] grid) {
        int n = grid.length;
        int[][] expandedGrid = new int[n * 3][n * 3];

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                char ch = grid[i].charAt(j);

                if (ch == '/') {
                    expandedGrid[i * 3][j * 3 + 2] = 1;
                    expandedGrid[i * 3 + 1][j * 3 + 1] = 1;
                    expandedGrid[i * 3 + 2][j * 3] = 1;
                } else if (ch == '\\') {
                    expandedGrid[i * 3][j * 3] = 1;
                    expandedGrid[i * 3 + 1][j * 3 + 1] = 1;
                    expandedGrid[i * 3 + 2][j * 3 + 2] = 1;
                }
            }
        }

        int regions = 0;

        for (int i = 0; i < n * 3; i++) {
            for (int j = 0; j < n * 3; j++) {
                if (expandedGrid[i][j] == 0) {
                    dfs(expandedGrid, i, j);
                    regions++;
                }
            }
        }

        return regions;
    }

    private void dfs(int[][] grid, int row, int col) {
        if (row < 0 || row >= grid.length || col < 0 || col >= grid[0].length || grid[row][col] != 0) {
            return;
        }

        grid[row][col] = 2;

        dfs(grid, row + 1, col);
        dfs(grid, row - 1, col);
        dfs(grid, row, col + 1);
        dfs(grid, row, col - 1);
    }
}