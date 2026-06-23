class Solution {
    public int[][] matrixReshape(int[][] mat, int r, int c) {

        int rows = mat.length;
        int cols = mat[0].length;

        if (rows * cols != r * c) {
            return mat;
        }

        int[][] result = new int[r][c];

        int index = 0;

        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                result[index / c][index % c] = mat[i][j];
                index++;
            }
        }

        return result;
    }
}