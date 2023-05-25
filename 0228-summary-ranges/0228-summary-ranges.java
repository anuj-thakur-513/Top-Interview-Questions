class Solution {
    public List<String> summaryRanges(int[] nums) {
        List<String> ans = new ArrayList<>();
        int length = nums.length;
        
        for(int i = 0; i < length; i++){
            int num = nums[i];
            while(i < length - 1 && nums[i] + 1 == nums[i + 1]){
                i++;
            }
            if(num != nums[i]){
                ans.add(num + "->" + nums[i]);
            } else {
                ans.add(num + "");
            }
        }
        return ans;       
    }
}