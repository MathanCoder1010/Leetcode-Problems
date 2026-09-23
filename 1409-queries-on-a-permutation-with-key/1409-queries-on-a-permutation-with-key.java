class Solution {
    public int[] processQueries(int[] queries, int m) {
        int[] result = new int[queries.length];

        java.util.ArrayList<Integer> list = new java.util.ArrayList<>();

        for (int i = 1; i <= m; i++) {
            list.add(i);
        }

        for (int i = 0; i < queries.length; i++) {
            int pos = list.indexOf(queries[i]);

            result[i] = pos;

            list.remove(pos);
            list.add(0, queries[i]);
        }

        return result;
    }
}