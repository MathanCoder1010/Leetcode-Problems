class Solution {

    private String build(String s) {

        String result = "";

        for (char c : s.toCharArray()) {

            if (c != '#') {
                result += c;
            } else if (result.length() > 0) {
                result = result.substring(0, result.length() - 1);
            }
        }

        return result;
    }

    public boolean backspaceCompare(String s, String t) {
        return build(s).equals(build(t));
    }
}