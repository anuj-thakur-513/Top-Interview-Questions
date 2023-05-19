class Solution {
    public int[] productExceptSelf(int[] nums) {
        int len = nums.length;
        int[] right = new int[len];
        int[] left = new int[len];
        int[] ans = new int[len];
        int product = 1;

        for(int i = len - 1; i >= 0; i--) {
            product *= nums[i];
            right[i] = product;
        }

        product = 1;
        for(int i = 0; i < len; i++) {
            product *= nums[i];
            left[i] = product;
        }

        for(int i = 0; i < len; i++) {
            if(i == 0) {
                ans[i] = right[1];
            } else if(i == len - 1) {
                ans[i] = left[len - 2];
            } else {
                ans[i] = left[i - 1] * right[i + 1];
            }
        }

        return ans;
    }
}