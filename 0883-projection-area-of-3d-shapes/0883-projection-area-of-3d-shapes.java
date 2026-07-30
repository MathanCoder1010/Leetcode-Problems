class Solution {
    public int projectionArea(int[][] grid) {
        int totalArea = 0;
        int n = grid.length;

        for (int i = 0; i < n; i++) {
            int maxRow = 0;
            int maxCol = 0;

            for (int j = 0; j < n; j++) {
                if (grid[i][j] > 0) {
                    totalArea++;
                }

                maxRow = Math.max(maxRow, grid[i][j]);
                maxCol = Math.max(maxCol, grid[j][i]);
            }

            totalArea += maxRow + maxCol;
        }

        return totalArea;
    }
}