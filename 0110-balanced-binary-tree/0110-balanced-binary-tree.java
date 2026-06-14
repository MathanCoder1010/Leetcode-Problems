class Solution {

    public boolean isBalanced(TreeNode root) {

        if (root == null) {
            return true;
        }

        int leftHeight = height(root.left);
        int rightHeight = height(root.right);

        if (Math.abs(leftHeight - rightHeight) > 1) {
            return false;
        }

        return isBalanced(root.left) && isBalanced(root.right);
    }

    public int height(TreeNode node) {

        if (node == null) {
            return 0;
        }

        int left = height(node.left);
        int right = height(node.right);

        return Math.max(left, right) + 1;
    }
}