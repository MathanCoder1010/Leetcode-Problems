class Solution {
    public char findTheDifference(String s, String t) {
        int[] count = new int[26];
        
        for (char ch : s.toCharArray()) {
            count[ch - 'a']++;
        }
        
        for (char ch : t.toCharArray()) {
            count[ch - 'a']--;
            if (count[ch - 'a'] < 0) {
                return ch;
            }
        }
        
        return ' ';
    }
}