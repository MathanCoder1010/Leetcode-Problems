class Solution {
    public boolean isPalindrome(String s) {

        String str = "";

        for (int i = 0; i < s.length(); i++) {

            char ch = s.charAt(i);

            if (Character.isLetterOrDigit(ch)) {
                str += Character.toLowerCase(ch);
            }
        }

        int start = 0;
        int end = str.length() - 1;

        while (start < end) {

            if (str.charAt(start) != str.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }
}