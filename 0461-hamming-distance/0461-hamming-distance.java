class Solution {
    public int hammingDistance(int x, int y) {
        int xorResult = x ^ y;
        int count = 0;

        while (xorResult != 0) {
            count = count + (xorResult & 1);
            xorResult = xorResult >> 1;
        }

        return count;
    }
}