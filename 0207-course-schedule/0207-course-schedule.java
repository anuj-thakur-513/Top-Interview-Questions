class Solution {
    public boolean canFinish(int v, int[][] prerequisites) {
        // form a graph
        ArrayList<List<Integer>> adj = new ArrayList<>();
        for(int i = 0; i < v; i++){
            adj.add(new ArrayList<>());
        }   
        int m = prerequisites.length;
        for(int i = 0; i < m; i++){
            adj.get(prerequisites[i][1]).add(prerequisites[i][0]);
        }

        int[] indegree = new int[v];
        for(int i = 0; i < v; i++){
            for(int it: adj.get(i)){
                indegree[it]++;
            }
        }

        Queue<Integer> q = new LinkedList<>();
        for(int i = 0; i < v; i++){
            if(indegree[i] == 0){
                q.offer(i);
            }
        }

        List<Integer> topo = new ArrayList<>();
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

        if(topo.size() == v) return true;
        return false;
    }
}