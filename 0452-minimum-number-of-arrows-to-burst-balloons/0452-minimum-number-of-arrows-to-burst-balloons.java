public class Solution {
    public int findMinArrowShots(int[][] points) {
        // Sort the balloons by their end position
        Arrays.sort(points, Comparator.comparingInt(o -> o[1]));
        int arrows = 1;
        
        // Keep track of the end position of the last balloon that was burst
        int end = points[0][1];

        for (int i = 1; i < points.length; i++) {
            // If the start position of the current balloon is
            // greater than the end position of the last balloon it is burst
            if (points[i][0] > end) {
                // Shoot a new arrow and update the end position
                arrows++;
                end = points[i][1];
            }
        }
        
        // Return the minimum number of arrows required
        return arrows;
    }
}
