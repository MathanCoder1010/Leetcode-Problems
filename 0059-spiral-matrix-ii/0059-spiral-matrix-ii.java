class Solution {
    public int[][] generateMatrix(int n) {

        int[][] result = new int[n][n];

        int top = 0;
        int bottom = n - 1;
        int left = 0;
        int right = n - 1;
        int number = 1;

        while (top <= bottom && left <= right) {

            for (int i = left; i <= right; i++) {
                result[top][i] = number++;
            }
            top++;

            for (int i = top; i <= bottom; i++) {
                result[i][right] = number++;
            }
            right--;

            if (top <= bottom) {
                for (int i = right; i >= left; i--) {
                    result[bottom][i] = number++;
                }
                bottom--;
            }

            if (left <= right) {
                for (int i = bottom; i >= top; i--) {
                    result[i][left] = number++;
                }
                left++;
            }
        }

        return result;
    }
}