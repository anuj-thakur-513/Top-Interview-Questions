class Solution {
    public int lengthOfLongestSubstring(String s) {
        // as we need unique characters in the substring, we'll 
        // use a hashset
        // as we have to return length of substring we can use sliding window
        HashSet<Character> set = new HashSet<>();
        int n = s.length();
        if(n <= 1) {
            return n;
        }
        
        int left = 0, right = 0, maxLen = 0;
        while(right < n) {
            if(!set.contains(s.charAt(right))) {
                set.add(s.charAt(right));
                right++;
                maxLen = Math.max(maxLen, set.size());
            } else {
                set.remove(s.charAt(left));
                left++;
            }
        }

        return maxLen;
    }
}