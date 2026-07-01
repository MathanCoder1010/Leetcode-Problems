class Solution {

    List<String> ans = new ArrayList<>();

    String[] map = {
            "", "", "abc", "def", "ghi",
            "jkl", "mno", "pqrs", "tuv", "wxyz"
    };

    public List<String> letterCombinations(String digits) {

        if (digits.length() == 0) {
            return ans;
        }

        backtrack(digits, 0, "");

        return ans;
    }

    public void backtrack(String digits, int index, String s) {

        if (index == digits.length()) {
            ans.add(s);
            return;
        }

        String letters = map[digits.charAt(index) - '0'];

        for (char c : letters.toCharArray()) {

            backtrack(digits, index + 1, s + c);

        }
    }
}