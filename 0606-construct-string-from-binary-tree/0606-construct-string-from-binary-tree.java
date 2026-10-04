class Solution {
    public String tree2str(TreeNode root) {
        if (root == null) {
            return "";
        }

        String result = root.val + "";

        if (root.left != null) {
            result += "(" + tree2str(root.left) + ")";
        }

        if (root.right != null) {
            if (root.left == null) {
                result += "()";
            }
            result += "(" + tree2str(root.right) + ")";
        }

        return result;
    }
}