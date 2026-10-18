class Solution {
    public boolean canFormArray(int[] arr, int[][] pieces) {
        int i = 0;

        while (i < arr.length) {
            boolean found = false;

            for (int[] piece : pieces) {
                if (piece[0] == arr[i]) {
                    for (int num : piece) {
                        if (i >= arr.length || arr[i] != num) {
                            return false;
                        }
                        i++;
                    }

                    found = true;
                    break;
                }
            }

            if (!found) {
                return false;
            }
        }

        return true;
    }
}