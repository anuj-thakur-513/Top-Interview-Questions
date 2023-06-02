/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> inorderNodes = new ArrayList<>();
        dfs(inorderNodes, root);
        return inorderNodes.get(k - 1);
    }

    private void dfs(List<Integer> inorderNodes, TreeNode root) {
        if(root == null) {
            return;
        }

        dfs(inorderNodes, root.left);
        inorderNodes.add(root.val);
        dfs(inorderNodes, root.right);
    }
}