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
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        int preLen = preorder.length, inLen = inorder.length;
        // map to store the indices of inorder traversal for root
        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i = 0; i < inLen; i++){
            map.put(inorder[i], i);
        }

        TreeNode root = buildTree(preorder, 0, preLen - 1, inorder, 0, inLen - 1, map);

        return root;
    }

    private TreeNode buildTree(int[] preorder, int preStart, int preEnd, int[] inorder, int inStart, int inEnd, HashMap<Integer, Integer> inMap){
        // base case
        if(preStart > preEnd || inStart > inEnd){
            return null;
        }

        // getting the root from preorder traversal
        TreeNode root = new TreeNode(preorder[preStart]);
        // getting the index of root node in inorder traversal
        int inRoot = inMap.get(root.val);

        // now left to the root in inorder traversal is part of left subtree
        int remainingLeft = inRoot - inStart;

        // building left and right subtrees
        root.left = buildTree(preorder, preStart + 1, preStart + remainingLeft, inorder, inStart, inRoot - 1, inMap);
        root.right = buildTree(preorder, preStart + remainingLeft + 1, preEnd, inorder, inRoot + 1, inEnd, inMap);

        return root;
    }
}