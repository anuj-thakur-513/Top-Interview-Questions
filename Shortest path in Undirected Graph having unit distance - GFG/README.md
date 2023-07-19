# Shortest path in Undirected Graph having unit distance
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">You are given an Undirected Graph having unit weight, Find the shortest path from src to all the vertex and if it is unreachable to reach any vertex, then return -1 for that vertex.</span></p>

<p><span style="font-size:18px"><strong>Example:</strong></span></p>

<pre><span style="font-size:18px">Input:
n = 9, m= 10
edges=[[0,1],[0,3],[3,4],[4 ,5]
,[5, 6],[1,2],[2,6],[6,7],[7,8],[6,8]] 
src=0
Output:
0 1 2 1 2 3 3 4 4</span>
</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong></span></p>

<p><span style="font-size:18px">You don't need to print or input anything. Complete the function <strong>shortest path()&nbsp;</strong>which takes a 2d vector or array <strong>edges</strong> representing the edges of undirected graph with unit weight, an&nbsp;integer<strong> N </strong>as number nodes, an integer <strong>M</strong> as number of edges&nbsp;and an integer <strong>src&nbsp;</strong>as the input parameters and returns an integer array or vector, denoting&nbsp;<strong>the vector of distance from src to all nodes.</strong></span></p>

<p><span style="font-size:18px"><strong>Constraint:</strong><br>
1&lt;=n,m&lt;=100<br>
1&lt;=adj[i][j]&lt;=100</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity: </strong>O(N + E), where N is the number of nodes and E is edges</span><br>
<span style="font-size:18px"><strong>Expected Space Complexity: </strong>O(N)</span></p>
</div>