import java.util.HashMap;

class Solution {
    public int findLHS(int[] nums) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        int longest = 0;

        for (int key : map.keySet()) {

            if (map.containsKey(key + 1)) {
                int length = map.get(key) + map.get(key + 1);

                if (length > longest) {
                    longest = length;
                }
            }
        }

        return longest;
    }
}