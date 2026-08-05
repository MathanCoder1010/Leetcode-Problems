class Solution {
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() > magazine.length()) {
            return false;
        }

        int[] letterCounts = new int[26];

        for (char c : magazine.toCharArray()) {
            letterCounts[c - 'a']++;
        }

        for (char c : ransomNote.toCharArray()) {
            if (letterCounts[c - 'a'] == 0) {
                return false;
            }
            letterCounts[c - 'a']--;
        }

        return true;
    }
}