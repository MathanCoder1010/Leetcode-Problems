import java.util.HashMap;
import java.util.Map;

class Solution {
    public int maxEqualRowsAfterFlips(int[][] matrix) {
        Map<String, Integer> patternCounts = new HashMap<>();
        int maxRows = 0;

        for (int[] row : matrix) {
            StringBuilder pattern = new StringBuilder();
            int firstElement = row[0];

            for (int value : row) {
                pattern.append(value ^ firstElement);
            }

            String key = pattern.toString();
            patternCounts.put(key, patternCounts.getOrDefault(key, 0) + 1);
            maxRows = Math.max(maxRows, patternCounts.get(key));
        }

        return maxRows;
    }
}