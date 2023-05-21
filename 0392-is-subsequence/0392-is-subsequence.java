class Solution {
    public boolean isSubsequence(String s, String t) {
        // pointers at starting of both strings
        int i = 0, j = 0;

        // keep incrementing i whenever it is found in j
        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
            }
            j++;
        }

        // if i reaches the end of string s, then it is a subsequence
        return i == s.length();
    }
}