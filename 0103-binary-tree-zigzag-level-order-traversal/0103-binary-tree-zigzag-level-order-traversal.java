class Solution {
    public List<List<Integer>> zigzagLevelOrder(TreeNode root) {
        List<List<Integer>> res = new ArrayList<>(2000);
        if(root == null) {
            return res;
        }
        Queue<TreeNode> q = new ArrayDeque<>(1000);
        q.offer(root);
        int c = 0;
        while(!q.isEmpty()) {
            int size = q.size();
            List<Integer> temp = new ArrayList<>();
            for(int i = 0; i < size; i++) {
                TreeNode node = q.poll();
                temp.add(node.val);
                if(node.left != null) {
                    q.offer(node.left);
                }
                if(node.right != null) {
                    q.offer(node.right);
                }
            }
            if(c%2 == 1) {
                Collections.reverse(temp);
            }
            c++;
            res.add(temp);
        }
        return res;
    }
}