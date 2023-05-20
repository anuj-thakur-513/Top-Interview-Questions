class Solution {
    public String reverseWords(String s) {
        s = s.trim(); // remove trailing spaces
        StringBuilder sb = new StringBuilder();

        int i = s.length() - 1;
        while(i >= 0) {
            // skipping the white space
            if(s.charAt(i) == ' ') {
                i--;
                continue;
            }

            int j = i + 1; // keep track of last character of the word
            while(i >= 0 && s.charAt(i) != ' ') {
                i--;
            }

            if(sb.isEmpty()) {
                sb.append(s.substring(i + 1, j));
            } else {
                sb.append(" ");
                sb.append(s.substring(i + 1, j));
            }
        }

        return sb.toString();
    }
}