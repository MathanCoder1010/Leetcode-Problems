class Solution {
    public int buyChoco(int[] prices, int money) {

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;

        for (int price : prices) {

            if (price < first) {
                second = first;
                first = price;
            }
            else if (price < second) {
                second = price;
            }
        }

        int remaining = money - (first + second);

        if (remaining >= 0) {
            return remaining;
        }

        return money;
    }
}