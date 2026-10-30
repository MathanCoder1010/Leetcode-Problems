import java.util.*;

class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        List<List<Integer>> ans = new ArrayList<>();

        int i = 0;

        while (i < s.length()) {
            int j = i;

            while (j < s.length() && s.charAt(i) == s.charAt(j)) {
                j++;
            }

            if (j - i >= 3) {
                ans.add(Arrays.asList(i, j - 1));
            }

            i = j;
        }

        return ans;
    }
}