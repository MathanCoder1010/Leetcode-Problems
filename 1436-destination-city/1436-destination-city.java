class Solution {
    public String destCity(List<List<String>> paths) {
        Set<String> start = new HashSet<>();

        for (List<String> path : paths) {
            start.add(path.get(0));
        }

        for (List<String> path : paths) {
            String destination = path.get(1);

            if (!start.contains(destination)) {
                return destination;
            }
        }

        return "";
    }
}