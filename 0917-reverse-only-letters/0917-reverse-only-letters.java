class Solution {
    public String reverseOnlyLetters(String s) {
        char[] a = s.toCharArray();
        int left = 0;
        int right = a.length - 1;

        while (left < right) {
            if (!Character.isLetter(a[left])) {
                left++;
            } else if (!Character.isLetter(a[right])) {
                right--;
            } else {
                char temp = a[left];
                a[left] = a[right];
                a[right] = temp;
                left++;
                right--;
            }
        }

        return new String(a);
    }
}