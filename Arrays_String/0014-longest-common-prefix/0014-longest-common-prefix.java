class Solution {
    public String longestCommonPrefix(String[] strs) {
        // sort the array lexicographically
        Arrays.sort(strs);
        String first = strs[0]; // first string
        String last = strs[strs.length - 1]; // last string

        // first character of both the first and last string
        // doesn't match or the string is empty
        if(first.length() == 0 || first.charAt(0) != last.charAt(0)) {
            return "";
        }

        StringBuilder sb = new StringBuilder();
        int i = 0, j = 0;
        while(i < first.length() && j < last.length()) {
            if(first.charAt(i) == last.charAt(j)) {
                sb.append(first.charAt(i));
                i++;
                j++;
            } else {
                break;
            }
        }

        return sb.toString();
    }
}