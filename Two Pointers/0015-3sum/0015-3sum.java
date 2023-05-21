class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(nums);

        for(int i = 0; i < nums.length; i++){
            if(i == 0 || nums[i] != nums[i - 1]){
                int left = i + 1, right = nums.length - 1;
                int sum = 0 - nums[i];

                while(left < right){
                    if(nums[left] + nums[right] < sum){
                        left++;
                    } else if(nums[left] + nums[right] > sum){
                        right--;
                    } else{
                        ans.add(Arrays.asList(nums[i], nums[left], nums[right]));
                        // now skip the same elements
                        while(left < right && nums[left] == nums[left + 1]) left++;
                        while(left < right && nums[right] == nums[right - 1]) right--;
                        left++;
                        right--;
                    }
                }
            }
        }

        return ans;
    }
}