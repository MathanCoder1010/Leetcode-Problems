class Solution {

    public boolean canFinish(int numCourses, int[][] prerequisites) {

        int[] indegree = new int[numCourses];
        List<Integer>[] graph = new ArrayList[numCourses];

        for (int i = 0; i < numCourses; i++) {
            graph[i] = new ArrayList<>();
        }

        for (int i = 0; i < prerequisites.length; i++) {

            int course = prerequisites[i][0];
            int pre = prerequisites[i][1];

            graph[pre].add(course);
            indegree[course]++;
        }

        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < numCourses; i++) {

            if (indegree[i] == 0) {
                queue.offer(i);
            }
        }

        int completed = 0;

        while (!queue.isEmpty()) {

            int current = queue.poll();
            completed++;

            for (int next : graph[current]) {

                indegree[next]--;

                if (indegree[next] == 0) {
                    queue.offer(next);
                }
            }
        }

        return completed == numCourses;
    }
}