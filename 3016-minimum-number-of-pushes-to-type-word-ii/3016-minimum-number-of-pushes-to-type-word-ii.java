class Solution {
    public int minimumPushes(String word) {

        int[] count = new int[26];

        for (int i = 0; i < word.length(); i++) {
            count[word.charAt(i) - 'a']++;
        }

        Arrays.sort(count);

        int pushes = 0;
        int press = 1;
        int used = 0;

        for (int i = 25; i >= 0; i--) {

            if (count[i] == 0) {
                break;
            }

            pushes += count[i] * press;
            used++;

            if (used == 8) {
                press++;
                used = 0;
            }
        }

        return pushes;
    }
}