class Solution {
    public String decodeString(String s) {
        java.util.Stack<Integer> numStack = new java.util.Stack<>();
        java.util.Stack<String> strStack = new java.util.Stack<>();

        int num = 0;
        String current = "";

        for (char c : s.toCharArray()) {

            if (Character.isDigit(c)) {
                num = num * 10 + (c - '0');
            } 
            else if (c == '[') {
                numStack.push(num);
                strStack.push(current);

                num = 0;
                current = "";
            } 
            else if (c == ']') {
                int repeat = numStack.pop();
                String previous = strStack.pop();

                String temp = "";
                for (int i = 0; i < repeat; i++) {
                    temp += current;
                }

                current = previous + temp;
            } 
            else {
                current += c;
            }
        }

        return current;
    }
}