class Solution {
    public String interpret(String command) {

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < command.length(); i++) {

            char ch = command.charAt(i);

            if (ch == 'G') {
                result.append("G");
            } else if (ch == '(' && command.charAt(i + 1) == ')') {
                result.append("o");
                i++;
            } else {
                result.append("al");
                i += 3;
            }
        }

        return result.toString();
    }
}