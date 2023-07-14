# Detect cycle in an undirected graph
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given an undirected graph with V vertices and E edges, check whether it contains any cycle or not. Graph is in the form of adjacency list where adj[i] contains all the nodes ith node is having edge with.<strong><img src="C:\Users\Mukul kumar\Desktop\GFG_PIC.JPG" alt=""></strong></span></p>
<p><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong><strong>&nbsp;&nbsp;
</strong>V = 5, E = 5
adj = {{1}, {0, 2, 4}, {1, 3}, {2, 4}, {1, 3}}<strong>&nbsp;</strong>
<strong>Output: </strong>1
<strong>Explanation:</strong> 
</span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700219/Web/Other/891791f9-1abb-45b1-80f2-7af46d73dcd2_1685086491.png" alt="">
<span style="font-size: 18px;">1-&gt;2-&gt;3-&gt;4-&gt;1 is a cycle.</span>
</pre>
<p><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input: 
</strong>V = 4, E = 2
adj = {{}, {2}, {1, 3}, {2}}</span>
<strong><span style="font-size: 18px;">Output: </span></strong><span style="font-size: 18px;">0
<strong>Explanation: 
</strong></span><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700219/Web/Other/d8cbd97e-406e-4f50-a38c-6a58747df876_1685086491.png" alt="">
<span style="font-size: 18px;">No cycle in the graph.</span>
</pre>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Your Task:</strong><br>You don't need to read or print anything. Your task is to complete the function <strong>isCycle()&nbsp;</strong>which takes V denoting the number of vertices and adjacency list as input parameters and returns a boolean value denoting if the undirected graph contains any cycle or not, return 1 if a cycle is present else return 0.</span></p>
<p><strong><span style="font-size: 18px;">NOTE:&nbsp;</span></strong><span style="font-size: 18px;">The&nbsp;adjacency list denotes the edges of the graph where edges[i] stores all other vertices to which ith vertex is connected.</span></p>
<p>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(V + E)<br><strong>Expected Space Complexity:&nbsp;</strong>O(V)</span></p>
<p><br>&nbsp;</p>
<p><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ V, E ≤ 10<sup>5</sup></span></p></div>