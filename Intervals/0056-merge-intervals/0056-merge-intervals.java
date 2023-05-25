class Solution {
    public int[][] merge(int[][] intervals) {
        List<int[]> ans = new ArrayList<>();

        // sorting the intervals according to the starting value
        Arrays.sort(intervals, (a, b) -> a[0] - b[0]);
        
        // storing the start and end value to form the new intervals
        int start = intervals[0][0];
        int end = intervals[0][1];
        
        for(int[] it : intervals){
            // comparing the consecutive intervals
            if(end >= it[0]){
                end = Math.max(end, it[1]);
            } else {
                ans.add(new int[]{start, end});
                start = it[0];
                end = it[1];
            }
        }

        // adding the last interval to the ans
        ans.add(new int[]{start, end});
        return ans.toArray(new int[0][0]);
    }
}