class Solution {
    // as the given input array is sorted, we simply use two pointers
    // move right pointer if the target sum is lesser than output
    // move left pointer if the target sum is greater than output

    public int[] twoSum(int[] numbers, int target) {
        int left = 0, right = numbers.length - 1;

        while(left < right){
            if(numbers[left] + numbers[right] == target){
                return new int[]{left + 1, right + 1};
            } else if(numbers[left] + numbers[right] < target){
                left++;
            } else{
                right--;
            }
        }
        
        return new int[]{-1, -1};
    }
}