class Solution {
    public boolean areNumbersAscending(String s) {
        String[] words = s.split(" ");
        int prev = 0;

        for (String word : words) {
            if (Character.isDigit(word.charAt(0))) {
                int num = Integer.parseInt(word);

                if (num <= prev) {
                    return false;
                }

                prev = num;
            }
        }

        return true;
    }
}