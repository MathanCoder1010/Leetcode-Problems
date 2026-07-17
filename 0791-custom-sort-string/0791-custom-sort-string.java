class Solution {
    public String customSortString(String order, String s) {

        int[] count = new int[26];

        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }

        StringBuilder result = new StringBuilder();

        for (char ch : order.toCharArray()) {
            while (count[ch - 'a'] > 0) {
                result.append(ch);
                count[ch - 'a']--;
            }
        }

        for (char ch : s.toCharArray()) {
            while (count[ch - 'a'] > 0) {
                result.append(ch);
                count[ch - 'a']--;
            }
        }

        return result.toString();
    }
}