class Solution {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        
        findPaths(root, "", result);
        
        return result;
    }

    void findPaths(TreeNode root, String path, List<String> result) {
        if (root == null) {
            return;
        }

        path += root.val;

        if (root.left == null && root.right == null) {
            result.add(path);
            return;
        }

        path += "->";

        findPaths(root.left, path, result);
        findPaths(root.right, path, result);
    }
}