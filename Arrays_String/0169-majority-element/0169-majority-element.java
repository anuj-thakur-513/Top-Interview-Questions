class Solution {
    // Solved using Boyer-Moore algorithm
    public int majorityElement(int[] nums) {
        // major will store the element and count will store the count of 
        // current major element, so that we can replace it
        int major = 0, count = 0;

        for(int it: nums){
            if(count == 0){
                major = it;
            }

            count += it == major ? 1 : -1;
        }   

        return major;
    }
}