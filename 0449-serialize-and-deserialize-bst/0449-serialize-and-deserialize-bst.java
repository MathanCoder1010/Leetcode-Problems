public class Codec {

    public String serialize(TreeNode root) {
        if (root == null) {
            return "";
        }

        return root.val + "," +
               serialize(root.left) +
               serialize(root.right);
    }

    public TreeNode deserialize(String data) {
        if (data.equals("")) {
            return null;
        }

        String[] values = data.split(",");
        java.util.Queue<Integer> queue = new java.util.LinkedList<>();

        for (String value : values) {
            queue.add(Integer.parseInt(value));
        }

        return buildTree(queue, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    private TreeNode buildTree(java.util.Queue<Integer> queue, int min, int max) {

        if (queue.isEmpty()) {
            return null;
        }

        int value = queue.peek();

        if (value < min || value > max) {
            return null;
        }

        queue.poll();

        TreeNode root = new TreeNode(value);

        root.left = buildTree(queue, min, value - 1);
        root.right = buildTree(queue, value + 1, max);

        return root;
    }
}