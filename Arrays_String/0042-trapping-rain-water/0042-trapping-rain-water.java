class Solution {
    /**
        We will basically calculate both right max and left max
        for every index of the array.
        After that it'll be easy to calculate the water stored at every index
     */
    public int trap(int[] height) {
        int n = height.length;
        int[] leftMax = new int[n];
        int[] rightMax = new int[n];
        int max = -1;
        for(int i = 0; i < n; i++) {
            max = Math.max(max, height[i]);
            leftMax[i] = max;
        }

        max = -1;
        for(int i = n-1; i >= 0; i--) {
            max = Math.max(max, height[i]);
            rightMax[i] = max;
        }

        int trappedWater = 0;
        for(int i = 0; i < n; i++) {
            trappedWater += Math.min(leftMax[i], rightMax[i]) - height[i];
        }

        return trappedWater;
    }
}