class Solution {
    public int numSpecialEquivGroups(String[] words) {
        HashSet<String> set = new HashSet<>();

        for (String word : words) {
            char[] even = new char[(word.length() + 1) / 2];
            char[] odd = new char[word.length() / 2];

            for (int i = 0; i < word.length(); i++) {
                if (i % 2 == 0)
                    even[i / 2] = word.charAt(i);
                else
                    odd[i / 2] = word.charAt(i);
            }

            Arrays.sort(even);
            Arrays.sort(odd);

            set.add(new String(even) + new String(odd));
        }

        return set.size();
    }
}