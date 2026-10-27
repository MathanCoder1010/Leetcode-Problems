class Solution {
    public int maximumPopulation(int[][] logs) {
        int[] years = new int[101];

        for (int[] log : logs) {
            years[log[0] - 1950]++;
            years[log[1] - 1950]--;
        }

        int max = 0;
        int year = 1950;
        int count = 0;

        for (int i = 0; i < 101; i++) {
            count += years[i];

            if (count > max) {
                max = count;
                year = 1950 + i;
            }
        }

        return year;
    }
}