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
    // a simple bfs will work, and we'll keep adding the rightmost 
    // node to the answer
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> ans = new ArrayList<>();
        // edge case when root itself is null
        if(root == null) {
            return ans;
        }
        
        bfs(root, ans);
        return ans;
    }

    private void bfs(TreeNode root, ArrayList<Integer> ans) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while(!queue.isEmpty()) {
            int size = queue.size();

            for(int i = 0; i < size; i++) {
                TreeNode curr = queue.poll();
                if(i == size - 1) {
                    ans.add(curr.val);
                }

                if(curr.left != null) {
                    queue.offer(curr.left);
                }
                if(curr.right != null) {
                    queue.offer(curr.right);
                }
            }
        }
    }
}