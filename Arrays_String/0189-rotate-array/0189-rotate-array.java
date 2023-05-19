class Solution {
    public void rotate(int[] nums, int k) {
        // first reverse the last k elements
        // then reverse the first k elements
        // then reverse the whole array
        int len = nums.length;
        k = k % len;
        reverse(nums, len-k, len);
        reverse(nums, 0, len-k);
        reverse(nums, 0, len);
    }

    private void reverse(int[] nums, int start, int end){
        int j = end - 1;

        for(int i = start; start < j; start++){
            int temp = nums[start];
            nums[start] = nums[j];
            nums[j] = temp;
            j--;
        }
    }
}