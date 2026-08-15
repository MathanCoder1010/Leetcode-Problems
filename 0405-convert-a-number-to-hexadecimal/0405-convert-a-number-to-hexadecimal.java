class Solution {
    public String toHex(int num) {
        if (num == 0) {
            return "0";
        }

        long n = num;

        if (n < 0) {
            n = n + (1L << 32);
        }

        StringBuilder result = new StringBuilder();
        String hex = "0123456789abcdef";

        while (n > 0) {
            int digit = (int)(n % 16);
            result.append(hex.charAt(digit));
            n = n / 16;
        }

        return result.reverse().toString();
    }
}