class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        boolean[] seen = new boolean[nums.length + 1];

        for (int i = 0; i < nums.length; i++) {
            seen[nums[i]] = true;
        }

        List<Integer> result = new ArrayList<>();

        for (int num = 1; num <= nums.length; num++) {
            if (!seen[num]) {
                result.add(num);
            }
        }

        return result;
    }
}