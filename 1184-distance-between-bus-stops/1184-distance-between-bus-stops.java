class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        if (start > destination) {
            int temp = start;
            start = destination;
            destination = temp;
        }

        int clockwise = 0;
        int total = 0;

        for (int i = 0; i < distance.length; i++) {
            total += distance[i];

            if (i >= start && i < destination) {
                clockwise += distance[i];
            }
        }

        int anticlockwise = total - clockwise;

        return Math.min(clockwise, anticlockwise);
    }
}