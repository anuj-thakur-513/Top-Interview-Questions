class Solution {
    public int maxArea(int[] height) {
        int area = 0, left = 0, right = height.length - 1;

        while(left < right){
            int curr_area = Math.min(height[left], height[right]) * (right - left);
            area = Math.max(area, curr_area);
            if(height[left] < height[right]){
                left++;
            } else{
                right--;
            }
        }

        return area;
    }
}