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
    List<Integer> nodes = new ArrayList<>();

    public int getMinimumDifference(TreeNode root) {
        int minDiff = Integer.MAX_VALUE;
        inOrderTraversal(root);
        
        for (int i = 1; i < nodes.size(); i++) {
            minDiff = Math.min(minDiff, Math.abs(nodes.get(i) - nodes.get(i-1)));
        }

        return minDiff;
    }

    private void inOrderTraversal(TreeNode root){
        if(root == null) return;

        inOrderTraversal(root.left);
        nodes.add(root.val);
        inOrderTraversal(root.right);
    }
}