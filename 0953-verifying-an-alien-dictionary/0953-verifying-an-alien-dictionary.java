class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        int[] index = new int[26];
        for (int i = 0; i < order.length(); i++) {
            index[order.charAt(i) - 'a'] = i;
        }

        for (int i = 0; i < words.length - 1; i++) {
            if (!isOrdered(words[i], words[i + 1], index)) {
                return false;
            }
        }

        return true;
    }

    private boolean isOrdered(String w1, String w2, int[] index) {
        int len = Math.min(w1.length(), w2.length());
        for (int i = 0; i < len; i++) {
            char c1 = w1.charAt(i);
            char c2 = w2.charAt(i);
            if (c1 != c2) {
                return index[c1 - 'a'] < index[c2 - 'a'];
            }
        }
        return w1.length() <= w2.length();
    }
}