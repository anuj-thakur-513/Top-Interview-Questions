class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        
        // create an array of size 256 to keep track of characters
        int[] frequency = new int[256];
        Arrays.fill(frequency, 0); // initialize the array with 0s
        
        // +1 at the index of character
        for(int i = 0; i < s.length(); i++){
            frequency[s.charAt(i)]++;
        }
        
        // -1 at the index of character
        for(int i = 0; i < t.length(); i++){
            frequency[t.charAt(i)]--;
        }
        
        // checking if there is number instead of 0 present at any index, if yes return false
        for(int i = 0; i < 256; i++){
            if(frequency[i] != 0) return false;
        }
        
        return true;
    }
}