import java.util.Arrays;

class Solution {
    public int maximumUnits(int[][] boxTypes, int truckSize) {
        Arrays.sort(boxTypes, (a, b) -> b[1] - a[1]);

        int units = 0;

        for (int[] box : boxTypes) {
            int take = Math.min(truckSize, box[0]);
            units += take * box[1];
            truckSize -= take;

            if (truckSize == 0) break;
        }

        return units;
    }
}