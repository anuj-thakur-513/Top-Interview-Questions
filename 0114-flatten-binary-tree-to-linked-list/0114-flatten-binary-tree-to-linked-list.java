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
    public void flatten(TreeNode root) {
        flattenHelper(root); // Call the recursive helper function
    }

    private TreeNode flattenHelper(TreeNode root) {
        if (root == null) { // Base case: if the current node is null, return null
            return null;
        }
    
        // Recursively flatten the left and right subtrees
        TreeNode leftTail = flattenHelper(root.left);
        TreeNode rightTail = flattenHelper(root.right);
    
        // If the left subtree was flattened, merge it with the current node
        if (leftTail != null) {
            leftTail.right = root.right; // Connect the right subtree of the left tail to the right subtree of the current node
            root.right = root.left; // Make the left subtree the new right subtree of the current node
            root.left = null; // Set the left child of the current node to null
        }
    
        // If the right subtree was flattened, return its tail node
        if (rightTail != null) {
            return rightTail;
        }
    
        // If only the left subtree was flattened, return its tail node
        if (leftTail != null) {
            return leftTail;
        }
    
        // If neither subtree was flattened, return the current node as the tail node
        return root;
    }
}