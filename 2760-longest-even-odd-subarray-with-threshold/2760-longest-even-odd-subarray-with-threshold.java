class Solution {
    public int longestAlternatingSubarray(int[] nums, int threshold) {

        int maxLength = 0;

        for (int i = 0; i < nums.length; i++) {

            if (nums[i] % 2 == 0 && nums[i] <= threshold) {

                int length = 1;

                for (int j = i + 1; j < nums.length; j++) {

                    if (nums[j] <= threshold &&
                        nums[j] % 2 != nums[j - 1] % 2) {

                        length++;
                    } else {
                        break;
                    }
                }

                maxLength = Math.max(maxLength, length);
            }
        }

        return maxLength;
    }
}