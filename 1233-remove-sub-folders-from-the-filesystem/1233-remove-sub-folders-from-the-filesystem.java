import java.util.*;

class Solution {
    public List<String> removeSubfolders(String[] folder) {
        Arrays.sort(folder);
        List<String> result = new ArrayList<>();

        for (String s : folder) {
            if (result.isEmpty() || 
                !s.startsWith(result.get(result.size() - 1) + "/")) {
                result.add(s);
            }
        }

        return result;
    }
}