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
    int ans = 0;
    public int sumNumbers(TreeNode root) {
        if(root == null) {
            return 0;
        }

        int rootVal = root.val;
        solve(root, rootVal);
        return ans;
    }

    private void solve(TreeNode node, int temp) {
        // base case
        if(node.left == null && node.right == null) {
            ans += temp;
        }

        if(node.left != null) {
            solve(node.left, temp * 10 + node.left.val);
        }   
        if(node.right != null) {
            solve(node.right, temp * 10 + node.right.val);
        }
    }
}