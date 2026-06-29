class Solution {
    public String frequencySort(String s) {

        HashMap<Character, Integer> map = new HashMap<>();

        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        StringBuilder ans = new StringBuilder();

        while (!map.isEmpty()) {

            char maxChar = ' ';
            int max = 0;

            for (char c : map.keySet()) {
                if (map.get(c) > max) {
                    max = map.get(c);
                    maxChar = c;
                }
            }

            for (int i = 0; i < max; i++) {
                ans.append(maxChar);
            }

            map.remove(maxChar);
        }

        return ans.toString();
    }
}