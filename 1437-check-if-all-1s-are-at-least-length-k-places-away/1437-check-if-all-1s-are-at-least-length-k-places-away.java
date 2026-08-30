class Solution {
    public boolean kLengthApart(int[] nums, int k) {
        int lastOne = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                if (lastOne != -1 && i - lastOne <= k) {
                    return false;
                }

                lastOne = i;
            }
        }

        return true;
    }
}