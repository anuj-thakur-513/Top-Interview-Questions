# Detect cycle in a directed graph
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size: 18px;">Given a Directed Graph with <strong>V</strong> vertices (Numbered from <strong>0</strong> to <strong>V-1</strong>) and <strong>E</strong> edges, check whether it contains any cycle or not.</span></p>
<p><br><span style="font-size: 18px;"><strong>Example 1:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong></span>

<span style="font-size: 18px;"><img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700218/Web/Other/9a013355-2510-4ab0-b554-1a2b9f6cb44f_1685086462.png" alt=""></span>

<span style="font-size: 18px;"><strong>Output:</strong> 1
<strong>Explanation</strong>: 3 -&gt; 3 is a cycle</span></pre>
<p><br><span style="font-size: 18px;"><strong>Example 2:</strong></span></p>
<pre><span style="font-size: 18px;"><strong>Input:</strong></span>
<img src="https://media.geeksforgeeks.org/img-practice/PROD/addEditProblem/700218/Web/Other/b1096e14-7c18-47d8-a4e9-8dd42b2e466f_1685086462.png" alt="">

<span style="font-size: 18px;"><strong>Output:</strong> 0
<strong>Explanation</strong>: no cycle in the graph</span></pre>
<p><br><span style="font-size: 18px;"><strong>Your task:</strong></span><br><span style="font-size: 18px;">You dont need to read input or print anything. Your task is to complete the function&nbsp;<strong>isCyclic()</strong> which takes the integer V denoting the number of vertices and adjacency list <strong>adj</strong> as input parameters and returns a boolean value denoting if the given directed graph contains a cycle or not.<br>In the adjacency list <strong>adj,</strong> element&nbsp;<strong>adj[i][j]</strong> represents an edge from&nbsp;<strong>i </strong>to<strong> j.</strong></span></p>
<p><br><span style="font-size: 18px;"><strong>Expected Time Complexity:&nbsp;</strong>O(V + E)<br><strong>Expected Auxiliary Space:&nbsp;</strong>O(V)</span></p>
<p><br><span style="font-size: 18px;"><strong>Constraints:</strong><br>1 ≤ V, E ≤ 10<sup>5</sup></span></p></div>