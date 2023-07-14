# Number of Distinct Islands
## Medium
<div class="problems_problem_content__Xm_eO"><p><span style="font-size:18px">Given a boolean 2D matrix <strong>grid&nbsp;</strong>of size <strong>n</strong> * <strong>m</strong>. You have to find the number of distinct islands where a group of connected 1s (horizontally or vertically) forms an island. Two islands are considered to be distinct if and only if one island is not equal to another (not rotated or reflected).</span></p>

<p><strong><span style="font-size:18px">Example 1:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">grid[][] = {{1, 1, 0, 0, 0},
            {1, 1, 0, 0, 0},
            {0, 0, 0, 1, 1},
            {0, 0, 0, 1, 1}}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">1</span>
<span style="font-size:18px"><strong>Explanation:</strong></span>
<span style="font-size:18px">grid[][] = {{<span style="color:#ff0000">1</span>, <span style="color:#ff0000">1</span>, 0, 0, 0}, 
&nbsp;           {<span style="color:#ff0000">1</span>, <span style="color:#ff0000">1</span>, 0, 0, 0}, 
&nbsp;           {0, 0, 0, <span style="color:#ff0000">1</span>, <span style="color:#ff0000">1</span>}, 
&nbsp;           {0, 0, 0, <span style="color:#ff0000">1</span>, <span style="color:#ff0000">1</span>}}
Same colored islands are equal.
We have 2 equal islands, so we 
have only 1 distinct island.</span>

</pre>

<p><strong><span style="font-size:18px">Example 2:</span></strong></p>

<pre><span style="font-size:18px"><strong>Input:</strong></span>
<span style="font-size:18px">grid[][] = {{1, 1, 0, 1, 1},
&nbsp;           {1, 0, 0, 0, 0},
&nbsp;           {0, 0, 0, 0, 1},
&nbsp;           {1, 1, 0, 1, 1}}</span>
<span style="font-size:18px"><strong>Output:</strong></span>
<span style="font-size:18px">3</span>
<span style="font-size:18px"><strong>Explanation:
</strong>grid[][] = {{<span style="color:#ff0000">1</span>, <span style="color:#ff0000">1</span>, 0, <span style="color:#00ff00">1</span>, <span style="color:#00ff00">1</span>}, 
&nbsp;           {<span style="color:#ff0000">1</span>, 0, 0, 0, 0}, 
&nbsp;           {0, 0, 0, 0, <span style="color:#0000cd">1</span>}, 
&nbsp;           {<span style="color:#00ff00">1</span>, <span style="color:#00ff00">1</span>, 0, <span style="color:#0000ff">1</span>, <span style="color:#0000ff">1</span>}}</span>
<span style="font-size:18px">Same colored islands are equal.
We have 4 islands, but 2 of them
are equal, So we have 3 distinct islands.</span>

</pre>

<p><span style="font-size:18px"><strong>Your Task:</strong></span></p>

<p><span style="font-size:18px">You don't need to read or print anything. Your task is to complete the function <strong>countDistinctIslands()&nbsp;</strong>which takes the <strong>grid</strong> as an input parameter and returns the total number of <strong>distinct</strong> islands.</span></p>

<p><span style="font-size:18px"><strong>Expected Time Complexity:&nbsp;</strong>O(n * m)<br>
<strong>Expected Space Complexity:&nbsp;</strong>O(n * m)</span></p>

<p><span style="font-size:18px"><strong>Constraints:</strong><br>
1 ≤ n, m ≤ 500<br>
grid[i][j] == 0 or grid[i][j] == 1</span></p>

<ul>
</ul>
</div>