class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int it: nums) set.add(it);

        int count = 0;
        for(int it: nums) {
            if(!set.contains(it - 1)) {
                int temp_count = 1;
                while(set.contains(it + 1)) {
                    temp_count += 1;
                    it = it + 1;
                }

                count = Math.max(count, temp_count);
            }
        }

        return count;
    }
}