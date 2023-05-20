class Solution {
    public int lengthOfLastWord(String s) {
        s = s.trim();
        
        // edge case
        if(s.length() == 1 && s.charAt(0) != ' ') return 1;
        int i = s.length() - 1, len = 0;
        
        while(i >= 0 && s.charAt(i) != ' '){
            i--;
            len++;
        }
        
        return len;
        
    }
}