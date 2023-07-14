//{ Driver Code Starts
import java.util.*;
import java.lang.*;
import java.io.*;
class GFG {
    public static void main(String[] args) throws IOException {
        BufferedReader br =
            new BufferedReader(new InputStreamReader(System.in));
        int T = Integer.parseInt(br.readLine().trim());
        while (T-- > 0) {
            String[] s = br.readLine().trim().split(" ");
            int V = Integer.parseInt(s[0]);
            int E = Integer.parseInt(s[1]);
            ArrayList<ArrayList<Integer>> adj = new ArrayList<>();
            for (int i = 0; i < V; i++) adj.add(i, new ArrayList<Integer>());
            for (int i = 0; i < E; i++) {
                String[] S = br.readLine().trim().split(" ");
                int u = Integer.parseInt(S[0]);
                int v = Integer.parseInt(S[1]);
                adj.get(u).add(v);
                adj.get(v).add(u);
            }
            Solution obj = new Solution();
            boolean ans = obj.isCycle(V, adj);
            if (ans)
                System.out.println("1");
            else
                System.out.println("0");
        }
    }
}
// } Driver Code Ends


class Solution {
    // Function to detect cycle in an undirected graph.
    public boolean isCycle(int v, ArrayList<ArrayList<Integer>> adj) {
        boolean[] visited = new boolean[v];
        int[] parent = new int[v];
        Arrays.fill(parent, -1);
        for(int i = 0; i < v; i++) {
            if(!visited[i]) {
                if(checkForCycle(adj, i, visited, parent)) {
                    return true;
                }
            }
        }
        
        return false;
    }
    
    private boolean checkForCycle(ArrayList<ArrayList<Integer>> adj, int i, boolean[] visited, int[] parent) {
        Queue<Pair> q = new LinkedList<>();
        q.offer(new Pair(i, -1));
        visited[i] = true;
        
        while(!q.isEmpty()) {
            Pair curr = q.poll();
            int node = curr.node;
            int par = curr.parent;
            
            for(int it: adj.get(node)) {
                if(!visited[it]) {
                    q.offer(new Pair(it, node));
                    visited[it] = true;
                } else if(par != it) {
                    // if adjacent node is visited and it's not parent node
                    return true;
                }
            }
        }
        
        return false;
    }
}

class Pair {
    int node;
    int parent;
    Pair(int node, int parent) {
        this.node = node;
        this.parent = parent;
    }
}