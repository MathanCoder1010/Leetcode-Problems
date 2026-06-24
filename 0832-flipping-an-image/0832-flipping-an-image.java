class Solution {
    public int[][] flipAndInvertImage(int[][] image) {

        for (int i = 0; i < image.length; i++) {

            int left = 0;
            int right = image[i].length - 1;

            while (left <= right) {

                int temp = image[i][left];
                image[i][left] = image[i][right];
                image[i][right] = temp;

                image[i][left] ^= 1;

                if (left != right) {
                    image[i][right] ^= 1;
                }

                left++;
                right--;
            }
        }

        return image;
    }
}