class Solution {
    public int countCharacters(String[] words, String chars) {
        int[] base = new int[26];

        for (char c : chars.toCharArray()) {
            base[c - 'a']++;
        }

        int sum = 0;

        for (String word : words) {
            int[] temp = new int[26];

            for (char c : word.toCharArray()) {
                temp[c - 'a']++;
            }

            boolean ok = true;

            for (int i = 0; i < 26; i++) {
                if (temp[i] > base[i]) {
                    ok = false;
                    break;
                }
            }

            if (ok) {
                sum += word.length();
            }
        }

        return sum;
    }
}