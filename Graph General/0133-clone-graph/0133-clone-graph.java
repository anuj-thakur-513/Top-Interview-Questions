/*
// Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        // edge cases
        if(node == null) return null;
        if(node.neighbors.size() == 0) return new Node(node.val);

        Node[] vis = new Node[101]; // to check whether the node is created or not
        Arrays.fill(vis, null);
        int val1 = node.val;

        Node cloned = new Node(val1);
        vis[val1] = cloned;
        Queue<Node[]> queue = new LinkedList<>();
        queue.add(new Node[]{node, cloned}); // original node and cloned node

        while(!queue.isEmpty()) {
            Node[] curr = queue.poll();
            Node orgNode = curr[0];
            Node clonedNode = curr[1];

            for(Node adj: orgNode.neighbors) {
                int val = adj.val;
                Node newAdj = null;
                if(vis[val] == null) {
                    newAdj = new Node(val);
                    vis[val] = newAdj;
                    queue.add(new Node[]{adj, newAdj});
                } else {
                    newAdj = vis[val];
                }
                clonedNode.neighbors.add(newAdj);
            }

        }

        return cloned;
    }
}