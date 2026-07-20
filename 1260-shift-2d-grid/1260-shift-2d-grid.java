class Solution {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {

        int rows = grid.length;
        int cols = grid[0].length;
        int total = rows * cols;

        k = k % total;

        int[][] newGrid = new int[rows][cols];

        for (int i = 0; i < total; i++) {

            int oldRow = i / cols;
            int oldCol = i % cols;

            int newIndex = (i + k) % total;

            int newRow = newIndex / cols;
            int newCol = newIndex % cols;

            newGrid[newRow][newCol] = grid[oldRow][oldCol];
        }

        List<List<Integer>> result = new ArrayList<>();

        for (int i = 0; i < rows; i++) {
            List<Integer> row = new ArrayList<>();

            for (int j = 0; j < cols; j++) {
                row.add(newGrid[i][j]);
            }

            result.add(row);
        }

        return result;
    }
}