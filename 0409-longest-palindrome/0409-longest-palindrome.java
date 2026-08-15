class Solution {
    public int longestPalindrome(String s) {
        int[] count = new int[128];

        for (char c : s.toCharArray()) {
            count[c]++;
        }

        int result = 0;
        boolean odd = false;

        for (int n : count) {
            result += (n / 2) * 2;

            if (n % 2 == 1) {
                odd = true;
            }
        }

        if (odd) {
            result++;
        }

        return result;
    }
}