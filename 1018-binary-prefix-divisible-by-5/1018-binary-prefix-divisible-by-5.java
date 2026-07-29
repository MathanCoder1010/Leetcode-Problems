class Solution {
    public List<Boolean> prefixesDivBy5(int[] nums) {
        List<Boolean> result = new ArrayList<>();
        int remainder = 0;

        for (int num : nums) {
            remainder = (remainder * 2 + num) % 5;
            result.add(remainder == 0);
        }

        return result;
    }
}