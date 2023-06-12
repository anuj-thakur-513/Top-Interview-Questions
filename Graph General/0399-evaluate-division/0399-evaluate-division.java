class Solution {
    // a hashmap to create the weighted graph
    HashMap<String, List<Node>> map;

    public double[] calcEquation(List<List<String>> equations, double[] values, List<List<String>> queries) {
        map = new HashMap<>();
        int n = equations.size(); // edges
        int m = queries.size();
        double[] res = new double[m];

        // construct the graph
        for(int i = 0; i < n; i++) {
            List<String> equation = equations.get(i);
            update(equation.get(0), equation.get(1), values[i]);
            update(equation.get(1), equation.get(0), 1/values[i]);
        }

        // solve the queries
        for(int i = 0; i < m; i++) {
            List<String> query = queries.get(i);
            res[i] = dfs(query.get(0), query.get(1), 1, new HashSet<String>());
        }

        return res;
    }

    private double dfs(String src, String target, double curr, HashSet<String> visited) {
        var nodes = map.get(src);
        double res = -1.0;
        if(nodes == null || visited.contains(src)) {
            return res;
        }

        if(src.equals(target)) {
            return curr;
        }

        visited.add(src);
        for(Node node: nodes) {
            double current = curr * node.val;
            res = dfs(node.key, target, current, visited);
            if(res != -1) {
                return res;
            }
        }

        return -1;
    }

    private void update(String u, String v, double val) {
        var list = map.get(u);
        if(list == null) {
            list = new ArrayList<Node>();
        }

        list.add(new Node(v, val));
        map.put(u, list);
    }
}

// basic structure of node
class Node {
    String key;
    double val;
    Node(String key, double val) {
        this.key = key;
        this.val = val;
    }
}