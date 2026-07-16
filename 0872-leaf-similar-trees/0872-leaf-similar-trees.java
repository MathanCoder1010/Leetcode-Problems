import java.util.ArrayList;
import java.util.List;

class Solution {
    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> leaves1 = new ArrayList<>();
        List<Integer> leaves2 = new ArrayList<>();
        
        collectLeaves(root1, leaves1);
        collectLeaves(root2, leaves2);
        
        return leaves1.equals(leaves2);
    }
    
    private void collectLeaves(TreeNode node, List<Integer> leavesList) {
        if (node == null) {
            return;
        }
        
        if (node.left == null && node.right == null) {
            leavesList.add(node.val);
            return;
        }
        
        collectLeaves(node.left, leavesList);
        collectLeaves(node.right, leavesList);
    }
}