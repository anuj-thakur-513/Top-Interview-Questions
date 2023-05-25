class Solution {
    public int[][] insert(int[][] intervals, int[] newInterval) {
        intervals = insertInterval(intervals, newInterval);
        int n = intervals.length;
        List<int[]> answer = new ArrayList<>();
        
        for(int i = 0; i < n; i++) {
            int[] currInterval = {intervals[i][0], intervals[i][1]};
            // Merge until the list gets exhausted or no overlap is found.
            while (i < intervals.length && doesIntervalsOverlap(currInterval, intervals[i])) {
                currInterval = mergeIntervals(currInterval, intervals[i]);
                i++;
            }
            // Decrement to ensure we don't skip the interval due to outer for-loop incrementing.
            i--;
            answer.add(currInterval);
        }

        return answer.toArray(new int[0][0]);
    }

    private int[][] insertInterval(int[][] intervals, int[] newInterval) {
        boolean isInserted = false;
        List<int[]> list = new ArrayList<>(Arrays.asList(intervals));
        int n = intervals.length;

        for(int i = 0; i < n; i++) {
            if(newInterval[0] < intervals[i][0]) {
                // found the position
                list.add(i, newInterval);
                isInserted = true;
                break;
            }
        }

        // if there is no interval with a greater value, insert at last
        if(!isInserted) {
            list.add(newInterval);
        }

        return list.toArray(new int[0][0]);
    }
    
    private int[] mergeIntervals(int[] a, int[] b) {
        int[] newInterval = {Math.min(a[0], b[0]), Math.max(a[1], b[1])};
        return newInterval;
    }

    private boolean doesIntervalsOverlap(int[] intervalA, int[] intervalB) {
        // Find the end of the earlier interval
        int endOfEarlierInterval = Math.min(intervalA[1], intervalB[1]);
        // Find the start of the later interval
        int startOfLaterInterval = Math.max(intervalA[0], intervalB[0]);
        // If the end of the earlier interval is greater than or equal to the start of the later interval,
        // then the intervals overlap
        return endOfEarlierInterval >= startOfLaterInterval;
    }

}