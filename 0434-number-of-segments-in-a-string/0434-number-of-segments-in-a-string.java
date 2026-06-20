class Solution {
    public int countSegments(String s) {
        int count = 0;
        boolean insideWord = false;

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ' ') {
                if (!insideWord) {
                    count++;
                    insideWord = true;
                }
            } else {
                insideWord = false;
            }
        }

        return count;
    }
}