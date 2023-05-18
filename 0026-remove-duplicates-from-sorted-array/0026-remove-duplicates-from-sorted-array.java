class Solution {
    public int removeDuplicates(int[] nums) {
        int ptr = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[ptr] != nums[i]){
                nums[++ptr] = nums[i];
            }
        }
        
        return ptr + 1;
    }
}