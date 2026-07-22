class Solution {
    public int findPoisonedDuration(int[] timeSeries, int duration) {

        if (timeSeries.length == 0) {
            return 0;
        }

        int totalTime = 0;

        for (int i = 0; i < timeSeries.length - 1; i++) {

            int gap = timeSeries[i + 1] - timeSeries[i];

            if (gap < duration) {
                totalTime += gap;
            } else {
                totalTime += duration;
            }
        }

        totalTime += duration;

        return totalTime;
    }
}