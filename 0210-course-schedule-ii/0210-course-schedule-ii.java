class Solution {
    public int[] findOrder(int v, int[][] prerequisites) {
        // creating a directed graph
        int m = prerequisites.length;
        ArrayList<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }
        for(int[] edge: prerequisites){
            adj.get(edge[1]).add(edge[0]);
        }

        // setting up the indegree array for topological sort
        int[] indegree = new int[v];
        for(int i = 0; i < v; i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        List<Integer> topo = new ArrayList<>();
        for(int i = 0; i < v; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        while(!q.isEmpty()){
            int node = q.poll();
            topo.add(node);

            for(int it: adj.get(node)){
                indegree[it]--;
                if(indegree[it] == 0){
                    q.offer(it);
                }
            }
        }

        if(topo.size() != v){
            return new int[0];
        } 

        int[] ans = new int[v];
        for(int i = 0; i < v; i++){
            ans[i] = topo.get(i);
        }

        return ans;
    }
}