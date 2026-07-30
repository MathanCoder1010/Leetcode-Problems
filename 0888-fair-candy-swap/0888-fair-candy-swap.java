import java.util.HashSet;
import java.util.Set;

class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int sumAlice = 0;
        int sumBob = 0;

        for (int candy : aliceSizes) sumAlice += candy;
        
        Set<Integer> bobSet = new HashSet<>();
        for (int candy : bobSizes) {
            sumBob += candy;
            bobSet.add(candy);
        }

        int delta = (sumBob - sumAlice) / 2;

        for (int x : aliceSizes) {
            int targetBobCandy = x + delta;
            if (bobSet.contains(targetBobCandy)) {
                return new int[]{x, targetBobCandy};
            }
        }

        return new int[]{};
    }
}