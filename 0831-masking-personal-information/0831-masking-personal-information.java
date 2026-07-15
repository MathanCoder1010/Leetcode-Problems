class Solution {

    public String maskPII(String s) {

        if (s.contains("@")) {
            s = s.toLowerCase();

            int at = s.indexOf('@');
            char first = s.charAt(0);
            char last = s.charAt(at - 1);

            return first + "*****" + last + s.substring(at);
        } else {

            String digits = "";

            for (int i = 0; i < s.length(); i++) {
                char ch = s.charAt(i);

                if (Character.isDigit(ch)) {
                    digits += ch;
                }
            }

            int n = digits.length();
            String lastFour = digits.substring(n - 4);

            if (n == 10) {
                return "***-***-" + lastFour;
            } else if (n == 11) {
                return "+*-***-***-" + lastFour;
            } else if (n == 12) {
                return "+**-***-***-" + lastFour;
            } else {
                return "+***-***-***-" + lastFour;
            }
        }
    }
}