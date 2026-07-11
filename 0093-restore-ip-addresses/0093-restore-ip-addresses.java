class Solution {

    List<String> answer = new ArrayList<>();

    public List<String> restoreIpAddresses(String s) {

        find(s, 0, 0, "");

        return answer;
    }

    public void find(String s, int index, int parts, String current) {

        if (parts == 4 && index == s.length()) {
            answer.add(current.substring(0, current.length() - 1));
            return;
        }

        if (parts == 4 || index == s.length()) {
            return;
        }

        for (int len = 1; len <= 3 && index + len <= s.length(); len++) {

            String part = s.substring(index, index + len);

            if (part.length() > 1 && part.charAt(0) == '0') {
                continue;
            }

            if (Integer.parseInt(part) > 255) {
                continue;
            }

            find(s, index + len, parts + 1, current + part + ".");
        }
    }
}