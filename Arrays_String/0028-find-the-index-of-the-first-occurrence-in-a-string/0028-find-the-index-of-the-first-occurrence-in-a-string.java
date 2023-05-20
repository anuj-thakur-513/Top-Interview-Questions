class Solution {
    // string matching can be done using sliding window
    public int strStr(String haystack, String needle) {
        int hayLen = haystack.length();
        int needLen = needle.length();

        for(int left = 0; left <= hayLen - needLen; left++) {
            for(int i = 0; i < needLen; i++) {
                if(needle.charAt(i) != haystack.charAt(left + i)) {
                    break;
                }
                if(i == needLen - 1) {
                    return left;
                }
            }
        }

        return -1;
    }
}