class Solution {

    List<List<Integer>> ans = new ArrayList<>();

    public void dfs(int[][] graph, int node, List<Integer> path) {

        path.add(node);

        if (node == graph.length - 1) {
            ans.add(new ArrayList<>(path));
        } else {

            for (int next : graph[node]) {
                dfs(graph, next, path);
            }
        }

        path.remove(path.size() - 1);
    }

    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {

        dfs(graph, 0, new ArrayList<>());

        return ans;
    }
}