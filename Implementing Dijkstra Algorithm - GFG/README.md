# Implementing Dijkstra Algorithm
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a weighted, undirected and connected graph of <strong>V</strong> vertices and an adjacency list adj where adj[i] is a list of lists containing two integers where the<strong> first </strong>integer of each list <strong>j</strong>&nbsp;denotes there is <strong>edge</strong> between i and j&nbsp;,&nbsp;second integers corresponds to the <strong>weight</strong> of that&nbsp;&nbsp;edge .&nbsp;You are given the source vertex <strong>S</strong> and You to&nbsp;Find the shortest distance of all the vertex's from the source vertex <strong>S</strong>.&nbsp;You have to return a list of integers denoting shortest distance between <strong>each node</strong> and Source vertex<strong> S</strong>.</span><br>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Note: </strong>The Graph doesn't contain any negative weight cycle.</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong></span>
<span style="font-size: 18px;"><strong>V </strong>= 2
<strong>adj [] </strong>=<strong> </strong>{{{1, 9}}, {{0, 9}}}
<strong>S </strong>= 0</span>
<span style="font-size: 18px;"><strong>Output:</strong>
0 9
<strong>Explanation</strong>:
</span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700334/Web/Other/6a77963c-f9a6-4cf4-953c-19a2759a52a3_1685086564.png" alt="">
<span style="font-size: 18px;">The source vertex is 0. Hence, the shortest 
distance of node 0 is 0 and the shortest 
distance from node 1 is 9.</span>
</pre>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:
V </strong>= 3, <strong>E</strong> = 3
<strong>adj</strong> = {{{1, 1}, {2, 6}}, {{2, 3}, {0, 1}}, {{1, 3}, {0, 6}}}</span>
<span style="font-size: 18px;"><strong>S </strong>= 2</span>
<span style="font-size: 18px;"><strong>Output:</strong>
4 3 0
<strong>Explanation</strong>:
</span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700334/Web/Other/8c9ee3a2-a7d3-4028-ae22-a22ddb6ab7a3_1685086565.png" alt="">
<span style="font-size: 18px;">For nodes 2 to 0, we can follow the path-
2-1-0. This has a distance of 1+3 = 4,
whereas the path 2-0 has a distance of 6. So,
the Shortest path from 2 to 0 is 4.
The shortest distance from 0 to 1 is 1 .</span>
</pre>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read input or print anything. Your task is to complete the function&nbsp;<strong>dijkstra()</strong>&nbsp;</span> <span style="font-size: 18px;">which takes the number of vertices V<strong> </strong>and<strong>&nbsp;</strong>an adjacency list adj as input parameters&nbsp;and Source vertex S returns a list of integers, where ith integer denotes the shortest distance of the ith node from the Source node. </span> <span style="font-size: 18px;">Here adj[i] contains a list of lists containing two integers where the first integer j denotes that there is an edge between i and j and the second integer w denotes that the weight between edge i and j is w.</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:</strong>&nbsp;O(V<sup>2</sup>).<br><strong>Expected Auxiliary Space:</strong>&nbsp;O(V<sup>2</sup>).</span></p>
<p>&nbsp;</p>
<div><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 </span> <span style="font-size: 18px;">≤</span> <span style="font-size: 18px;"> V </span> <span style="font-size: 18px;">≤</span> <span style="font-size: 18px;"> 1000<br>0 </span> <span style="font-size: 18px;">≤</span> <span style="font-size: 18px;"> adj[i][j] </span> <span style="font-size: 18px;">≤</span> <span style="font-size: 18px;"> 1000</span></div>
<div><span style="font-size: 18px;">1 ≤&nbsp;adj.size()&nbsp;≤ [ (V*(V - 1)) / 2 ]<br>0 </span> <span style="font-size: 18px;">≤</span> <span style="font-size: 18px;"> S &lt; V</span></div></div>