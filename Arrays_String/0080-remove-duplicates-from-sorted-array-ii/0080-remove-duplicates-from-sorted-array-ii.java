class Solution {
    public int removeDuplicates(int[] nums) {
        int n = nums.length;
        int k = 2; //length of the sliding window -> bcs at max we can have 2 occurences
        if(n <= k) return n; 

        int slow = k;
        // we start for loop from k index because at first 2 places it can be at most 2 occurences
        // of same integer which is allowed
        for(int fast = slow; fast < n; fast++){
            if(nums[fast] != nums[slow-k]) {
               nums[slow++] = nums[fast];
            }
       }
       return slow;
    }
}