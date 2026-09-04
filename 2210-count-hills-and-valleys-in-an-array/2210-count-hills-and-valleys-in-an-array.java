class Solution {
    public int countHillValley(int[] nums) {
        int count = 0;
        int previous = nums[0];

        for (int i = 1; i < nums.length - 1; i++) {
            if (nums[i] == nums[i + 1]) {
                continue;
            }

            int left = previous;
            int right = nums[i + 1];

            if ((nums[i] > left && nums[i] > right) ||
                (nums[i] < left && nums[i] < right)) {
                count++;
            }

            previous = nums[i];
        }

        return count;
    }
}