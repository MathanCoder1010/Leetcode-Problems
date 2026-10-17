import java.util.*;

class Solution {
    public List<Boolean> checkArithmeticSubarrays(
            int[] nums, int[] l, int[] r) {

        List<Boolean> ans = new ArrayList<>();

        for (int i = 0; i < l.length; i++) {
            int[] arr = Arrays.copyOfRange(nums, l[i], r[i] + 1);
            Arrays.sort(arr);

            boolean valid = true;
            int diff = arr[1] - arr[0];

            for (int j = 2; j < arr.length; j++) {
                if (arr[j] - arr[j - 1] != diff) {
                    valid = false;
                    break;
                }
            }

            ans.add(valid);
        }

        return ans;
    }
}