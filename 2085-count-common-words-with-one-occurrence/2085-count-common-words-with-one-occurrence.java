import java.util.HashMap;

class Solution {
    public int countWords(String[] words1, String[] words2) {

        HashMap<String, Integer> map1 = new HashMap<>();
        HashMap<String, Integer> map2 = new HashMap<>();

        for (String word : words1) {
            if (map1.containsKey(word)) {
                map1.put(word, map1.get(word) + 1);
            } else {
                map1.put(word, 1);
            }
        }

        for (String word : words2) {
            if (map2.containsKey(word)) {
                map2.put(word, map2.get(word) + 1);
            } else {
                map2.put(word, 1);
            }
        }

        int count = 0;

        for (String word : map1.keySet()) {
            if (map1.get(word) == 1 &&
                map2.containsKey(word) &&
                map2.get(word) == 1) {

                count++;
            }
        }

        return count;
    }
}