class Solution {
    public boolean detectCapitalUse(String word) {
        if(word.equals(word.toUpperCase())) {
            return true;
        }

        if(word.equals(word.toLowerCase())) {
            return true;
        }

        String first = word.substring(0, 1).toUpperCase();
        String rest = word.substring(1).toLowerCase();

        return word.equals(first + rest);
    }
}