class Solution {
    public int arrangeCoins(int n) {
        long row = (long) ((-1 + Math.sqrt(1 + 8.0 * n)) / 2);
        
        while ((row + 1) * (row + 2) / 2 <= n) {
            row++;
        }
        
        return (int) row;
    }
}