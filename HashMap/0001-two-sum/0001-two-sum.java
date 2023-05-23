class Solution {
    public int[] twoSum(int[] nums, int target) {
        int x=target;
        int[] a = new int[2];
        int i;
        int k=nums.length;
        HashMap<Integer,Integer> diff=new HashMap<>();
        for(i = 0; i < k; i++){
            if(diff.containsKey(target - nums[i])){
                a[0] = diff.get(target - nums[i]);
                a[1] = i;
                break;
            }
            diff.put(nums[i], i);
        }
 
        return a;
    }
}