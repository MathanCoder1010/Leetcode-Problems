class Solution {

    List<List<String>> ans = new ArrayList<>();

    public List<List<String>> partition(String s) {

        backtrack(s, 0, new ArrayList<>());

        return ans;
    }

    public void backtrack(String s, int index, List<String> list) {

        if (index == s.length()) {

            ans.add(new ArrayList<>(list));
            return;
        }

        for (int i = index; i < s.length(); i++) {

            if (isPalindrome(s, index, i)) {

                list.add(s.substring(index, i + 1));

                backtrack(s, i + 1, list);

                list.remove(list.size() - 1);
            }
        }
    }

    public boolean isPalindrome(String s, int left, int right) {

        while (left < right) {

            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }

            left++;
            right--;
        }

        return true;
    }
}