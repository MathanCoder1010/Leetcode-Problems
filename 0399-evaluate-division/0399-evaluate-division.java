import java.util.*;

class Solution {
    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        Map<String, Map<String, Double>> graph = new HashMap<>();
        
        for (int i = 0; i < equations.size(); i++) {
            String u = equations.get(i).get(0);
            String v = equations.get(i).get(1);
            double val = values[i];
            
            graph.computeIfAbsent(u, k -> new HashMap<>()).put(v, val);
            graph.computeIfAbsent(v, k -> new HashMap<>()).put(u, 1.0 / val);
        }
        
        double[] results = new double[queries.size()];
        for (int i = 0; i < queries.size(); i++) {
            String src = queries.get(i).get(0);
            String dest = queries.get(i).get(1);
            
            if (!graph.containsKey(src) || !graph.containsKey(dest)) {
                results[i] = -1.0;
            } else if (src.equals(dest)) {
                results[i] = 1.0;
            } else {
                Set<String> visited = new HashSet<>();
                results[i] = dfs(src, dest, 1.0, graph, visited);
            }
        }
        
        return results;
    }
    
    private double dfs(String current, String target, double product, 
                       Map<String, Map<String, Double>> graph, Set<String> visited) {
        if (current.equals(target)) {
            return product;
        }
        
        visited.add(current);
        
        for (Map.Entry<String, Double> neighbor : graph.get(current).entrySet()) {
            String nextNode = neighbor.getKey();
            double edgeWeight = neighbor.getValue();
            
            if (!visited.contains(nextNode)) {
                double result = dfs(nextNode, target, product * edgeWeight, graph, visited);
                if (result != -1.0) {
                    return result;
                }
            }
        }
        
        return -1.0;
    }
}