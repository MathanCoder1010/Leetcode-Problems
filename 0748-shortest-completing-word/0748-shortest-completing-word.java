class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        int[] target = new int[26];

        for (char ch : licensePlate.toCharArray()) {
            if (Character.isLetter(ch)) {
                target[Character.toLowerCase(ch) - 'a']++;
            }
        }

        String answer = "";

        for (String word : words) {
            int[] count = new int[26];

            for (char ch : word.toCharArray()) {
                count[ch - 'a']++;
            }

            boolean valid = true;

            for (int i = 0; i < 26; i++) {
                if (count[i] < target[i]) {
                    valid = false;
                    break;
                }
            }

            if (valid) {
                if (answer.equals("") || word.length() < answer.length()) {
                    answer = word;
                }
            }
        }

        return answer;
    }
}