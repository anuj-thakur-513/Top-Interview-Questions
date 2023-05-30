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
    // variable to use in other methods
    private boolean hasPath = false;
    
    public boolean hasPathSum(TreeNode root, int targetSum) {
        dfs(root, targetSum);
        return hasPath;
    }
    
    private void dfs(TreeNode root, int targetSum){
        if(root == null) return;
        
        // we are on the leaf node and hence checking the answer
        if(root.left == null && root.right == null && targetSum - root.val == 0){
            hasPath = true;
            return;
        }
        
        dfs(root.left, targetSum - root.val);
        dfs(root.right, targetSum - root.val);
    }
}