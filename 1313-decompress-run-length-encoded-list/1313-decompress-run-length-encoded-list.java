class Solution {
    public int[] decompressRLElist(int[] nums) {
        int size = 0;

        for (int i = 0; i < nums.length; i += 2) {
            size += nums[i];
        }

        int[] result = new int[size];
        int index = 0;

        for (int i = 0; i < nums.length; i += 2) {
            int frequency = nums[i];
            int value = nums[i + 1];

            for (int j = 0; j < frequency; j++) {
                result[index++] = value;
            }
        }

        return result;
    }
}