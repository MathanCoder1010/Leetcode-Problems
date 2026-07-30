class Solution {
    public int surfaceArea(int[][] grid) {
        int totalArea = 0;
        int n = grid.length;

        for (int r = 0; r < n; r++) {
            for (int c = 0; c < n; c++) {
                int height = grid[r][c];

                if (height > 0) {
                    totalArea += 4 * height + 2;

                    if (r > 0) {
                        totalArea -= 2 * Math.min(height, grid[r - 1][c]);
                    }

                    if (c > 0) {
                        totalArea -= 2 * Math.min(height, grid[r][c - 1]);
                    }
                }
            }
        }

        return totalArea;
    }
}