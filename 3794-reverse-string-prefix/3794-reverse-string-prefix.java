class Solution {
    public String reversePrefix(String s, int k) {
        String firstPart = s.substring(0, k);
        StringBuilder sb = new StringBuilder(firstPart);

        sb.reverse();

        return sb.toString() + s.substring(k);
    }
}