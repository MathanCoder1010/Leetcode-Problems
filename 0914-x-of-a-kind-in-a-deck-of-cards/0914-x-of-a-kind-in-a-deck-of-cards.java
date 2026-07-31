import java.util.HashMap;
import java.util.Map;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> countMap = new HashMap<>();
        for (int card : deck) {
            countMap.put(card, countMap.getOrDefault(card, 0) + 1);
        }
        
        int g = -1;
        for (int count : countMap.values()) {
            if (g == -1) {
                g = count;
            } else {
                g = gcd(g, count);
            }
        }
        
        return g >= 2;
    }

    private int gcd(int a, int b) {
        return b == 0 ? a : gcd(b, a % b);
    }
}