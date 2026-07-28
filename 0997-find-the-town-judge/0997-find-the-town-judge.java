class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustScore = new int[n + 1];

        for (int[] relation : trust) {
            trustScore[relation[0]]--;
            trustScore[relation[1]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (trustScore[i] == n - 1) {
                return i;
            }
        }

        return -1;
    }
}